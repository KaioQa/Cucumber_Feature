package projeto.cucumber.aula;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidandoTitleC6bankTeste {
	WebDriver driver;
	String title;

	@Given("que eu entre na pagina {string}")
	public void que_eu_entre_na_pagina(String site) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
	}

	@When("capturo o title do c6 bank")
	public void capturo_o_title_do_c6_bank() {
      title = driver.getTitle();
      
	}

	@Then("valido o title do c6 bank")
	public void valido_o_title_do_c6_bank() {
     assertEquals("C6 Bank: Banco Completo, com Conta Digital, Cartão de Crédito e mais", title);
     driver.quit();
	}

}
