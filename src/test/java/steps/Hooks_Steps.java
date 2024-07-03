package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks_Steps {

	@Given("User should at home page")
	public void user_should_at_home_page() {
	    System.out.println("User is at home Page");
	}

	@When("User clicks on add profile button")
	public void user_clicks_on_add_profile_button() {
	    System.out.println("User clicks on add profile button");
		
	}

	@When("User upload the Image")
	public void user_upload_the_image() {
	   System.out.println("User uploaded image");
	}

	@Then("User Profile should get added")
	public void user_profile_should_get_added() {
	    
		System.out.println("User profile is added");
	}

	@When("User clicks on edit button")
	public void user_clicks_on_edit_button() {
	   System.out.println("User clicks on edit button");
	}

	@Then("User profile should get updated")
	public void user_profile_should_get_updated() {
	    
		System.out.println("User profile is updated");
	}

	@When("User clicks on delete profile button")
	public void user_clicks_on_delete_profile_button() {
	    System.out.println("User clicks on delete profile button");
	}

	@Then("Profile should get deleted")
	public void profile_should_get_deleted() {
	    System.out.println("User profile is deleted");
	}

	
	
	
}
