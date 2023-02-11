#Author: kaiosilva455@gmail.com

Feature: Acessando Site Bradesco
  Como usuario quero acessar site bradesco para validar title

  
  Scenario: Acessando Bradesco
    Given visito o site "https://banco.bradesco/html/classic/index.shtm"
    When vou capturar o title
    Then valido o title do site bradesco

