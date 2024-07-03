package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import io.cucumber.datatable.DataTable;


public class DataTable_Steps {
	
	@Given("user should be at signup page")
	public void user_should_be_at_signup_page() {
	   
		System.out.println("User is at Signup Page");
	}

	@When("user should click on signup button")
	public void user_should_click_on_signup_button() {
	    
		System.out.println("User clicked on Signup button");
	}

	@When("user should enter the required below information")
	public void user_should_enter_the_required_below_information(DataTable dataTable) {
	   
		    List<List<String>> data = dataTable.asLists(String.class);
		
		      for(List<String> datavalue:data) {
		    	  System.out.println(datavalue);
		      }
	
		      System.out.println(data.get(1));
	           
		      List<String>firstRow=data.get(0);
		      
		           String City=firstRow.get(1);
		      System.out.println("City Name: "+City);
		           
			
		      
	}
	

	@When("user should click on submit button")
	public void user_should_click_on_submit_button() {
	    System.out.println("User clicked on button");
	}

	@Then("user registration done successfully")
	public void user_registration_done_successfully() {
	    
		System.out.println("User is registred successfully");		
	}

	
}
