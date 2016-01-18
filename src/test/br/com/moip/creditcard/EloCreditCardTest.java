package br.com.moip.creditcard;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EloCreditCardTest {

    private static String[] ELO_BINS = {
            "50670", "50671", "50672", "50673", "50674", "50675", "50676", "50900", "50901", "50902","50903", "50904",
            "50905", "50906", "50907", "401178", "401179", "509807", "431274", "438935", "451416", "457393", "457631",
            "457632", "504175", "506707", "506708", "506715", "506717", "506718", "506719", "506720", "506721", "506724",
            "506725", "506726", "506727", "506728", "506729", "506730", "506731", "506732", "506733", "506739", "506740",
            "506741", "506742", "506743", "506744", "506745", "506746", "506747", "506748", "506750", "506751", "506752",
            "506753", "50676", "509000",  "509001", "509002", "509003", "509004", "509005", "509006", "509007", "509008",
            "509009", "509013", "509014", "509015", "509016", "509017", "509018", "509019", "509020", "509021", "509022",
            "509023", "509024", "509025", "509026", "509027", "509028", "509029", "509031", "509032", "509033", "509034",
            "509035", "509036", "509037", "509038", "509039", "509040", "509041", "509042", "509043", "509044", "509045",
            "509046", "509047", "509048", "509049", "509050", "509051", "509052", "509053", "509054", "509055", "509056",
            "509057", "509058", "509059", "509060", "509061", "509062", "509063", "509064", "509066", "509067", "509068",
            "509069", "509070", "509071", "509072", "509074", "509075", "509076", "509077", "509078", "509079", "509080",
            "509081", "509082", "509083", "509084", "509085", "506699", "506770", "506771", "506772", "506773", "506774",
            "506775", "506776", "506777", "506778", "627780", "636297", "636368"
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