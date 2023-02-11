#Author: kaiosilva455@gmail.com

Feature: Acessando o c6 bank
  Como usuario desejo acessar o c6 bank para validar conta

  
  Scenario: Acessando c6 bank
    Given que eu entre na pagina "https://www.c6bank.com.br/"
    When capturo o title do c6 bank
    Then valido o title do c6 bank

 