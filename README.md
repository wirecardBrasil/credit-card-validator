# credit-card-validator

[![Join the chat at https://gitter.im/moip/credit-card-validator](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/moip/credit-card-validator?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![Build Status](https://travis-ci.org/moip/credit-card-validator.svg?branch=master)](https://travis-ci.org/moip/credit-card-validator)

### O que é o credit card validator?

É uma biblioteca que faz a validação das bandeiras e cartões aceitos pelo Moip.

### Usando na sua aplicação

Adicionar a dependência no seu `pom.xml`

```xml
<dependency>
  <groupId>br.com.moip</groupId>
  <artifactId>credit-card-validator</artifactId>
  <version>0.0.2</version>
</dependency>
```

### Validar um número de cartão de crédito

Para todas as validações é retornado um boolean se a condição é valida ou não.

### Validando o número de cartão
```java
new CreditCard("5555666677778884").isValid();   //return true
<<<<<<< HEAD
new CreditCard("129738465").isValid();          //return false
new CreditCard("5555").isValid();               //return false
=======
new CreditCard("129738465"). isValid();          //return false
new CreditCard("5555").isValid;               //return false
>>>>>>> e0304bd8ac5a541eb7e491595c25a1eaee82f411
```

Possiveis retornos:
* True ou False

### Identificando a bandeira do cartão

```java
<<<<<<< HEAD
new CreditCard("5555666677778884").getBrand();       //return MASTERCARD
new CreditCard("4111111111111111").getBrand();       //return VISA
new CreditCard("341111111111111").getBrand();        //return AMEX
new CreditCard("30111122223331").getBrand();         //return DINERS
new CreditCard("3841001111222233334").getBrand();    //return HIPERCARD
new CreditCard("4514160123456789").getBrand();       //return ELO
newCreditCard("6370950000000005").getBrand();        //return HIPER
=======
new CreditCard("5555666677778884").getBrand();    //return MASTERCARD
new CreditCard("4111111111111111").getBrand();    //return VISA
new CreditCard("341111111111111").getBrand();     //return AMEX
new CreditCard("30111122223331").getBrand();      //return DINERS
new CreditCard("3841001111222233334").getBrand(); //return HIPERCARD
new CreditCard("4514160123456789").getBrand();    //return ELO
new CreditCard("6370950000000005").getBrand();    //return HIPER
>>>>>>> e0304bd8ac5a541eb7e491595c25a1eaee82f411
```

Possiveis retornos:
* MASTER;
* VISA;
* AMEX;
* DINERS;
* HIPERCARD;
* ELO;
* HIPER;
