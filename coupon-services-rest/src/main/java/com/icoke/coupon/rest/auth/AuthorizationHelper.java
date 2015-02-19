/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.rest.auth;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.sun.jersey.core.util.Base64;

import com.icoke.coupon.beans.Organization;
import com.icoke.coupon.rest.NotAuthorizedException;


@Component
public class AuthorizationHelper {
	
	public static final Logger LOGGER = LogManager.getLogger(AuthorizationHelper.class);
	
    private static final String BASIC_PREFIX = "Basic ";

    private static final Organization IBM_ORG = new Organization("IBM",
            "International Business Machines Corp.", "qw54385d-ab81-912a-80b9-45cdby100a1b");

    private static final Organization DANNY_ENG_ORG = new Organization("DANNYENG",
            "Danny Eng", "qw54385d-ab81-912a-80b9-90cdby876a1b");

    private int orgExpiryMinutes = 60;

    // Map to cache program info.
    Cache<String, Organization> orgCache = CacheBuilder.newBuilder()
            .concurrencyLevel(4)
            .maximumSize(200)
            .expireAfterWrite(orgExpiryMinutes, TimeUnit.MINUTES)
            .build(
                    new CacheLoader<String, Organization>() {
                        public Organization load(String organizationCode) {
                            if (LOGGER.isDebugEnabled()) {
                                LOGGER.debug("Refreshing organization " +
                                        "descriptor cache for organizationCode " +
                                        organizationCode);
                            }

                            //return organizationDao.selectCodeDescriptor(programId);

                            // TODO: stick this stuff in a file somewhere
                            if (organizationCode.equalsIgnoreCase("IBM")) {
                                return IBM_ORG;
                            } else if (organizationCode.equalsIgnoreCase("DANNYENG")) {
                                return DANNY_ENG_ORG;
                            } else {
                                return null;
                            }
                        }
                    });

    /**
    * Checks that calling party is authorized to call service. 
    *
    * @param authorization basic auth header
    * @throws NotAuthorizedException if not authorized
    */
    public String authorizeOrganization(String authorization)  {
        if (authorization == null || !authorization.startsWith(BASIC_PREFIX)) {
            String message = "Invalid basic-auth header value " + authorization;
            LOGGER.warn(message);
            throw new NotAuthorizedException(message);
        }
  
        String authData = new String(Base64.decode(authorization.substring(BASIC_PREFIX.length()) ));
        
        String [] userAndPassword = authData.split(":", 2);
        String authOrganizationId = userAndPassword[0];
        String secretKey = userAndPassword[1];

        Organization org;
        try {
            org = orgCache.getIfPresent(authOrganizationId);
        } catch (UncheckedExecutionException ere) {
            String message = "Organization " + authOrganizationId +
                    " does not exist or is not enabled for coupons. ";
            LOGGER.warn(message);
            throw new NotAuthorizedException(message);
        }

        if (!org.getSecretKey().equals(secretKey)) {
            String message = "Incorrect secret key " + secretKey + " " +
                    " for organization id " + authOrganizationId;
            LOGGER.warn(message);
            throw new NotAuthorizedException(message);
        }

        return authOrganizationId;
    }

    public int getOrgExpiryMinutes() {
        return orgExpiryMinutes;
    }

    public void setOrgExpiryMinutes(int orgExpiryMinutes) {
        this.orgExpiryMinutes = orgExpiryMinutes;
    }
}
