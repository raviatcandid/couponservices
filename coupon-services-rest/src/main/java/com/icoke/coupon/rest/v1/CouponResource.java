/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.rest.v1;

import com.icoke.coupon.beans.Response;
//import com.icoke.coupon.rest.auth.OrganizationAuthorizationFilter;
import com.icoke.coupon.service.v1.CouponService;
import com.icoke.coupon.service.v1.CouponServiceFactory;
import com.icoke.coupon.util.GUIDGenerator;
import com.icoke.coupon.webservices.ServiceException;
import com.icoke.coupon.webservices.ServiceStatus;
import com.sun.jersey.api.NotFoundException;
import com.sun.jersey.spi.resource.Singleton;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import java.util.Date;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;
import java.util.Date;

/**
 * Class to support MixCodes REST calls.  Tries to support pragmatic REST
 * but "proper" REST vars take precedence.
 *
 * Format:  http(s)://server/appContextRoot/wsContextRoot/versionNumber/...
 * Example:  http://localhost:9080/rest/v4/...
 */
@Singleton
@Component
@Path("v1")
public class CouponResource {

    public static final Logger LOGGER = LogManager.getLogger(CouponResource.class);

    @Autowired
    private CouponServiceFactory couponServiceFactory;

    public CouponResource() {
        super();
    }

    @GET
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @Path("/loyaltycards/{retailerCode}/{cardNumber}")
    //@ResourceFilters(OrganizationAuthorizationFilter.class)
    public javax.ws.rs.core.Response validate(@Context SecurityContext sc,
                   @HeaderParam("X-Forwarded-For") String ipAddress,
                   @QueryParam("ipAddress") String ipAddressQP,
                   @DefaultValue("validate") @QueryParam("action") String action,
                   @PathParam("retailerCode") String retailerCode,
                   @PathParam("cardNumber") String cardNumber) throws ServiceException {

        long startTime = 0;
        if (LOGGER.isInfoEnabled()) {
            startTime = System.currentTimeMillis();
        }

        // use pragmatic query param if set
        if (ipAddress == null && ipAddressQP != null) {
            ipAddress = ipAddressQP;
        }

        if(retailerCode == null){
            String message ="RetailerCode is required";
            throw new ServiceException(ServiceStatus.INVALID_PROCESSOR_CODE, GUIDGenerator.getGUID(), message);
        }

			 String processorCode = "";
			//processorCode = request.getProcessorCode();
                if (retailerCode.equals("riteAid")) {
                    processorCode = "riteAid";
                }else if(retailerCode.equals("codeBroker")){
                    processorCode = "codeBroker";
                } else if(retailerCode.equals("safeway")){
                    processorCode = "safeway";
                }else if(retailerCode.equals("kouponmedia")){
                    processorCode = "kouponmedia";
				}else if(retailerCode.equals("excentus")){
                    processorCode = "excentus";
                }else {
                    processorCode = "inmar";
                }

        CouponService couponService = this.getCouponService(processorCode);
        couponService.validateCard(cardNumber,retailerCode);
		Response response = new Response();
		response.setStatus(200);
        response.setMessage("card is valid");


        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("loadToCard completed in " +
                    (System.currentTimeMillis() - startTime) + "ms");
        }

        return javax.ws.rs.core.Response.ok(response).build();
    }

    @POST
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @Path("/loyaltycards/load")
    //@ResourceFilters(OrganizationAuthorizationFilter.class)
    public javax.ws.rs.core.Response loadToCard(
		    //@HeaderParam("authorization") String authorization,
            //@QueryParam("authorization") String authorizationQP,
            //@HeaderParam("X-Forwarded-For") String ipAddress,
            //@FormParam("ipAddress") String ipAddressQP,
			@RequestBody String loadToCardJson) throws ServiceException {

        long startTime = 0;
        if (LOGGER.isInfoEnabled()) {
            startTime = System.currentTimeMillis();
        }

        // use pragmatic query param if set
     /*  if (authorization == null && authorizationQP != null) {
            authorization = authorizationQP;
        }*/

        // use pragmatic query param if set
        /*if (ipAddress == null && ipAddressQP != null) {
            ipAddress = ipAddressQP;
        }*/
		JSONObject json = (JSONObject) JSONSerializer.toJSON(loadToCardJson);
		String consumerId = json.getString("consumerId");
		String channel = json.getString("channel");
		String retailerCode = json.getString("retailerCode");
		String cardNumber = json.getString("cardNumber");
		String couponId = json.getString("couponId");
		String couponDescription = json.getString("couponDescription");
		String couponStartDate = json.getString("couponStartDate");
		String couponEndDate = json.getString("couponEndDate");
		String couponValue = json.getString("couponValue");
		String transactionId = json.getString("transactionId");

        getCouponService(retailerCode).loadToCard(retailerCode, cardNumber,
                consumerId, transactionId, couponId, couponDescription,
                null, null, couponValue, channel);

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("loadToCard completed in " +
                    (System.currentTimeMillis() - startTime) + "ms");
        }

        Response response = new Response();
        response.setStatus(200);
        response.setMessage("success");

        return javax.ws.rs.core.Response.ok(response).build();
    }

    public CouponServiceFactory getCouponServiceFactory() {
        return couponServiceFactory;
    }

    public void setCouponService(CouponServiceFactory couponServiceFactory) {
        this.couponServiceFactory = couponServiceFactory;
    }

    private CouponService getCouponService(String retailerCode) throws NotFoundException {
        CouponService service = couponServiceFactory.getCouponService(retailerCode);

        if (service == null) {
            String errorMsg = "Retailer Code " + retailerCode + " does not exist";
            throw new NotFoundException(errorMsg);
        }

        return service;
    }

}
