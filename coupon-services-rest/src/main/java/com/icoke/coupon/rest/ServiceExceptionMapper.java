/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.rest;

import com.icoke.coupon.webservices.ServiceException;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * This class is used to make service exceptions to exceptions
 * that are REST-friendly.
 *
 * http://stackoverflow.com/questions/797834/should-a-restful-put-operation-return-something
 *
 * HTTP status statusCode 200 OK for a successful PUT of an update to an existing resource. No
 *   response body needed. (Per Section 9.6, 204 No Content is even more appropriate.)
 * HTTP status statusCode 201 Created for a successful PUT of a new resource, with URIs and
 *   metadata of the new resource echoed in the response body. (RFC 2616 Section 10.2.2)
 * HTTP status statusCode 409 Conflict for a PUT that is unsuccessful due to a 3rd-party
 *   modification, with a list of differences between the attempted update and the current
 *   resource in the response body. (RFC 2616 Section 10.4.10)
 * HTTP status statusCode 400 Bad Request for an unsuccessful PUT, with natural-language text
 * (such as English) in the response body that explains why the PUT failed. (RFC 2616 Section 10.4)
 *
 * @author <a href="jpeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
@Provider
public class ServiceExceptionMapper implements ExceptionMapper<ServiceException> {

    @Override
    public Response toResponse(ServiceException e) {
        // Response statusCode 200:  Success with GET or HEAD request
//        if (e.getStatus().getStatusCode() == ServiceStatus.REQ_COMPLETE.getStatusCode()) {
//
//        } else {
//        }
        return Response.status(Response.Status.BAD_REQUEST)
                .type(MediaType.TEXT_PLAIN)
                .entity(e.getMessage())
                .build();
    }
}
