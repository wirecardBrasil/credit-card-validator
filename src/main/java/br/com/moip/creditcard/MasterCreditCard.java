package br.com.moip.creditcard;

public class MasterCreditCard {

    public static boolean isBrandMaster(final String number) {
        return number != null && number.matches("5[0-9]{15}");
    }

}
