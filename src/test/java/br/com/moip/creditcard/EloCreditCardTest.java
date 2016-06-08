package br.com.moip.creditcard;

import org.junit.Test;

import static br.com.moip.creditcard.EloCreditCard.ELO_BINS;
import static br.com.moip.creditcard.EloCreditCard.isBrandElo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class EloCreditCardTest {

    @Test
    public void verificaCartaoEloComecandoComQualquerBin() throws Exception {
        for (String bin : ELO_BINS) {
            String validLengthCard = bin + (bin.length() == 5 ? "01234567890" : "0123456789");
            assertTrue(isBrandElo(validLengthCard));
        }
    }

    @Test
    public void verificaCartaoEloNaoComecandoComQualquerBin() throws Exception {
        for (String bin : ELO_BINS) {
            String invalidLengthCard = bin + (bin.length() == 5 ? "012345678901" : "01234567890");
            assertFalse(isBrandElo(invalidLengthCard));
        }
    }

    @Test
    public void verificaCartaoEloInformandoCartaoVisa() {
        String validCard = "4073020000000002";
        assertFalse(isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloInformandoCartaoAmex() {
        String validCard = "376411112222331";
        assertFalse(isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloInformandoCartaoHiper() {
        String validCard = "6370950000000005";
        assertFalse(isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloInformandoCartaoMaster() {
        String validCard = "5555666677778884";
        assertFalse(isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloInformandoCartaoHipercard() {
        String validCard = "6062825624254001";
        assertFalse(isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloInformandoCartaoDiners() {
        String validCard = "30111122223331";
        assertFalse(isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloInvalido() {
        String invalidCard = "63629700";
        assertFalse(isBrandElo(invalidCard));
    }

    @Test
    public void verificaCartaoEloComLetra() {
        String validCard = "636297qwe04573";
        assertFalse(isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloComCaracterEspecial() {
        String validCard = "63629700 004 57013";
        assertFalse(isBrandElo(validCard));
    }

    @Test
    public void verificaSeCartaoEloEhNulo() {
        String nullCard = null;
        assertFalse(isBrandElo(nullCard));
    }

    @Test
    public void verificaSeCartaoEhVazio() {
        String voidCard = "";
        assertFalse(isBrandElo(voidCard));
    }

    @Test
    public void verificaSeOCartaoEstaNoRange() {
        String cardInRange = "6362970000457013";
        assertTrue(isBrandElo(cardInRange));
    }

    @Test
    public void verificaSeCartaoEstaNoPrimeiroRange() {
        String cardInRange = "5066991234567890";
        assertTrue(isBrandElo(cardInRange));
    }

    @Test
    public void verificaSeCartaoEstaNoUltimoRange() {
        String cardInRange = "6550211234567890";
        assertTrue(isBrandElo(cardInRange));
    }

    @Test
    public void verificaSeCartaoEhUltimoNoRange() {
        String cardInRange = "6550581234567890";
        assertTrue(isBrandElo(cardInRange));
    }

    @Test
    public void verificaSeBin636368Funciona(){
        String card = "6363681231231232";
        assertTrue(isBrandElo(card));
    }

    @Test
    public void verificaSeBin636369Funciona(){
        String card = "6363691231231232";
        assertTrue(isBrandElo(card));
    }

}