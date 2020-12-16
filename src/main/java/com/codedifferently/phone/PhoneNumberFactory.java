package com.codedifferently.phone;

import com.codedifferently.exceptions.InvalidPhoneNumberFormatException;
import com.codedifferently.tools.RandomNumberFactory;

import java.util.logging.Logger;

public final class PhoneNumberFactory {
    private static final Logger logger = Logger.getGlobal();

    private PhoneNumberFactory() {
        /** This constructor is private
         *  This class is un-instantiable */
    }

    /**
     * @param phoneNumberCount - number of PhoneNumber objects to instantiate
     * @return array of randomly generated PhoneNumber objects
     */ //TODO - Implement logic
    public static PhoneNumber[] createRandomPhoneNumberArray(int phoneNumberCount) {
        return null;
    }

    /**
     * @return an instance of PhoneNumber with randomly generated phone number value
     */ //TODO - Implement logic
    public static PhoneNumber createRandomPhoneNumber() {

        Integer areaCode = RandomNumberFactory.createInteger(100,999);
        Integer centralOffice = RandomNumberFactory.createInteger(000,999);
        Integer phoneLineCode = RandomNumberFactory.createInteger(0000,9999);

        return createPhoneNumberSafely(areaCode, centralOffice, phoneLineCode);
    }


    /**
     * @param areaCode          - 3 digit code
     * @param centralOfficeCode - 3 digit code
     * @param phoneLineCode     - 4 digit code
     * @return a new phone number object
     */ //TODO - if input is valid, return respective PhoneNumber object, else return null

    //This is us handling the exception. It bubbled up from the prev method.
    public static PhoneNumber createPhoneNumberSafely(int areaCode, int centralOfficeCode, int phoneLineCode) {

        try { //try to use the method, else return null.
            //(###)-###-####
            StringBuilder phoNum = new StringBuilder();

            phoNum.append("(")
                    .append(areaCode)
                    .append(")")
                    .append("-")
                    .append(centralOfficeCode)
                    .append("-")
                    .append(phoneLineCode);

            return createPhoneNumber(phoNum.toString());
        } catch (InvalidPhoneNumberFormatException e) {
            return null;
        }
    }

    /**
     * @param phoneNumberString - some String corresponding to a phone number whose format is `(###)-###-####`
     * @return a new phone number object
     * @throws InvalidPhoneNumberFormatException - thrown if phoneNumberString does not match acceptable format
     */ // TODO - Add throws statement to method signature
    public static PhoneNumber createPhoneNumber(String phoneNumberString) throws InvalidPhoneNumberFormatException {
        return null;
    }
}
