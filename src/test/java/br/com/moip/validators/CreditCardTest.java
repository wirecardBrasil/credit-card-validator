package br.com.moip.validators;

import org.junit.Test;

import static br.com.moip.creditcard.Brands.AMERICAN_EXPRESS;
import static br.com.moip.creditcard.Brands.DINERS;
import static br.com.moip.creditcard.Brands.ELO;
import static br.com.moip.creditcard.Brands.HIPER;
import static br.com.moip.creditcard.Brands.HIPERCARD;
import static br.com.moip.creditcard.Brands.MASTERCARD;
import static br.com.moip.creditcard.Brands.VISA;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CreditCardTest {

    @Test
    public void deveIdentificarBandeiraMaster() {
        CreditCard creditCard = new CreditCard("5555666677778884");
        assertEquals(MASTERCARD, creditCard.getBrand());
    }

    @Test
    public void deveIdentificarBandeiraVisa() {
        CreditCard creditCard = new CreditCard("4073020000000002");
        assertEquals(VISA, creditCard.getBrand());
    }

    @Test
    public void deveIdentificarBandeiraElo() {
        CreditCard creditCard = new CreditCard("6362970000457013");
        assertEquals(ELO, creditCard.getBrand());
    }

    @Test
    public void deveIdentificarBandeiraDinners() {
        CreditCard creditCard = new CreditCard("30111122223331");
        assertEquals(DINERS, creditCard.getBrand());
    }

    @Test
    public void deveIdentificarBandeiraAmex() {
        CreditCard creditCard = new CreditCard("376411112222331");
        assertEquals(AMERICAN_EXPRESS, creditCard.getBrand());
    }

    @Test
    public void deveIdentificarBandeiraHipercard() {
        CreditCard creditCard = new CreditCard("6062825624254001");
        assertEquals(HIPERCARD, creditCard.getBrand());
    }

    @Test
    public void deveIdentificarBandeiraHiper() {
        CreditCard creditCard = new CreditCard("6370950000000005");
        assertEquals(HIPER, creditCard.getBrand());
    }

    @Test
    public void deveRetornarFalseCasoCartaoForNulo() {
        CreditCard nullableCard = new CreditCard(null);
        assertFalse(nullableCard.isValid());
    }

    @Test
    public void deveRetornarFalseCasoCartaoForInvalido() {
        CreditCard creditCard = new CreditCard("7532465fd187hbf1");
        assertFalse(creditCard.isValid());
    }
    public void deveRetornarFalseCasoCartaoRecebeLetra() {
        CreditCard creditCard = new CreditCard("555a6667778884");
        assertFalse(creditCard.isValid());
    }

    public void deveRetornarFalseCasoCartaoRecebeCaracterEspecial() {
        CreditCard creditCard = new CreditCard("5555 666677778884");
        assertFalse(creditCard.isValid());
    }

    @Test
    public void deveRetornarFalseCasoCartaoRecebaUmDigito() {
        CreditCard creditCard = new CreditCard("5");
        assertFalse(creditCard.isValid());
    }

    @Test
    public void deveRetornarFalseCasoCartaoRecebeValorVazio() {
        CreditCard creditCard = new CreditCard("");
        assertFalse(creditCard.isValid());
    }

    @Test
    public void deveRetornarTrueCasoCartaoEhMaster() {
        CreditCard creditCard = new CreditCard("5555666677778884");
        assertTrue(creditCard.isValid());
    }

    @Test
    public void deveRetornarTrueCasoCastaoEhVisa() {
        CreditCard creditCard = new CreditCard("4073020000000002");
        assertTrue(creditCard.isValid());
    }

    @Test
    public void deveRetornarTrueCasoCartaoEhElo() {
        CreditCard creditCard = new CreditCard("6362970000457013");
        assertTrue(creditCard.isValid());
    }

    @Test
    public void deveRetornarTrueCasoCartaoEhDiners() {
        CreditCard creditCard = new CreditCard("30111122223331");
        assertTrue(creditCard.isValid());
    }

    @Test
    public void deveRetornarTrueCasoCartaoEhAmex() {
        CreditCard creditCard = new CreditCard("376411112222331");
        assertTrue(creditCard.isValid());
    }

    @Test
    public void deveRetornarTrueCasoCartaoEhHipercard() {
        CreditCard creditCard = new CreditCard("6062825624254001");
        assertTrue(creditCard.isValid());
    }

    @Test
    public void deveRetornarTrueCasoCartaoEhHiper() {
        CreditCard creditCard = new CreditCard("6370950000000005");
        assertTrue(creditCard.isValid());
    }

    @Test
    public void deveValidarCartaoCom14Digitos() {
        CreditCard creditCard = new CreditCard("41111111111111");
        assertFalse(creditCard.isValid());
    }

    @Test
    public void deveValidarCartaoComBinComEspaco() {
        CreditCard creditCard = new CreditCard("  411111111111111");
        assertFalse(creditCard.isValid());
    }

    @Test
    public void deveValidarCartaoComEspacos() {
        CreditCard creditCard = new CreditCard("4012.0010 3844  3335");
        assertTrue(creditCard.isValid());
    }

    @Test
    public void deveRetornarTrueCasoCartaoEhHipercard19Digitos() {
        CreditCard creditCard = new CreditCard("3841000000000011111");
        assertTrue(creditCard.isValid());
    }
}