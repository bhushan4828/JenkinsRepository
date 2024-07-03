package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsStudy {
	
	
	@Given("User is at Campaign Page")
	public void user_is_at_campaign_page() {
	    System.out.println("User is at Campaign Page");
	}

	@When("User click on create campaign")
	public void user_click_on_create_campaign() {
	   System.out.println("Clicked on create Campaign");
	}

	@When("User enter the required information")
	public void user_enter_the_required_information() {
	    System.out.println("Entered the required information");
	}

	@When("User click on save button")
	public void user_click_on_save_button() {
	   System.out.println("Clicked on save button");
	}

	@Then("Campaign should get started")
	public void campaign_should_get_started() {
	    System.out.println("campaign started");
	}

	@When("User click on the scehedule campaign")
	public void user_click_on_the_scehedule_campaign() {
	  System.out.println("Clicked on schedule campaign");
	}

	@When("User  Enter the sending information")
	public void user_enter_the_sending_information() {
	    
		System.out.println("Entered teh sending information");
	}

	@When("User click omn teh schedule button")
	public void user_click_omn_teh_schedule_button() {
	    System.out.println("Cliked on Scehdule button");
		
	}

	@Then("Campaign should get schedule")
	public void campaign_should_get_schedule() {
	   
		System.out.println("Campaign is scheduled");
		
	}

//	@When("User click on the sent Campaign")
//	public void user_click_on_the_sent_campaign() {
//	    
//		System.out.println("Clicked on the sent Campaign");
//	}

	@Then("USer should see the sent campaign")
	public void u_ser_should_see_the_sent_campaign() {
	    
		System.out.println("User is able to see the sent campaign");
	}
	
	
	

}
