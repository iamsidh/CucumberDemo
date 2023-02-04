package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPage_POM {

	WebDriver driver=null;

	LoginPage login = new LoginPage(driver);

	@Given("browser is opened using POM")
	public void browser_is_opened() {

		login.initialize();

	}

	@And("user is on login page with POM")
	public void user_is_on_login_page1() {

		login.getURL("https://example.testproject.io/web/");

	}

	@When("^user enters the (.*) and (.*) with POM$")
	public void user_enter_uname_and_pass(String username, String password) {

		login.enterUsername(username);
		login.enterPassword(password);
	}

	@And("click on Login button with POM")
	public void click_on_Loginbutton() {
		login.clickLogin();
	}

	@Then("login should be successful with POM")
	public void login_should_be_successful() {
		/*
		 * if (driver.findElement(By.id("logout")).isDisplayed() == true) {
		 * 
		 * System.out.println("Test Passed"); } else {
		 * System.out.println("Test Failed"); }
		 */

		login.tearDown();
	}
}
