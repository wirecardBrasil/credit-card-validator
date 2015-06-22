package br.com.moip.creditcard;

public class HipercardCreditCard {

    public static final String HIPERCARD_PATTERN = "^606282[0-9]{10}$";

    public static boolean isBrandHipercard(final String number){
        return number != null && number.matches(HIPERCARD_PATTERN);
    }
}
