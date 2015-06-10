package br.com.moip.creditcard;

import org.junit.Test;

import static org.junit.Assert.*;

public class MasterCreditCardTest {

    @Test
    public void verificaCartaoMaster(){
        String validCard = "5555666677778884";
        assertTrue(validCard.length() == 16);
        assertTrue(MasterCreditCard.isBrandMaster(validCard));
    }

    @Test
    public void verificaCartaoMasterInformandoCartaoVisa(){
        String validCard = "4073020000000002";
        assertFalse(MasterCreditCard.isBrandMaster(validCard));
    }

    @Test
    public void verificaCartaoMasterInformandoCartaoAmex(){
        String validCard = "376411112222331";
        assertFalse(MasterCreditCard.isBrandMaster(validCard));
    }

    @Test
    public void verificaCartaoMasterInformandoCartaoDiners(){
        String validCard = "30111122223331";
        assertFalse(MasterCreditCard.isBrandMaster(validCard));
    }

    @Test
    public void verificaCartaoMasterInformandoCartaoHiper(){
        String validCard = "6370950000000005";
        assertFalse(MasterCreditCard.isBrandMaster(validCard));
    }

    @Test
    public void verificaCartaoMasterInformandoCartaoHipercard(){
        String validCard = "6062825624254001";
        assertFalse(MasterCreditCard.isBrandMaster(validCard));
    }

    @Test
    public void verificaCartaoMasterInformandoCartaoElo(){
        String validCard = "6362970000457013";
        assertFalse(MasterCreditCard.isBrandMaster(validCard));
    }
}