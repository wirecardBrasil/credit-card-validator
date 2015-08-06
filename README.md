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
  <version>0.0.1</version>
</dependency>
```

### Validar um número de cartão de crédito

Para todas as validações é retornado um boolean se a condição é valida ou não.

### Validando o número de cartão
```java
CreditCard.isValid("5555666677778884");   //return true
CreditCard.isValid("129738465");          //return false
CreditCard.isValid("5555");               //return false
```

Possiveis retornos:
* True ou False

### Identificando a bandeira do cartão

```java
CreditCard.getBrand("5555666677778884");    //return MASTERCARD
CreditCard.getBrand("4111111111111111");    //return VISA
CreditCard.getBrand("341111111111111");     //return AMEX
CreditCard.getBrand("30111122223331");      //return DINERS
CreditCard.getBrand("3841001111222233334"); //return HIPERCARD
CreditCard.getBrand("4514160123456789");    //return ELO
CreditCard.getBrand("6370950000000005");    //return HIPER
```

Possiveis retornos:
* MASTER;
* VISA;
* AMEX;
* DINERS;
* HIPERCARD;
* ELO;
* HIPER;
