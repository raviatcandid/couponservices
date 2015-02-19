/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.service.v1;

import com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument;
import com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument;
import com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument;
import com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument;
import com.excentus.en.webservice.offers.*;
import com.excentus.en.webservice.tenders.TendersDocument;
import com.icoke.coupon.service.v1.excentus.GasBuddyResponse;
import com.icoke.coupon.service.v1.excentus.WSSEHeaderWebServiceMessageCallback;
import com.icoke.coupon.util.GUIDGenerator;
import com.icoke.coupon.webservices.ServiceException;
import com.icoke.coupon.webservices.ServiceStatus;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.api.json.JSONConfiguration;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.validator.routines.checkdigit.LuhnCheckDigit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.WebServiceMessageFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.annotation.PostConstruct;
import javax.ws.rs.core.MediaType;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


/**
 * Implementation of services for Excentus coupons
 *
 * Endpoint for posting request messages in RM Staging/Test environment:
 *   https://www.xperks.net/ENWeb/services/ENWebServiceSOAP
 * Endpoint for posting request messages in RM Production environment:
 *   https://www.fuelperx.net/ENWeb/services/ENWebServiceSOAP
 *
 *   STAGING:
 *    https://108.166.37.217 port 22
 *    Participant ID: MCR145
 *    Site ID: 145
 *    Username: 145
 *    Password: MCR145!
 *
 *    Staging SFTP credentials for RA retrieval
 *    User: 125560668_MCR145
 *    Password: cre668mcr145@s!
 *
 *   PRODUCTION:
 *    https://98.129.180.196 port 22
 *    Participant ID: MCR145
 *    Site ID: 145
 *    Username: 145
 *    Password: MCR145!
 *
 *    Production SFTP credentials for RA retrieval
 *    User: 340185_MCR145
 *    Password: cre185mcr145@p!
 *
 *
 * @author <a href="jopeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
@Component("excentusCouponService_v1")
public class ExcentusCouponService extends WebServiceGatewaySupport implements CouponService {
    private static final Logger LOGGER = LogManager.getLogger(ExcentusCouponService.class);

    @Value( "${excentus.processorCode:\"excentus\"}")
    private String processorCode;
    @Value( "${excentus.siteId}")
    private String siteId;
    @Value( "${excentus.password}")
    private String password;
    @Value( "${excentus.dateFormat}")
    private String dateFormat;
    @Value( "${excentus.batchId}")
    private String batchId;
    @Value( "${excentus.registerId}")
    private long registerId;
    @Value( "${excentus.referenceId}")
    private String referenceId;
    @Value( "${excentus.totalTransactionAmount}")
    private BigDecimal totalTransactionAmount;
    @Value( "${excentus.taxAmount}")
    private BigDecimal taxAmount;
    @Value( "${excentus.rewardEligibleAmount}")
    private BigDecimal rewardEligibleAmount;
    @Value( "${excentus.tenderType}")
    private String tenderType;
    @Value( "${excentus.cardType}")
    private String cardType;
    @Value( "${excentus.amount}")
    private BigDecimal amount;
    @Value( "${excentus.retry}")
    private int retry;
    @Value( "${excentus.code}")
    private String code;
    @Value( "${excentus.sponsor}")
    private String sponsor;
    @Value( "${excentus.unitType}")
    private String unitType;
    @Value( "${excentus.units}")
    private BigDecimal units;
    @Value( "${excentus.rewardUnits}")
    private BigDecimal rewardUnits;
    @Value( "${excentus.endpoint}")
    private String endpoint;
    @Value( "${excentus.gasbuddy.enabled:true}" )
    private boolean gasBuddyEnabled;
    @Value( "${excentus.gasbuddy.endpoint}")
    private String gasBuddyEndpoint;
    @Value( "${excentus.gasbuddy.authToken}")
    private String gasBuddyAuthToken;

    @Autowired
    private Marshaller marshaller;
    @Autowired
    private Unmarshaller unmarshaller;

    @Autowired
    private CouponServiceFactory serviceFactory;

    // Excentus cards have check-digit
    private LuhnCheckDigit luhnCheckDigit;

    // for parsing dates
    private SimpleDateFormat formatter;

    // for making REST calls to GasBuddy
    private WebResource service;


    @PostConstruct
    public void postConstruct() {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Registering service " + processorCode);
        }

        serviceFactory.register(processorCode, this);

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Configuring endpoint " + endpoint);
        }

        // configure excentus related parms
        this.setDefaultUri(endpoint);
        this.setMarshaller(marshaller);
        this.setUnmarshaller(unmarshaller);

        formatter = new SimpleDateFormat(dateFormat);

        // This is an expensive operation so we want to do once
        ClientConfig clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,
                Boolean.TRUE);
        //Client client = Client.create(clientConfig);
        Client client = Client.create();

        client.addFilter(new LoggingFilter());

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Configuring GasBuddy endpoint " + gasBuddyEndpoint);
        }

        // Setup endpoint
        service = client.resource(gasBuddyEndpoint);
    }

    @Autowired(required = true)
    public ExcentusCouponService(WebServiceMessageFactory messageFactory) {
        super(messageFactory);
    }

    /**
     * Validate the card number for a particular retailer.  Obviously rules for card validation
     * vary between retailers.
     *
     * From Excentus...
     *  We require a 6 digit ISO with a 12 digit member number and a luhn check which adds up to
     *  the human readable. That is what they will be entering on your page
     *
     * @param cardNumber card number
     * @throws ServiceException
     */
    @Override
    public void validateCard(String cardNumber , String retailerCode) throws ServiceException {
        if (!NumberUtils.isDigits(cardNumber)) {
            throw new ServiceException(ServiceStatus.INVALID_CARD);
        }

        // in case I need to test for Luhns
        //getLuhnCheckDigit().isValid(cardNumber);

        //formatAndValidateCardNumber(cardNumber);
    }

    /**
     * Loads a coupon to the loyalty card
     *
     * @param consumerId An ID that the publisher uses to indicate a specific consumer.
     * @param channel The channel from which this request originated. Examples include: WEB, EMAIL, SMS, MOBILE_EMAIL
     * @param cardNumber The consumer's loyalty card number.
     * @param couponId This value uniquely identifies the coupon offer for this retailer.
     * @param transactionId Unique value passed-in by calling app to identify the transaction
     * @return the mixcode with meta-data tied to the statusCode passed in
     * @throws com.icoke.coupon.webservices.ServiceException
     */
    @Override
    public void loadToCard(String retailerCode, String cardNumber, String consumerId,
                           String transactionId, String couponId, String couponDescription,
                           Date couponStartDate, Date couponEndDate, String couponValue,
                           String channel) throws ServiceException {

        // Debug log service request
        if (LOGGER.isDebugEnabled()) {
            String serviceInput = "CouponService.loadToCard input args : " +
                    CouponServiceHelper.toStringServiceParams(retailerCode, cardNumber,
                            consumerId, transactionId, couponId, couponDescription,
                            couponStartDate, couponEndDate, couponValue, channel);
            LOGGER.debug(serviceInput);
        }

        // make sure card is valid
        this.validateCard(cardNumber,retailerCode);

        // make sure card is registered with GasBuddy
        if (gasBuddyEnabled) {
            if (!validCardWithGasBuddy(cardNumber)) {
                throw new ServiceException(ServiceStatus.INVALID_CARD_NOT_ACTIVE,
                        GUIDGenerator.getGUID(), "Card is not yet active");
            }
        }

        long sequenceNumber;
        try {
            sequenceNumber = CouponServiceHelper.stringToLong(transactionId);
        } catch (Exception e) {
            LOGGER.error(e);
            throw new ServiceException(ServiceStatus.INVALID_TRANSACTION_VALUE,
                    GUIDGenerator.getGUID(),
                    "Failed to convert Transaction ID to a valid Sequence Number");
        }

        RewardIssuanceRequestDocument doc =
                RewardIssuanceRequestDocument.Factory.newInstance();

        // build client request
        RewardIssuanceRequestDocument.RewardIssuanceRequest request =
                doc.addNewRewardIssuanceRequest();

        // top level vars
        request.setReferenceId(referenceId);

        // configure header
        HeaderDocument.Header header = request.addNewHeader();
        header.setAccountNo(cardNumber);
        header.setRetailerId(retailerCode);
        header.setSiteId(siteId);
        header.setDateTime(formatter.format(new Date()));
        header.setRegisterId(registerId);
        header.setSequenceNumber(sequenceNumber);
        header.setRetry(retry);

        // configure transaction
        RewardIssuanceRequestDocument.RewardIssuanceRequest.Transaction txn = request.addNewTransaction();
        txn.setBatchId(batchId);
        txn.setLocalTransactionId(String.valueOf(transactionId));
        txn.setTotalTransactionAmount(totalTransactionAmount);
        txn.setTaxAmount(taxAmount);
        txn.setRewardEligibleAmount(rewardEligibleAmount);

        // configure tender
        TendersDocument.Tenders tenders = txn.addNewTenders();
        TendersDocument.Tenders.Tender tender = tenders.addNewTender();
        tender.setAmount(amount);
        tender.setType(tenderType);
        tender.setCardType(cardType);

        DetailsDocument.Details details = txn.addNewDetails();
        OffersDocument.Offers offers = details.addNewOffers();
        OfferDocument.Offer offer = offers.addNewOffer();
        offer.setId(couponId);
        offer.setType(OfferType.LOCAL);
        offer.setOfferDesc(couponDescription);
        offer.setStartDate(formatter.format(couponStartDate));
        offer.setEndDate(formatter.format(couponEndDate));
        offer.setSponsor(sponsor);

        OfferDetailsDocument.OfferDetails offerDetails = offer.addNewOfferDetails();
        offerDetails.setCode(code);
        offerDetails.setUnitType(unitType);
        offerDetails.setUnits(units);

        RewardsDocument.Rewards rewards = offer.addNewRewards();
        RewardsDocument.Rewards.Reward reward = rewards.addNewReward();
        reward.setId(couponId);
        reward.setType(RewardType.CPG);
        try {
            DecimalFormat format = (DecimalFormat) NumberFormat.getInstance(Locale.US);
            format.setParseBigDecimal(true);
            BigDecimal number = (BigDecimal) format.parse(couponValue);
            reward.setValue(number);
            reward.setRewardIssued(number);
        } catch (ParseException e) {
            LOGGER.error(e);
            throw new ServiceException(ServiceStatus.INVALID_COUPON_VALUE,
                    "CouponValue must be numeric");
        }
        reward.setRewardUnits(rewardUnits);

        RewardIssuanceResponseDocument response;

        try {
            // Setup endpoint
            response = (RewardIssuanceResponseDocument)getWebServiceTemplate().
                    marshalSendAndReceive(doc, new WSSEHeaderWebServiceMessageCallback(siteId, password));
        } catch (Exception e) {
            String errorMsg = "Failed to load coupon to card " + cardNumber + " - " + e.getMessage();
            LOGGER.error(errorMsg, e);
            throw new ServiceException(ServiceStatus.SYSTEM_ERROR, GUIDGenerator.getGUID(), e.getMessage());
        }

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("loadToCard response " + response);
            LOGGER.debug(response);
        }

    }

    /**
     * Calls GasBuddy to validate a card number.  REST format is:
     *  /Registration/400113965904/?token=427F3951-72C4-4341-9B23-238CA055EE8B
     *
     * @param cardNumber
     * @return
     */
    public boolean validCardWithGasBuddy(String cardNumber) throws ServiceException {
        ClientResponse response;
        GasBuddyResponse gasBuddyResponse;

        try {
            // Setup endpoint
            response = service.path("Registration").path(cardNumber+"/").queryParam("token", gasBuddyAuthToken)
                    .accept(MediaType.TEXT_XML).get(ClientResponse.class);


            //gasBuddyResponse = response.getEntity(GasBuddyResponse.class);
            String payload = response.getEntity(String.class);

            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("GasBuddy response " + response);
                //LOGGER.debug(gasBuddyResponse);
            }


            boolean success = payload.contains("\"ResponseCode\":1");
            if (success) {
                // if loyalty customer id exists then card has been validated
                boolean valid = payload.contains("LoyaltyCustomerId");
                return valid;
            } else {
                throw new ServiceException(ServiceStatus.SYSTEM_ERROR,
                        GUIDGenerator.getGUID(), "Failed to validate with GasBuddy");
            }
        } catch (Exception e) {
            String errorMsg = "Failed to load coupon to card " + cardNumber;
            LOGGER.error(errorMsg, e);
            throw new ServiceException(ServiceStatus.SYSTEM_ERROR, GUIDGenerator.getGUID(), errorMsg);
        }
    }

    /**
     * Checks for null and removes any unneeded prefixes
     *
     * @param cardNumber
     * @return
     * @throws ServiceException
     */
    private String formatAndValidateCardNumber(String cardNumber) throws ServiceException {
        if (cardNumber == null) {
            String errorMsg = "Empty card passed for retailer RiteAid";
            LOGGER.warn(errorMsg);
            throw new ServiceException(ServiceStatus.INVALID_CARD, GUIDGenerator.getGUID(),
                    "Card cannot be blank");
        }

        LOGGER.info("Valid card " + cardNumber + " for retailer RiteAid");

        return cardNumber;
    }

    public String getProcessorCode() {
        return processorCode;
    }

    public void setProcessorCode(String processorCode) {
        this.processorCode = processorCode;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public long getRegisterId() {
        return registerId;
    }

    public void setRegisterId(long registerId) {
        this.registerId = registerId;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public BigDecimal getTotalTransactionAmount() {
        return totalTransactionAmount;
    }

    public void setTotalTransactionAmount(BigDecimal totalTransactionAmount) {
        this.totalTransactionAmount = totalTransactionAmount;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getRewardEligibleAmount() {
        return rewardEligibleAmount;
    }

    public void setRewardEligibleAmount(BigDecimal rewardEligibleAmount) {
        this.rewardEligibleAmount = rewardEligibleAmount;
    }

    public String getTenderType() {
        return tenderType;
    }

    public void setTenderType(String tenderType) {
        this.tenderType = tenderType;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getRetry() {
        return retry;
    }

    public void setRetry(int retry) {
        this.retry = retry;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public BigDecimal getUnits() {
        return units;
    }

    public void setUnits(BigDecimal units) {
        this.units = units;
    }

    public BigDecimal getRewardUnits() {
        return rewardUnits;
    }

    public void setRewardUnits(BigDecimal rewardUnits) {
        this.rewardUnits = rewardUnits;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getGasBuddyEndpoint() {
        return gasBuddyEndpoint;
    }

    public void setGasBuddyEndpoint(String gasBuddyEndpoint) {
        this.gasBuddyEndpoint = gasBuddyEndpoint;
    }

    public String getGasBuddyAuthToken() {
        return gasBuddyAuthToken;
    }

    public void setGasBuddyAuthToken(String gasBuddyAuthToken) {
        this.gasBuddyAuthToken = gasBuddyAuthToken;
    }

    public CouponServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(CouponServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    /**
     * Creates luhn check digit generator
     * @return luhn check digit generator
     */
    private LuhnCheckDigit getLuhnCheckDigit() {
        if (luhnCheckDigit == null) {
            luhnCheckDigit = new LuhnCheckDigit();
        }

        return luhnCheckDigit;
    }

    /**
	 * Utility to compose a toString like rep of the service args.
	 *
     * @param consumerId program that is passed in
     * @param channel consumer id passed in
     * @param cardNumber the pincode
     * @param couponId consumer id passed in
     * @param transactionId consumer id passed in
     * @return stringified representation of the key service args.
	 */
	private String toStringServiceParams(String retailerCode, String cardNumber, String consumerId,
                                         String transactionId, String couponId, String couponDescription,
                                         Date couponStartDate, Date couponEndDate, String couponValue,
                                         String channel) {
		StringBuilder sb = new StringBuilder(200);
        sb.append("[retailerCode:").append(retailerCode);
        sb.append(", cardNumber:").append(cardNumber);
        sb.append(", consumerId:").append(consumerId);
        sb.append(", transactionId:").append(transactionId);
        sb.append(", couponId:").append(couponId);
        sb.append(", couponDescription:").append(couponDescription);
        sb.append(", couponStartDate:").append(couponStartDate);
        sb.append(", couponEndDate:").append(couponEndDate);
        sb.append(", couponValue:").append(couponValue);
        sb.append(", channel:").append(channel);
        sb.append("]");
        return sb.toString();
	}
}
