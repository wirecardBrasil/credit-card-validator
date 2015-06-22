package br.com.moip.creditcard;

public class AmexCreditCard {

    /**
     * Exemplo: 34*, 37* com 15 chars
     */
    public static boolean isBrandAmex(final String number) {
        return number != null && number.matches("3(7|4)[0-9]{13}");
    }
}
