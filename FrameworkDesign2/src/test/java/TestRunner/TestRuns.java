package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//format = {"pretty", "html:test-output"}
		features ="src/test/java/Features/FlightsSite.feature",
		glue= {"StepDefinitions"},
		plugin = { "pretty" , "html:test-output/cucumber-reports"},
		dryRun = false,
		monochrome = true
		
		)
public class TestRuns {

}
