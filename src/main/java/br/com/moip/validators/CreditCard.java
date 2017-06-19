package br.com.moip.validators;

import br.com.moip.creditcard.AmexCreditCard;
import br.com.moip.creditcard.Brands;
import br.com.moip.creditcard.DinersCreditCard;
import br.com.moip.creditcard.EloCreditCard;
import br.com.moip.creditcard.HiperCreditCard;
import br.com.moip.creditcard.HipercardCreditCard;
import br.com.moip.creditcard.MasterCreditCard;
import br.com.moip.creditcard.VisaCreditCard;

public class CreditCard {

    private String creditCard;

    public CreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public Brands getBrand() {
        if (!validateNumber()) {
            return Brands.UNKNOWN;
        }
        this.creditCard = creditCard.replace(" ", "");
        // As bandeiras são caraterizadas por conjuntos de BINs com sobre-posição.
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

    public boolean validateNumber() {
        return creditCard != null && creditCard.replace(" ", "").matches("\\d{13,19}");
    }

    public boolean isValid() {
        return Brands.UNKNOWN != getBrand();
    }
}