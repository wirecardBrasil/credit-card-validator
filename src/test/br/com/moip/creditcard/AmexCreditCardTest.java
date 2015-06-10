package br.com.moip.creditcard;

import org.junit.Test;

import static org.junit.Assert.*;

public class AmexCreditCardTest {

    @Test
    public void verificaCartaoAmexComecandocom_37(){
        String validCard = "376411112222331";
        assertTrue(validCard.length() == 15);
        assertTrue(AmexCreditCard.isBrandAmex(validCard));
    }

    @Test
    public void verificaCartaoAmexComecandocom_34(){
        String validCard = "349102006762326";
        assertTrue(validCard.length() == 15);
        assertTrue(AmexCreditCard.isBrandAmex(validCard));
    }

    @Test
    public void verificaCartaoAmexInformandoCartaoVisa(){
        String validCard = "4073020000000002";
        assertFalse(AmexCreditCard.isBrandAmex(validCard));
    }

    @Test
    public void verificaCartaoAmexInformandoCartaoHiper(){
        String validCard = "6370950000000005";
        assertFalse(AmexCreditCard.isBrandAmex(validCard));
    }

    @Test
    public void verificaCartaoAmexInformandoCartaoHipercard(){
        String validCard = "6062825624254001";
        assertFalse(AmexCreditCard.isBrandAmex(validCard));
    }

    @Test
    public void verificaCartaoAmexInformandoCartaoElo(){
        String validCard = "6362970000457013";
        assertFalse(AmexCreditCard.isBrandAmex(validCard));
    }

    @Test
    public void verificaCartaoAmexInformandoCartaoDiners(){
        String validCard = "30111122223331";
        assertFalse(AmexCreditCard.isBrandAmex(validCard));
    }

    @Test
    public void verificaCartaoAmexInformandoCartaoMaster(){
        String validCard = "5555666677778884";
        assertFalse(AmexCreditCard.isBrandAmex(validCard));
    }

}