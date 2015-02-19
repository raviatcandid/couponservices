/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.service.v1.riteaid;

/**
 * Created by IntelliJ IDEA.
 *
 * @author <a href="jpeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */

public class WellnessCardNumberCheck {

    private static final long serialVersionUID = 1L;
    private boolean acceptAssociateCard;
    private static int WELLNESS_CARD_NUMBER_LENGTH = 11;
    private static int ASSOCIATE_CARD_NUMBER_LENGTH = 14;
    private static final String ASSOCIATE_CARD_PREFIX = "99";
    private static final String WELLNESS_CARD_PREFIX = "95";
    private static final String EMPTY_STRING = "";
    private static final String SPACE = " ";
    private static final String CARD_PREFIX_MK = "MK";
    public static final int ZERO_INT = 0;
    public static final int ONE_INT = 1;
    public static final int TWO_INT = 2;
    public static final int THREE_INT = 3;
    public static final int FOUR_INT = 4;
    public static final int EIGHT_INT = 8;
    public static final int TEN_INT = 10;
    public static final int NINE_INT = 9;
    public static final int TWENTY_INT = 20;
    public static final int TWENTY_TWO_INT = 22;


    public boolean isSatisfied(String valueToValidate) {
        boolean validWellnessCardNumber = false;
        /*Following validations rules are to be applied to wellness card entered by the user
        * 1) Remove spaces from the card number if it exists
        * 2) Remove MK from the card number if it exists
        * 3) For normal wellness card number
        *                                            1) Should be numeric
        *                                            2) Should start with 95
         *                                            3) Should be 11 digit long
        *                                            4) Should satisfy checkDigit logic
        * 3) For Associate card number
        *                                            1)Should be numeric
         *                                            2) Should start with 99
        *                                            3) Should be 11 digit long after removing last 3 characters
        */
        if (valueToValidate == null || valueToValidate.toString().trim().length() == ZERO_INT) {
            return false;
        } else {
            String cardNumberWithPrefix = valueToValidate.toString();
            String cardNumber = EMPTY_STRING;
            //Remove spaces
            cardNumberWithPrefix = cardNumberWithPrefix.replace(SPACE, EMPTY_STRING);

            //Remove MK
            String cardNumberWithPrefixInUpperCase = cardNumberWithPrefix.toUpperCase();
            if (cardNumberWithPrefixInUpperCase.length() > TWO_INT && cardNumberWithPrefixInUpperCase.startsWith(CARD_PREFIX_MK)) {
                cardNumber = cardNumberWithPrefix.substring(TWO_INT, cardNumberWithPrefix.length());
            } else {
                cardNumber = cardNumberWithPrefix;
            }

            validWellnessCardNumber = isValidWellnessCardNumber(cardNumber);
            if (!validWellnessCardNumber && acceptAssociateCard) {
                validWellnessCardNumber = isValidAssociateCardNumber(cardNumber);
            }
        }
        return validWellnessCardNumber;
    }

    public boolean getAcceptAssociateCard() {
        return acceptAssociateCard;
    }

    public void setAcceptAssociateCard(final boolean acceptAssociateCard) {
        this.acceptAssociateCard = acceptAssociateCard;
    }

    private boolean isValidWellnessCardNumber(String cardNumber) {
        if (isValidPrefix(cardNumber, WELLNESS_CARD_PREFIX) &&
                isNumber(cardNumber) &&
                isValidLength(cardNumber, WELLNESS_CARD_NUMBER_LENGTH) &&
                isValidCheckDigit(cardNumber)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isValidAssociateCardNumber(String cardnumber) {
        if (isValidPrefix(cardnumber, ASSOCIATE_CARD_PREFIX) &&
                isNumber(cardnumber) &&
                isValidLength(cardnumber, ASSOCIATE_CARD_NUMBER_LENGTH)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isNumber(String cardNumber) {
        boolean result = false;
        try {
            Long.parseLong(cardNumber);
            result = true;
        } catch (NumberFormatException e) {
        }
        return result;
    }

    private static boolean isValidLength(String cardNumber, int validLength) {
        if (cardNumber.length() == validLength) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isValidPrefix(String cardNumber, String validPrefix) {
        if (cardNumber.length() > ZERO_INT && cardNumber.startsWith(validPrefix)) {
            return true;
        } else {
            return false;
        }
    }
    /*
    * Validate Wellness card number. Argument: cardNumber = Wellness Card Number
    * Return: boolean This is based upon Luhn formula
     * 1. First drop the last digit from the card number (because that's what we are trying to calculate)
     * 2. Reverse the number
     * 3. Multiply all the digits in odd positions (The first digit, the third digit, etc) by 2.
     * 4. If any one is greater than 9 subtract 9 from it.
     * 5. Sum those numbers up
     * 6. Add the even numbered digits (the second, fourth, etc) to the number you got in the previous step
     * 7. If it is multiple of 10 then this is a valid card number
    */

    private static boolean isValidCheckDigit(String cardNumber) {
        int sum = ZERO_INT;
        int added = ZERO_INT;
        boolean validCheckDigit = false;
        boolean doubleFlag = false;

        for (int index = cardNumber.length() - ONE_INT; index >= ZERO_INT; index--) {
            if (doubleFlag) {
                added = (Integer.parseInt(cardNumber.substring(index, index + ONE_INT))) << ONE_INT;
                if (added > NINE_INT)
                    added -= NINE_INT;
            } else {
                added = Integer.parseInt(cardNumber.substring(index, index + ONE_INT));
            }
            sum += added;
            doubleFlag = !doubleFlag;
        }

        if (sum % TEN_INT == ZERO_INT) {
            validCheckDigit = true;
        }
        if (validCheckDigit) {
            return validCheckDigit;
        } else if (isValidCheckDigitModUPC(cardNumber) == true) {
            //validate check digit with MOD UPC
            return true;
        } else {
            return isValidCheckDigitForWellnessCardWithMK(cardNumber);
        }
    }

    /*
* Validate Wellness card number. Argument: cardNumber = Wellness Card Number
* Return: boolean This is based upon Luhn formula
* 1. First drop the last digit from the card number (because that's what we are trying to calculate)
* 2. Reverse the number
* 3. Multiply all the digits in odd positions (The first digit, the third digit, etc) by 3.
* 4. Sum those numbers up
* 5. Add the even numbered digits (the second, fourth, etc) to the number you got in the previous step
* 6. If it is multiple of 10 then this is a valid card number
*
* Mod 10 UPC Calculation
  Example: Data = 1234567c where c is the check digit to be calculated.
  Data:                                      1  2  3  4  5  6  7
  Multiplier: x        3  1  3  1  3  1  3
-------------------------------------------------------------
                                                                   3  2  9  4  15 6  21
  Add the products: SUM =  3 + 2 + 9 + 4 + 15 + 6 + 21
  SUM = 60 ,MOD(SUM,10) must equal zero, MOD(60,10)
  Data = 1234567(0)*/
    private static boolean isValidCheckDigitModUPC(String cardNumber) {
        int sum = ZERO_INT;
        int added = ZERO_INT;
        boolean validCheckDigit = false;
        boolean doubleFlag = false;

        for (int index = cardNumber.length() - ONE_INT; index >= ZERO_INT; index--) {
            if (doubleFlag) {
                added = (Integer.parseInt(cardNumber.substring(index, index + ONE_INT))) * THREE_INT;

            } else {
                added = Integer.parseInt(cardNumber.substring(index, index + ONE_INT));
            }
            sum += added;
            doubleFlag = !doubleFlag;
        }

        if (sum % TEN_INT == ZERO_INT) {
            validCheckDigit = true;
        }
        return validCheckDigit;
    }

    /*'**********
    The below steps are one way to get the check digit and verify the card number is valid.
           Card Number = 95717317345
        1. Remove the check digit
        ex. 9571731734  (5 was the check digit and removed from the right side)
        2. Reverse the number
        ex. 4371371759
        3. Add the numbers 20 and 22 to the end of the reversed number in that order
        ex. 43713717592022
        4. Multiply all the digits in odd positions by 2 keeping 20 and 22 as one position each.
        ex. 4  7 3 1  5 20
         8 14 6 2 10 40
        5. If any one is greater than 9, add the two digits together.
        ex. 14   1 + 4 = 5
         the odd numbers should be 8 5 6 2 1 4
        6. Sum those numbers up
        ex. 8 + 5 + 6 + 2 + 1 + 4 = 26
        7. Add the even numbered digits to the number you got in the previous step
        ex. even positioned numbers are  3 1 7 7 9 22
         3 + 1 + 7 + 7 + 9 + 22 = 49
         26 (from odd positions) + 49 (from even positions) = 75
        8. Add the check digit to the total from number 7
        ex. 75 (from step 7) + 5 (check digit) = 80
        9. If it is multiple of 10 then this is a valid card number
    */

    public static boolean isValidCheckDigitForWellnessCardWithMK(String cardNumber) {

        boolean validCheckDigit = false;
        boolean doubleFlag = true;
        String temporaryString = EMPTY_STRING;
        String reversedCardNumber = EMPTY_STRING;
        int unitsDigit = ZERO_INT;
        int tensDigit = ZERO_INT;
        int oddSum = ZERO_INT;
        int evenSum = ZERO_INT;
        int added = ZERO_INT;
        int totalSum = ZERO_INT;
        int checkDigit = Integer.parseInt(cardNumber.substring(cardNumber.length() - ONE_INT, cardNumber.length()));
        reversedCardNumber = new StringBuilder(cardNumber.substring(0, cardNumber.length() - ONE_INT)).reverse().toString();
        for (int index = ZERO_INT; index <= reversedCardNumber.length() - ONE_INT; index++) {
            if (doubleFlag) {
                added = (Integer.parseInt(reversedCardNumber.substring(index, index + ONE_INT))) * TWO_INT;
                if (added > NINE_INT) {
                    temporaryString = String.valueOf(added);
                    unitsDigit = Integer.parseInt(temporaryString.substring(ZERO_INT, ONE_INT));
                    tensDigit = Integer.parseInt(temporaryString.substring(ONE_INT, TWO_INT));
                    added = unitsDigit + tensDigit;
                }
                oddSum += added;
            } else {
                added = Integer.parseInt(reversedCardNumber.substring(index, index + ONE_INT));
                evenSum += added;
            }
            doubleFlag = !doubleFlag;
        }

        if (!((cardNumber.length() % TWO_INT) == ZERO_INT)) {
            oddSum += FOUR_INT;
            evenSum += TWENTY_TWO_INT;
        } else {
            oddSum += EIGHT_INT;
            evenSum += TWENTY_INT;
        }
        totalSum = oddSum + evenSum + checkDigit;

        if (totalSum % TEN_INT == ZERO_INT) {
            validCheckDigit = true;
        }
        return validCheckDigit;
    }

}

