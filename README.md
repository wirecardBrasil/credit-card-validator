# credit-card-validator


### O que é o credit card validator?

É uma biblioteca que faz a validação das bandeiras e cartões aceitos pelo Moip.

### Validar um número de cartão de crédito

Para todas as validações é retornado um boolean se a condição é valida ou não.

### Validando o número de cartão
```
CreditCard.Brands.isValid("5555666677778884");     //return true
CreditCard.Brands.isValid("129738465");           //return false
CreditCard.Brands.isValid("5555");               //return false
```

Possiveis retornos:
* True ou False

### Identificando a bandeira do cartão

```
CreditCard.MasterCreditCard.isBrandMaster("5555666677778884");    //return MASTERCARD
CreditCard.VisaCreditCard.isBrandVisa("4111111111111111");       //return VISA
CreditCard.AmexCreditCard.isBrandAmex("341111111111111");       //return AMEX
CreditCard.DinersCreditCard.isBrandDiners("30111122223331");    //return DINERS
CreditCard.HipercardCreditCard.isBrandHipercard("3841001111222233334");   //return HIPERCARD
CreditCard.EloCreditCard.isBrandElo("4514160123456789");        //return ELO
CreditCard.HiperCreditCard.isBrandHiper("6370950000000005");   //return HIPER
```

Possiveis retornos:
* MASTER;
* VISA;
* AMEX;
* DINERS;
* HIPERCARD;
* ELO;
* HIPER;
