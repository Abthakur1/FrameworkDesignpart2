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
		monochrome = true,
		tags= {"@Regression,@Smoke"} // regression bhi chalega and smoke bhi chalega "@Regression","@Smoke"-- in this case both tags should be there in the scenrio
		
		)
public class TestRuns {

}
