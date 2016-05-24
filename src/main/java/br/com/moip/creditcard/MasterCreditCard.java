package br.com.moip.creditcard;

public class MasterCreditCard {

    public static boolean isBrandMaster(final String number) {
        return number != null && isValidMasterBin(number);
    }

    private static boolean isValidMasterBin(String number) {
        return number.matches("5[0-9]{15}") ||
                number.matches("^222100[0-9]{10}$") ||
                number.matches("^272099[0-9]{10}$");
    }

}