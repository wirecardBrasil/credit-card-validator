package br.com.moip.creditcard;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HipercardCreditCardTest {

    @Test
    public void verificaCartaoHipercard() throws Exception {
        List<String> numbers = Arrays.asList("6062825624254001", "3841001111222233334",
                "3841401111222233334", "3841601111222233334");
        for (String cardNumber : numbers) {
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

    @Test
    public void verificaCartaoHipercardInvalido(){
        String invalidCard = "606282562";
        assertFalse(HipercardCreditCard.isBrandHipercard(invalidCard));
    }

    @Test
    public void verificaCartaoHipercardComLetra(){
        String invalidCard = "606282562asdf001";
        assertFalse(HipercardCreditCard.isBrandHipercard(invalidCard));
    }

    @Test
    public void verificaCartaoHipercardComCaracterEspecial(){
        String invalidCard = "606282 5624*-254001";
        assertFalse(HipercardCreditCard.isBrandHipercard(invalidCard));
    }

    @Test
    public void verificaSeCartaoHipercardEhNulo(){
        String nullableCard = null;
        assertFalse(HipercardCreditCard.isBrandHipercard(nullableCard));
    }

    @Test
    public void verificaSeCartaoHipercardEhVazio(){
        String emptyCard = "";
        assertFalse(HipercardCreditCard.isBrandHipercard(emptyCard));
    }
}