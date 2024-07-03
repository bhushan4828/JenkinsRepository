package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\TestingFolder\\dataTable.feature"},		
	    glue= {"steps"},
	    publish=true,
	    plugin= {"pretty","html:target/cucumber-reports.html"}
		
  )

public class LoginRunner extends AbstractTestNGCucumberTests {

	
	
}
