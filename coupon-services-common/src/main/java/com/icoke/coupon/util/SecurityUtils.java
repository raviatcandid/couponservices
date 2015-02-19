package com.icoke.coupon.util;

import java.util.Arrays;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Simple utility class to manage hashing and related functions for the real time statusCode service.
 *  
 * @author Krishna Satya
 * @version 1.0
 *
 */
public class SecurityUtils {
	// Class logger
	private static final Logger LOGGER = LogManager.getLogger(SecurityUtils.class);
	
	// Default delimiter used in creating the hash
	private static final String DELIMITER = "|";
	
	/*
	 * Default constructor
	 */
	public SecurityUtils() {
		super();
	}

	
	/**
	 * Utility method to return the SHA-256 hash for the input params.  Note the byte[] is Base64 encoded.
	 * 
	 * @param programId
	 * @param organizationId
	 * @param transactionId
	 * @return The SHA-256 hash
	 */
	@SuppressWarnings("static-access")
	public static byte[] getSecurityHash(long programId, long organizationId,long transactionId) {
        StringBuilder key = new StringBuilder(200);
		
		key.append(String.valueOf(programId)).append(DELIMITER);
        key.append(String.valueOf(organizationId)).append(DELIMITER);
        key.append(String.valueOf(transactionId));
		byte[] hash = Base64.encodeBase64(DigestUtils.sha256(key.toString()));
		
		if (LOGGER.isDebugEnabled()) { 
            LOGGER.debug("Key is :("+key+") SecurityHash is:("+new String(hash)+")");
        }
		return hash;
	}

	
    /**
     * Generic hash checker that takes variable number of values to hash along
     * with a secret key that is part of the hash
     *
     * @param values object array of values to hash
     * @param secretKey secret key appended to end of text block to be hashed
     * @param securityHash value to compare to
     * @return true if created hash equals securityHash passed-in
     */
    public static boolean compareHash(Object[] values, String secretKey, byte[] securityHash) {
        // Random guess on max size of values we are creating hash for
        StringBuilder sb = new StringBuilder(500);
        for (Object value : values) {
            sb.append(String.valueOf(value)).append(DELIMITER);
        }

        sb.append(secretKey);

        byte[] hash = Base64.encodeBase64(DigestUtils.sha256(sb.toString()));
        return Arrays.equals(hash, Base64.encodeBase64(securityHash));
    }


    /**
     * Command-line tool to create an encrypted value
     *
     * @param args first arg should be text to encrypt
     * @throws Exception upon failure
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("Usage:");
            System.out.println("  SecurityUtils [sha256] <key>?");
            return;
        }

        if (args[0].equals("sha256")) {
            String hash = new String(Base64.encodeBase64(DigestUtils.sha256(args[1])), "UTF-8");
            System.out.println("SHA-256 value: " + hash);
        }
    }
}
