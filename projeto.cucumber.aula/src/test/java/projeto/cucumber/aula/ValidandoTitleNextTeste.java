package projeto.cucumber.aula;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidandoTitleNextTeste {

	WebDriver driver;
	String title;

	@Given("que entro na pagina {string}")
	public void que_entro_na_pagina(String site) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
	}

	@When("realizo captura do title")
	public void realizo_captura_do_title() {
		title = driver.getTitle();
	}

	@Then("valido title next")
	public void valido_title_next() {
		assertEquals("Banco Digital - next", title);
		driver.quit();

	}

}
