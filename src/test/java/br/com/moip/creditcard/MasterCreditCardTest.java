package br.com.moip.creditcard;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MasterCreditCardTest {

    @Test
    public void verificaCartaoMaster() {
        String validCard = "5555666677778884";
        assertTrue(validCard.length() == 16);
        assertTrue(MasterCreditCard.isBrandMaster(validCard));
    }

    @Test
    public void verificaCartaoMasterInformandoCartaoVisa() {
        String validCard = "4073020000000002";
        assertFalse(MasterCreditCard.isBrandMaster(validCard));
    }

    @Test
    public void verificaCartaoMasterInformandoCartaoAmex() {
        String validCard = "376411112222331";
        assertFalse(MasterCreditCard.isBrandMaster(validCard));
    }

    @Test
    public void verificaCartaoMasterInformandoCartaoDiners() {
        String validCard = "30111122223331";
        assertFalse(MasterCreditCard.isBrandMaster(validCard));
    }

    @Test
    public void verificaCartaoMasterInformandoCartaoHiper() {
        String validCard = "6370950000000005";
        assertFalse(MasterCreditCard.isBrandMaster(validCard));
    }

    @Test
    public void verificaCartaoMasterInformandoCartaoHipercard() {
        String validCard = "6062825624254001";
        assertFalse(MasterCreditCard.isBrandMaster(validCard));
    }

    @Test
    public void verificaCartaoMasterInformandoCartaoElo() {
        String validCard = "6362970000457013";
        assertFalse(MasterCreditCard.isBrandMaster(validCard));
    }

    @Test
    public void verificaCartaoMasterInvalido() {
        String invalidCard = "5555";
        assertFalse(MasterCreditCard.isBrandMaster(invalidCard));
    }

    @Test
    public void verificaCartaoMasterComLetra() {
        String invalidCard = "5555asdf77778884";
        assertFalse(MasterCreditCard.isBrandMaster(invalidCard));
    }

    @Test
    public void verificaCartaoMasterComCaracterEspecial() {
        String invalidCard = "555 666+7777888@";
        assertFalse(MasterCreditCard.isBrandMaster(invalidCard));
    }

    @Test
    public void verificaSeCartaoMasterEhNulo() {
        String nullableCard = null;
        assertFalse(MasterCreditCard.isBrandMaster(nullableCard));
    }

    @Test
    public void verificaSeCartaoMasterEhVazio() {
        String emptyCard = "";
        assertFalse(MasterCreditCard.isBrandMaster(emptyCard));
    }

    @Test
    public void verificaNovoBinMaster() {
        String newMasterBin = "2221001231231231";
        assertTrue(MasterCreditCard.isBrandMaster(newMasterBin));
    }

    @Test
    public void verificaSeCartaoMasterNaoEstaNoRangeNovo() {
        String masterNotInRange = "2220001231231231";
        assertFalse(MasterCreditCard.isBrandMaster(masterNotInRange));
    }

    @Test
    public void verificaSeCartaoMasterEstaNoRangeNovo() {
        String newMasterBin = "2720990000000005";
        assertTrue(MasterCreditCard.isBrandMaster(newMasterBin));
    }
}