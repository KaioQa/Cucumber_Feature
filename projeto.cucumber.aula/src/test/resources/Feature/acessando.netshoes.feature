#Author: kaiosilva455@gmail.com

Feature: Acessando o site da Netshoes
  Como usuario quero acessar o site da netshoes para validar o title

  
  Scenario: Acessando a Pagina da Netshoes
    Given que acesso "https://www.netshoes.com.br/"
    When vou capturar o title da netshoes
    Then valido o title da netshoes
  