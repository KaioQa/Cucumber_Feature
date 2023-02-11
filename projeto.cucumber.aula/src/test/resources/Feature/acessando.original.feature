#Author: kaiosilva455@gmail.com



Feature: Acessando o site Banco Original
  Como usuario quero acessar o site do banco original para validar o title do site

  
  Scenario: Acessando Banco Original
    Given que eu navego ate o site "https://www.original.com.br/"
    When vou capturar o title do banco original
    Then valido o title do banco original
