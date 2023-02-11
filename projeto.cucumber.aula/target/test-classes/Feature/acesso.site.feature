#Author: kaiosilva455@gmail.com

Feature: Acessar um novo site
  como usuario quero aprender criar novas features para automatizar testes

  
  Scenario: Acessando o site
    Given que eu acesso o site "https://www.saucedemo.com"
    When capturo o title da pagina
    Then valido o title
  

