package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
(
	features= {"src\\test\\resources\\TestingFolder\\tags.feature"},
	glue= {"steps"},
	plugin={"pretty"},
	publish=true,
	tags="@sanity and @smoke",
	dryRun=false
)


public class TagsRunner extends AbstractTestNGCucumberTests{
		

}
