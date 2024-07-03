package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {


	@Given("User is at a login screen")
	
	public void preCondition() {
		
		System.out.println("Given is the Precnondition");
	}
	
	@When("User enter the valid Username {string}")
	
	public void enterUserName(String username ) {
		
		System.out.println("Entering the UserName"+username);
	}
	
	@When("User enter the valid Password {int}")
	
	public void enterPassword(Integer pass) {
		System.out.println("Entarimg the Password"+pass);
	}
	
	@Then("User click on Login button")
	public void clickButton() {
		
		System.out.println("Clicking on the Login button");
	}
	
	@Then("User should be login")
	public void loginConfirmation() {
		
		System.out.println("User Should be Login");
	}
	
	
}
