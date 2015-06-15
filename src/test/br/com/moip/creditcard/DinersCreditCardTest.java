package br.com.moip.creditcard;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DinersCreditCardTest {

    @Test
    public void verificaCartaoDinersComecandoCom_301(){
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

    @Test
    public void verificaCartaoDinersInvalido(){
        String invalidCard = "301111221";
        assertFalse(DinersCreditCard.isBrandDiners(invalidCard));
    }

    @Test
    public void verificaCartaoDinersComLetra(){
        String invalidCard = "30111hjhjh22233";
        assertFalse(DinersCreditCard.isBrandDiners(invalidCard));
    }

    @Test
    public void verificaCartaoDinersComCaracterEspecial(){
        String invalidCard = "301 111*22223331";
        assertFalse(DinersCreditCard.isBrandDiners(invalidCard));
    }

    @Test
    public void verificaSeCartaoDinersEhNulo(){
        String nullableCard = null;
        assertFalse(DinersCreditCard.isBrandDiners(nullableCard));
    }

    @Test
    public void verificaSeCartaoDinersEhVazio(){
        String emptyCard = "";
        assertFalse(DinersCreditCard.isBrandDiners(emptyCard));
    }
}