package projeto.cucumber.aula;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidandoTitleMercadoLivreTeste {
	
	WebDriver driver;
	String title;
	
	@Given("que eu esteja no site do {string}")
	public void que_eu_esteja_no_site_do(String site) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(site);
        driver.manage().window().maximize();
	}

	@When("vou capturar o title do ml")
	public void vou_capturar_o_title_do_ml() {
	    title = driver.getTitle();
	}

	@Then("valido o title do mercado livre")
	public void valido_o_title_do_mercado_livre() {
	   assertEquals("Mercado Livre Brasil - Frete Grátis no mesmo dia", title);
	   driver.quit();
	}

}
