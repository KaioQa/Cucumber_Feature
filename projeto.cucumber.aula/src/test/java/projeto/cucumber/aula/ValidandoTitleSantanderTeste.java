package projeto.cucumber.aula;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidandoTitleSantanderTeste {

	WebDriver driver;
	String title;

	@Given("acesso a url {string}")
	public void acesso_a_url(String site) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
	}

	@When("pegar o title")
	public void pegar_o_title() {
     title = driver.getTitle();
	}

	@Then("valido title santander")
	public void valido_title_santander() {
     assertEquals("Santander", title);
     driver.quit();
	}

}
