package br.com.moip.creditcard;

import org.junit.Test;

import static org.junit.Assert.*;

public class HiperCreditCardTest {

    private static String[] HIPER_BINS = {
            "637095", "637612", "637599", "637609", "637568"
    };

    @Test
    public void identifiesHiperStartingWith_AnyBin() throws Exception {
        for (String bin : HIPER_BINS) {
            String cardNumber = bin + "0123456789";
            assertTrue(cardNumber.length() == 16);
            assertTrue(HiperCreditCard.isBrandHiper(cardNumber));
        }
    }

    @Test
    public void verificaCartaoHiperInformandoCartaoVisa(){
        String validCard = "4073020000000002";
        assertFalse(HiperCreditCard.isBrandHiper(validCard));
    }

    @Test
    public void verificaCartaoHiperInformandoCartaoMaster(){
        String validCard = "5555666677778884";
        assertFalse(HiperCreditCard.isBrandHiper(validCard));
    }

    @Test
    public void verificaCartaoHiperInformandoCartaoHipercard(){
        String validCard = "6062825624254001";
        assertFalse(HiperCreditCard.isBrandHiper(validCard));
    }

    @Test
    public void verificaCartaoHiperInformandoCartaoElo(){
        String validCard = "6362970000457013";
        assertFalse(HiperCreditCard.isBrandHiper(validCard));
    }

    @Test
    public void verificaCartaoHiperInformandoCartaoDiners(){
        String validCard = "30111122223331";
        assertFalse(HiperCreditCard.isBrandHiper(validCard));
    }

    @Test
    public void verificaCartaoHiperInformandoCartaoAmex(){
        String validCard = "376411112222331";
        assertFalse(HiperCreditCard.isBrandHiper(validCard));
    }
}