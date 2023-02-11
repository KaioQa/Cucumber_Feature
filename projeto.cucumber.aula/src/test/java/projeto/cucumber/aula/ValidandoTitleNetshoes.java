package projeto.cucumber.aula;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidandoTitleNetshoes {

	WebDriver driver;
	String title;

	@Given("que acesso {string}")
	public void que_acesso(String site) {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
	}

	@When("vou capturar o title da netshoes")
	public void vou_capturar_o_title_da_netshoes() {
		title = driver.getTitle();
	}

	@Then("valido o title da netshoes")
	public void valido_o_title_da_netshoes() {
		assertEquals("Loja de Artigos Esportivos Online | Netshoes", title);
		driver.quit();

	}

}
