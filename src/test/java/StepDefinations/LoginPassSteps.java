package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginPassSteps {

	WebDriver driver = null;

	@Given("browser is opened")
	public void browser_is_opened() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

	}

	@And("user is on login page1")
	public void user_is_on_login_page1() {
		
		driver.navigate().to("https://example.testproject.io/web/");
		driver.getPageSource().contains("Login");
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_uname_and_pass(String username, String password) {

		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("click on Login button")
	public void click_on_Loginbutton() {
		driver.findElement(By.id("login")).click();
	}

	@Then("login should be successful")
	public void login_should_be_successful() {
		if (driver.findElement(By.id("logout")).isDisplayed() == true) {

			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

		driver.close();
		driver.quit();
	}
}
