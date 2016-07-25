package br.com.moip.creditcard;

public class HipercardCreditCard {

    public static boolean isBrandHipercard(final String number){
        return number != null && (number.matches("^606282[0-9]{10}$") ||
                number.matches("^3841(0|4|6)0[0-9]{13}$"));
    }
}
