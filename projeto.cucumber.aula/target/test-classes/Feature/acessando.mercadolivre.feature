#Author: kaiosilva455@gmail.com


Feature: Acessando a pagina do Mercado Livre
  como usuario quero acessar o site do mercado livre para validar o title

  
  Scenario: Acessando site do mercado livre
    Given que eu esteja no site do "https://www.mercadolivre.com.br/"
    When vou capturar o title do ml
    Then valido o title do mercado livre
  