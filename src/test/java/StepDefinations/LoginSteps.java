package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("inside Given(\"user is on login page\")");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("inside When(\"user enters username and password\")");
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("inside And(\"user clicks on login button\")");
	}
	
	@Then("user is navigated to home page")
	public void user_navigates_to_login() {
		
		System.out.println("inside Login home");
	}

}
