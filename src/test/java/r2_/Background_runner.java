package r2_;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features"},
		glue = {"backgroundSteps"} , dryRun = false
		)

public class Background_runner {
	

}
