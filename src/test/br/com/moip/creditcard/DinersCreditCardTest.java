package br.com.moip.creditcard;

import org.junit.Test;

import static org.junit.Assert.*;

public class DinersCreditCardTest {

    @Test
    public void verificaCartaoDinersComecandocom_301(){
        String validCard = "30111122223331";
        assertTrue(validCard.length() == 14);
        assertTrue(DinersCreditCard.isBrandDiners(validCard));
    }

    @Test
    public void verificaCartaoDinersInformandoCartaoVisa(){
        String validCard = "4073020000000002";
        assertFalse(DinersCreditCard.isBrandDiners(validCard));
    }

    @Test
    public void verificaCartaoDinersInformandoCartaoAmex(){
        String validCard = "376411112222331";
        assertFalse(DinersCreditCard.isBrandDiners(validCard));
    }

    @Test
    public void verificaCartaoDinersInformandoCartaoHiper(){
        String validCard = "6370950000000005";
        assertFalse(DinersCreditCard.isBrandDiners(validCard));
    }

    @Test
    public void verificaCartaoDinersInformandoCartaoHipercard(){
        String validCard = "6062825624254001";
        assertFalse(DinersCreditCard.isBrandDiners(validCard));
    }

    @Test
    public void verificaCartaoDinersInformandoCartaoElo(){
        String validCard = "6362970000457013";
        assertFalse(DinersCreditCard.isBrandDiners(validCard));
    }

    @Test
    public void verificaCartaoDinersInformandoCartaoMaster(){
        String validCard = "5555666677778884";
        assertFalse(DinersCreditCard.isBrandDiners(validCard));
    }

}