package projeto.cucumber.aula;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidandoTitleBancoOriginalTeste {

	WebDriver driver;
	String title;

	@Given("que eu navego ate o site {string}")
	public void que_eu_navego_ate_o_site(String site) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();

	}

	@When("vou capturar o title do banco original")
	public void vou_capturar_o_title_do_banco_original() {
		title = driver.getTitle();

	}

	@Then("valido o title do banco original")
	public void valido_o_title_do_banco_original() {
		assertEquals("Banco Original: banco digital para Pessoa Física e Jurídica", title);
		driver.quit();

	}

}
