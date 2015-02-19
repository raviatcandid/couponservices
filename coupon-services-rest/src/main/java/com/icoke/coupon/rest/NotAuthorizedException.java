/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.rest;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Thrown when basic-auth fails for a call
 *
 * @author <a href="jpeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
public class NotAuthorizedException extends WebApplicationException {
    public NotAuthorizedException(String message) {
        super(Response.status(400)
                .entity(message).type(MediaType.TEXT_PLAIN).build());
    }
}
