package br.com.moip.validators;

import br.com.moip.creditcard.Brands;
import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class CreditCardTest {

    @Test
    public void deveIdentificarBandeiraMaster(){
        CreditCard creditCard = new CreditCard("5555666677778884");

        Assert.assertEquals(Brands.MASTERCARD, creditCard.getBrand());
    }

    @Test
    public void deveIdentificarBandeiraVisa(){
        CreditCard creditCard = new CreditCard("4073020000000002");

        Assert.assertEquals(Brands.VISA, creditCard.getBrand());
    }

    @Test
    public void deveIdentificarBandeiraElo(){
        CreditCard creditCard = new CreditCard("6362970000457013");

        Assert.assertEquals(Brands.ELO, creditCard.getBrand());
    }

    @Test
    public void deveIdentificarBandeiraDinners(){
        CreditCard creditCard = new CreditCard("30111122223331");

        Assert.assertEquals(Brands.DINNERS, creditCard.getBrand());
    }

    @Test
    public void deveIdentificarBandeiraAmex(){
        CreditCard creditCard = new CreditCard("376411112222331");

        Assert.assertEquals(Brands.AMERICAN_EXPRESS, creditCard.getBrand());
    }

    @Test
    public void deveIdentificarBandeiraHipercard(){
        CreditCard creditCard = new CreditCard("3841009009123456089");

        Assert.assertEquals(Brands.HIPERCARD, creditCard.getBrand());
    }

    @Test
    public void deveIdentificarBandeiraHiper(){
        CreditCard creditCard = new CreditCard("6370950000000005");

        Assert.assertEquals(Brands.HIPER, creditCard.getBrand());
    }
}