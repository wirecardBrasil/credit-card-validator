package br.com.moip.validators;

import br.com.moip.creditcard.*;

public class CreditCard {

    private String creditCard;

    public CreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public Brands getBrand() {

        // As bandeiras são caraterizadss por conjuntos de BINs com sobre-posição.
        // Identificar a bandeira correta por verificar primeiro a bandeira com BINs mais específicos.
        if (EloCreditCard.isBrandElo(creditCard)) {
            return Brands.ELO;
        }
        if (HiperCreditCard.isBrandHiper(creditCard)) {
            return Brands.HIPER;
        }
        if (VisaCreditCard.isBrandVisa(creditCard)) {
            return Brands.VISA;
        }
        if (MasterCreditCard.isBrandMaster(creditCard)) {
            return Brands.MASTERCARD;
        }
        if (AmexCreditCard.isBrandAmex(creditCard)) {
            return Brands.AMERICAN_EXPRESS;
        }
        if (DinersCreditCard.isBrandDiners(creditCard)) {
            return Brands.DINERS;
        }
        if (HipercardCreditCard.isBrandHipercard(creditCard)) {
            return Brands.HIPERCARD;
        }
        return Brands.UNKNOWN;
    }

    public boolean isValid() {
        return getBrand() != Brands.UNKNOWN;
    }
}
