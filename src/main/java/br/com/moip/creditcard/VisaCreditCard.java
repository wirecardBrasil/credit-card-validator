package br.com.moip.creditcard;

public class VisaCreditCard {

    public static boolean isBrandVisa(final String number) { return number != null && number.matches("4[0-9]{15}");}
}
