package br.com.moip.validators;


import br.com.moip.creditcard.Brands;

public class CreditCard {

    private String creditCard;

    public CreditCard(String creditCard){
        this.creditCard = creditCard;
    }

    public Brands getBrand(){

        return Brands.UNKNOWN;
    }

    public boolean isValid(){

        return false;
    }
}
