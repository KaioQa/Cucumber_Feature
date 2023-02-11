package projeto.cucumber.aula;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AcessandoSite {
	WebDriver driver;
	String title;

	@Given("que eu acesso o site {string}")
	public void que_eu_acesso_o_site(String site) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
	}

	@When("capturo o title da pagina")
	public void capturo_o_title_da_pagina() {
		title = driver.getTitle();
	}

	@Then("valido o title")
	public void valido_o_title() {
		assertEquals("Swag Labs", title);
		driver.quit();
	}

}
