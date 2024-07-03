package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutline_step {
	
	@Given("User should Launch Browser")
	public void user_should_launch_browser() {
	   
		System.out.println("Browser has been Launched");
	}

	@Given("User is at a login page")
	public void user_is_at_a_login_page() {
	    System.out.println("User is at login page");
		
	}

	@When("User enters valid email address {string}")
	public void user_enters_valid_email_address(String Email) {
	
		System.out.println("Enter Email Adjdress: "+Email);
	}

	@When("User enters a valid password {string}")
	public void user_enters_a_valid_password(String Pass) {
	    System.out.println("User Enters Password: "+Pass);
	}

	@When("click on login button")
	public void click_on_login_button() {
	 
		System.out.println("Clicked on Login button");
	}

	@Then("User sould mlogin successfully")
	public void user_sould_mlogin_successfully() {
	    System.out.println("Loged in  successfully");
		
	}

	
	
	
}
