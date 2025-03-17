package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src\\test\\java\\Feature\\OHRM.feature",
		glue="stepDefination",
				plugin = {"pretty", "html:target/Reports/cucumber-reports.html"},

				monochrome = true, 
				dryRun=false
		
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {

	
	
}
