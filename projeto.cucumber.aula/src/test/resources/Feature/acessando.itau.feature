#Author: kaiosilva455@gmail.com


Feature: Acessando Itau
  Como usuario quero acessar o site do itau

  
  Scenario: Acessando itau
    Given que eu entre na pagina do "https://www.itau.com.br/"
    When eu realizar a captura do title do itau
    Then valido o title do itau
    