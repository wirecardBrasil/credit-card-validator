package br.com.moip.creditcard;

import java.util.Arrays;
import java.util.List;

public class MasterCreditCard {

    public static List<String> MASTERCARD_NEW_RANGE = Arrays.asList("222100", "272099");

    public static boolean isBrandMaster(final String number) {
        return number != null && (number.matches("5[0-9]{15}") || isValidMasterBin(number));
    }

    private static boolean isValidMasterBin(String number) {
        if (number.length() < 6) {
            return false;
        }

        for (int i = 0; i < MASTERCARD_NEW_RANGE.size(); i+=2) {
            int startingRange = Integer.valueOf(MASTERCARD_NEW_RANGE.get(i));
            int endingRange = Integer.valueOf(MASTERCARD_NEW_RANGE.get(i+1));
            Integer parsedNumber = Integer.valueOf(number.substring(0, 6));

            if (parsedNumber >= startingRange && parsedNumber <= endingRange) return true;
        }
        return false;
    }

}