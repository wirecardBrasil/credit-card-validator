package br.com.moip.creditcard;

public class HipercardCreditCard {

    public static final String HIPERCARD_PATTERN = "^606282[0-9]{10}$";

//    public static final int HIPERCARD_PAYMENT_FORM = 75;

    public static boolean isBrandHipercard(final String number){
        if(number == null){
            return false;
        }
        return number.matches(HIPERCARD_PATTERN);
    }
}
