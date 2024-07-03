package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination2 {
	
	@Given("User should launched the browser")
	public void launchedBrowser() {
		System.out.println("Broswer is launching");
	}

	
	@When("User enter the valid Username")
	
	public void enterUserName() {
		
		System.out.println("Entering the UserName");
	}
	
	@When("User enter the valid Password")
	
	public void enterPassword() {
		System.out.println("Entarimg the Password");
	}
	
	
	
	
	@Given("User should be at the order page in application")
	public void user_should_be_at_teh_order_page_in_application() {

		System.out.println("User is at Order Page");
		
	}

	@When("User should click on past orders")
	public void user_should_click_on_past_orders() {
	    System.out.println("User is clicking on tyhe past order");
	}

	@When("User should click on the current orders")
	public void user_should_click_on_the_current_orders() {
	   
		System.out.println("User is clciking on the current order");
	}

	@When("User should click on future orders")
	public void user_should_click_on_future_orders() {
	    System.out.println("user is clciking on the future orders");
	 
	}

	@Then("User shpould be able to see all the order details")
	public void user_shpould_be_able_to_see_all_the_order_details() {

		System.out.println("User is able to see all the order details");
	}
	
} 

