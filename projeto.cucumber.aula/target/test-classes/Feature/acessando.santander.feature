#Author:kaiosilva455@gmail.ocm


Feature: Acessando o site Santander
  Como usuario quero acessar o site do santander para validar title

  
  Scenario: Acessando Santander
    Given acesso a url "https://www.santander.com.br/"
    When pegar o title
    Then valido title santander
    
   