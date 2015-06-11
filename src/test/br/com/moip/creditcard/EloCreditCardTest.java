package br.com.moip.creditcard;

import org.junit.Test;

import static org.junit.Assert.*;

public class EloCreditCardTest {

    private static String[] ELO_BINS = {
            "50670", "50671", "50672", "50673", "50674", "50675", "50676", "50900", "50901", "50902",
            "50903", "50904", "50905", "50906", "50907", "401178", "401179", "431274", "438935", "451416",
            "457393", "457631", "457632", "504175", "506699", "506770", "506771", "506772", "506773", "506774",
            "506775", "506776", "506777", "506778", "509080", "509081", "509082", "509083", "627780", "636297"
    };

    @Test
    public void verificaCartaoEloComecandoCom_451416() throws Exception {
        String validCard = "4514160123456789";
        assertTrue(validCard.length() == 16);
        assertTrue(EloCreditCard.isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloNaoComecandoCom_451416() throws Exception {
        String validCard = "45141601234567890";
        assertFalse(validCard.length() == 16);
        assertFalse(EloCreditCard.isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloComecandoCom_5067() throws Exception {
        String validCard = "5067012345678901";
        assertTrue(validCard.length() == 16);
        assertTrue(EloCreditCard.isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloNaoComecandoCom_5067() throws Exception {
        String validCard = "50670123456789010";
        assertFalse(validCard.length() == 16);
        assertFalse(EloCreditCard.isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoELoNaoComecandoComBinInvalido() throws Exception {
        String validCard = "1111101234567890";
        assertTrue(validCard.length() == 16);
        assertFalse(EloCreditCard.isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloComecandoComQualquerBin() throws Exception {
        for (String bin : ELO_BINS) {
            String validLengthCard = bin + (bin.length() == 5 ? "01234567890" : "0123456789");
            assertTrue(validLengthCard.length() == 16);
            assertTrue(EloCreditCard.isBrandElo(validLengthCard));
        }
    }

    @Test
    public void verificaCartaoEloNaoComecandoComQualquerBin() throws Exception {
        for (String bin : ELO_BINS) {
            String invalidLengthCard = bin + (bin.length() == 5 ? "012345678901" : "01234567890");
            assertFalse(invalidLengthCard.length() == 16);
            assertFalse(EloCreditCard.isBrandElo(invalidLengthCard));
        }
    }

    @Test
    public void verificaCartaoEloInformandoCartaoVisa(){
        String validCard = "4073020000000002";
        assertFalse(EloCreditCard.isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloInformandoCartaoAmex(){
        String validCard = "376411112222331";
        assertFalse(EloCreditCard.isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloInformandoCartaoHiper(){
        String validCard = "6370950000000005";
        assertFalse(EloCreditCard.isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloInformandoCartaoMaster(){
        String validCard = "5555666677778884";
        assertFalse(EloCreditCard.isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloInformandoCartaoHipercard(){
        String validCard = "6062825624254001";
        assertFalse(EloCreditCard.isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloInformandoCartaoDiners(){
        String validCard = "30111122223331";
        assertFalse(EloCreditCard.isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloInvalido(){
        String validCard = "63629700";
        assertFalse(EloCreditCard.isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloComLetra(){
        String validCard = "636297qwe04573";
        assertFalse(EloCreditCard.isBrandElo(validCard));
    }

    @Test
    public void verificaCartaoEloComCaracterEspecial(){
        String validCard = "63629700 004 57013";
        assertFalse(EloCreditCard.isBrandElo(validCard));
    }

    @Test
    public void verificaSeCartaoEloEhNulo(){
        String validCard = null;
        assertFalse(EloCreditCard.isBrandElo(validCard));
    }

    @Test
    public void verificaSeCartaoEhVazio(){
        String validCard = "";
        assertFalse(EloCreditCard.isBrandElo(validCard));
    }
}