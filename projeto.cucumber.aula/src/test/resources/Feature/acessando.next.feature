#Author: kaiosilva455@gmail.com

Feature: Acessando Banco Next
  Como usuario quero acessar o banco next para validar title

  
  Scenario: Acessando Banco Next
    Given que entro na pagina "https://next.me/"
    When realizo captura do title
    Then valido title next
    
