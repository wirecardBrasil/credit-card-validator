package br.com.moip.creditcard;

import org.junit.Test;

import static br.com.moip.creditcard.EloCreditCard.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EloCreditCardTest {

    private static String[] ELO_BINS = {
            "401178", "401179", "431274", "438935", "451416", "457393", "457631", "457632", "504175", "627780",
            "636297", "636368"
    };

    @Test
    public void verificaCartaoEloComecandoCom_451416() throws Exception {
        String validCard = "4514160123456789";
        assertTrue(validCard.length() == 16);
        assertTrue(isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloNaoComecandoCom_451416() throws Exception {
        String validCard = "45141601234567890";
        assertFalse(validCard.length() == 16);
        assertFalse(isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloComecandoCom_5067() throws Exception {
        String validCard = "5067012345678901";
        assertTrue(validCard.length() == 16);
        assertTrue(isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloNaoComecandoCom_5067() throws Exception {
        String validCard = "50670123456789010";
        assertFalse(validCard.length() == 16);
        assertTrue(isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoELoNaoComecandoComBinInvalido() throws Exception {
        String validCard = "1111101234567890";
        assertTrue(validCard.length() == 16);
        assertFalse(isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloComecandoComQualquerBin() throws Exception {
        for (String bin : ELO_BINS) {
            String validLengthCard = bin + (bin.length() == 5 ? "01234567890" : "0123456789");
            assertTrue(validLengthCard.length() == 16);
            assertTrue(isBrandElo(validLengthCard));
        }
    }

    @Test
    public void verificaCartaoEloNaoComecandoComQualquerBin() throws Exception {
        for (String bin : ELO_BINS) {
            String invalidLengthCard = bin + (bin.length() == 5 ? "012345678901" : "01234567890");
            assertFalse(invalidLengthCard.length() == 16);
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
}