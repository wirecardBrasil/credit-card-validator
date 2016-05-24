package br.com.moip.creditcard;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class VisaCreditCardTest {

    @Test
    public void verificaCartaoVisa() {
        String validCard = "4073020000000002";
        assertTrue(validCard.length() == 16);
        assertTrue(VisaCreditCard.isBrandVisa(validCard));
    }

    @Test
    public void verificaCartaoVisaInformandoCartaoMaster() {
        String validCard = "5555666677778884";
        assertFalse(VisaCreditCard.isBrandVisa(validCard));
    }

    @Test
    public void verificaCartaoVisaInformandoCartaoAmex() {
        String validCard = "376411112222331";
        assertFalse(VisaCreditCard.isBrandVisa(validCard));
    }

    @Test
    public void verificaCartaoVisaInformandoCartaoDiners() {
        String validCard = "30111122223331";
        assertFalse(VisaCreditCard.isBrandVisa(validCard));
    }

    @Test
    public void verificaCartaoVisaInformandoCartaoHiper() {
        String validCard = "6370950000000005";
        assertFalse(VisaCreditCard.isBrandVisa(validCard));
    }

    @Test
    public void verificaCartaoVisaInformandoCartaoHipercard() {
        String validCard = "6062825624254001";
        assertFalse(VisaCreditCard.isBrandVisa(validCard));
    }

    @Test
    public void verificaCartaoVisaInformandoCartaoElo() {
        String validCard = "6362970000457013";
        assertFalse(VisaCreditCard.isBrandVisa(validCard));
    }

    @Test
    public void verificaCartaoVisaInvalido() {
        String invalidCard = "407302";
        assertFalse(VisaCreditCard.isBrandVisa(invalidCard));
    }

    @Test
    public void verificaCartaoVisaComLetra() {
        String invalidCard = "40730200000qwe02";
        assertFalse(VisaCreditCard.isBrandVisa(invalidCard));
    }

    @Test
    public void verificaCartaoVisarComCaracterEspecial() {
        String invalidCard = "40730-*/20000000002";
        assertFalse(VisaCreditCard.isBrandVisa(invalidCard));
    }

    @Test
    public void verificaSeCartaoVisaEhNulo() {
        String nullableCard = null;
        assertFalse(VisaCreditCard.isBrandVisa(nullableCard));
    }

    @Test
    public void verificaSeCartaoVisaEhVazio() {
        String emptyCard = "";
        assertFalse(VisaCreditCard.isBrandVisa(emptyCard));
    }

}