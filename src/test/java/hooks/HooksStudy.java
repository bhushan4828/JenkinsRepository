package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class HooksStudy {
	
	
	@Before(order=2)
	
	public void beforeHooks1() {
		
		System.out.println("Before Hook1 is Executiong");
		
	}
	
    @Before(order=1)
    public void beforeHooks2() {
    	System.out.println("Before Hook2 is executing");
    }
	
	@BeforeStep("@regression")
	public void beforeSteps() {
		
		System.out.println("Before step is executing");
	}
	
	@After(order=1)
	public void afterHooks1() {
		
		System.out.println("After Hook1 is Executing");
	}
	
	@After(order=2)
	public void afterHooks2() {
		System.out.println("After Hook2 is executing");
	}
	
	
	@AfterStep
	
	public void afterSteps() {
		System.out.println("After Step is Executing");
	}
	

}
