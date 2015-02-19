/*
 * Copyright (c) 2013. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.service.v1.inmar;

/**
 * Created by IntelliJ IDEA.
 *
 * @author <a href="jpeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
public enum AcqExtReponseCodes {
    SUCCESS(100, "Success"),
    ALREADY_EXISTS(101, "Message already exists.  Did not reload message"),
    INVALID_MESSAGE(500, "Invalid message not loaded"),
    INMAR_ID_DOES_NOT_EXIST(501, "Inmar ID does not exist, message not loaded"),
    UNKNOWN_RETAILER(502, "Unknown retailer, message not loaded"),
    CARD_ID_REQUIRED(508, "Card ID is required, message not loaded"),
    ID_TYPE_REQUIRED(509, "ID type is required, message not loaded"),
    TRANSACTION_ID_REQUIRED(510, "Transaction ID is required, message not loaded"),
    DISPLAY_START_DATE_OUT_OF_RANGE(512, "Dynamic display start date must be within offer start and end date range, message not loaded"),
    DISPLAY_END_DATE_OUT_OF_RANGE(513, "Dynamic display end date must be within offer start and end date range, message not loaded"),
    REDEMPTION_START_DATE_OUT_OF_RANGE(514, "Dynamic redemption start date must be within offer start and end date range, message not loaded"),
    REDEMPTION_END_DATE_OUT_OF_RANGE(515, "Dynamic redemption end date must be within offer start and end date range, message not loaded"),
    NOT_DYNAMIC_DATE_OFFER(516, "Offer must be a dynamic date offer to contain dynamic dates, message not loaded"),
    DYNAMIC_DATES_REQUIRED(517, "Offer is a dynamic date offer. Dynamic dates are required, message not loaded"),
    UNKNOWNN_SITE(518, "Unknown site, message not loaded"),
    UNKNOWN_CLIP_TYPE(519, "Unknown clip type, message not loaded"),
    CONSUMER_REGISTRATION_FAILED(520, "Consumer registration failed, message not loaded"),
    DUPLICATE_MESSAGE(521, "Duplicate message, message not loaded"),
    UNKNOWN_MEDIA_PROPERTY(523, "Unknown Media Property Id, message not loaded"),
    OFFER_NOT_SYNDICATED(524, "Offer not syndicated to media property, message not loaded"),
    OFFER_NOT_ASSIGNED(525, "Offer not assigned and approved for retailer, message not loaded"),
    UNKNOWN_LOYALTY_ID(527, "Unknown loyalty id type, message not loaded"),
    INVALID_DATA_FOR_FIELD(532, "'Field '{field}' has invalid data ({value}). Message: {msg}"),
    OFFER_BUDGET_REACHED(558, "Offer acquisition budget reached; acquisition denied"),
    PERMISSION_DENIED(599, "Permission denied to perform requested operation, message not loaded"),
    MISSING_REQUIRED_TAG(9100, "Missing required tag: {field}");

    private final int statusCode;
    private final String statusDescription;

    AcqExtReponseCodes(int statusCode, String statusDescription) {
        this.statusCode = statusCode;
        this.statusDescription = statusDescription;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getStatusDescription() {
        return statusDescription;
    }
}
