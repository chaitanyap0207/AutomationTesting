package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions
		(
				features=".//FeatureFiles/login.feature",
				glue="stepDefinitions",stepNotifications=true,
				dryRun=false,
				plugin= { "pretty",
						  "html:test-output"}
				
		)
public class Testrun {
	

}
