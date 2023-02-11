package projeto.cucumber.aula;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidandoTitleBradescoTeste {

	WebDriver driver;
	String title;

	@Given("visito o site {string}")
	public void visito_o_site(String site) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
	}

	@When("vou capturar o title")
	public void vou_capturar_o_title() {
    title = driver.getTitle();
	}

	@Then("valido o title do site bradesco")
	public void valido_o_title_do_site_bradesco() {
   assertEquals("Banco Bradesco | Entre Nós, Você Vem Primeiro", title);
   driver.quit();
   
	}

}
