package projeto.cucumber.aula;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidandoTitleItau {

	WebDriver driver;
	String title;

	@Given("que eu entre na pagina do {string}")
	public void que_eu_entre_na_pagina_do(String site) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
	}

	@When("eu realizar a captura do title do itau")
	public void eu_realizar_a_captura_do_title_do_itau() {
      title = driver.getTitle();
	}

	@Then("valido o title do itau")
	public void valido_o_title_do_itau() {
    assertEquals("Banco Itaú | Feito com você", title);
    driver.quit();
	}

}
