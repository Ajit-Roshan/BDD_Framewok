package hook_Step;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HookStep {
	
	@Given("user is on google search")
	public void user_is_on_google_search() {
		System.out.println("given");
	}

	@Then("user enter the data to search")
	public void user_enter_the_data_to_search() {
		System.out.println("then");
	}

	@And("hit enter")
	public void hit_enter() {
		System.out.println("and");
	}

	@BeforeStep
	public void set() {
		System.out.println("set");
	}
	
	@AfterStep
	public void dn() {
		System.out.println("dn");
	}
	
}
