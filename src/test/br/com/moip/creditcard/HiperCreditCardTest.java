package br.com.moip.creditcard;

import org.junit.Test;

import static org.junit.Assert.*;

public class HiperCreditCardTest {

    private static String[] HIPER_BINS = {
            "637095", "637612", "637599", "637609", "637568"
    };

    @Test
    public void verificaCartaoHiperComecandoComQualquerBin() throws Exception {
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

    @Test
    public void verificaCartaoHipercInvalido(){
        String validCard = "63709500000";
        assertFalse(HiperCreditCard.isBrandHiper(validCard));
    }

    @Test
    public void verificaCartaoHiperComLetra(){
        String validCard = "637095000asd05";
        assertFalse(HiperCreditCard.isBrandHiper(validCard));
    }

    @Test
    public void verificaCartaoHiperComCaracterEspecial(){
        String validCard = "637095 0000000£¢¬005";
        assertFalse(HiperCreditCard.isBrandHiper(validCard));
    }

    @Test
    public void verificaSeCartaoHiperEhNulo(){
        String validCard = null;
        assertFalse(HiperCreditCard.isBrandHiper(validCard));
    }

    @Test
    public void verificaSeCartaoHiperEhVazio(){
        String validCard = "";
        assertFalse(HiperCreditCard.isBrandHiper(validCard));
    }
}