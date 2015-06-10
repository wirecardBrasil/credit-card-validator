package br.com.moip.creditcard;

import org.junit.Test;

import static org.junit.Assert.*;

public class HipercardCreditCardTest {

    private static String[] HIPERCARD_BINS = {
            "606282",
    };

    @Test
    public void identifiesHipercard() throws Exception {
        for (String bin : HIPERCARD_BINS) {
            String cardNumber = "6062825624254001";
            assertTrue(cardNumber.length() == 16);
            assertTrue(HipercardCreditCard.isBrandHipercard(cardNumber));
        }
    }

    @Test
    public void verificaCartaoHipercardInformandoCartaoVisa(){
        String validCard = "4073020000000002";
        assertFalse(HipercardCreditCard.isBrandHipercard(validCard));
    }

    @Test
    public void verificaCartaoHipercardInformandoCartaoAmex(){
        String validCard = "376411112222331";
        assertFalse(HipercardCreditCard.isBrandHipercard(validCard));
    }

    @Test
    public void verificaCartaoHipercardInformandoCartaoHiper(){
        String validCard = "6370950000000005";
        assertFalse(HipercardCreditCard.isBrandHipercard(validCard));
    }

    @Test
    public void verificaCartaoHipercardInformandoCartaoMaster(){
        String validCard = "5555666677778884";
        assertFalse(HipercardCreditCard.isBrandHipercard(validCard));
    }

    @Test
    public void verificaCartaoHipercardInformandoCartaoElo(){
        String validCard = "6362970000457013";
        assertFalse(HipercardCreditCard.isBrandHipercard(validCard));
    }

    @Test
    public void verificaCartaoHipercardInformandoCartaoDiners(){
        String validCard = "30111122223331";
        assertFalse(HipercardCreditCard.isBrandHipercard(validCard));
    }
}