package r1_;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"Features"}
				, glue = {"stepDefinitions"} 
				 ,dryRun = false
			)

public class estunner {

}
