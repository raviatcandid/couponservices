/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.service.tools;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Encrypt passwords.
 *
 * @author <a href="jopeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
public class PasswordEncryptor {
    public  static final String password = "abfd0ba6-a6ee-43e6-8698-5c128f59de8b";
    private StandardPBEStringEncryptor encryptor;

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: PasswordEncryptor <token>" );
            System.exit(1);
        }

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(getConfigLocations());
        PasswordEncryptor passwdEncryptor = (PasswordEncryptor)
                applicationContext.getBean("passwordEncryptor" );
        System.out.println("Encrypted passwd: '"
                + passwdEncryptor.encrypt(args[0]) + "'." );
        System.out.println("Decrypted passwd: '"
                + passwdEncryptor.decrypt(passwdEncryptor.encrypt(args[0])) + "'." );
    }

    protected static String[] getConfigLocations() {
        return new String[] { "spring-we-servlet.xml" };
    }

    public String encrypt(String tokenToEncrypt) {
        return this.encryptor.encrypt(tokenToEncrypt);
    }

    public String decrypt(String tokenToDecrypt) {
        return this.encryptor.decrypt(tokenToDecrypt);
    }

    public void setEncryptor(StandardPBEStringEncryptor encryptor) {
        this.encryptor = encryptor;
    }
}