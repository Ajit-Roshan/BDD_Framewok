package backgroundSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Bacckground_Steps {
	
	@Given("when the browser is open")
	public void when_the_browser_is_open() {
		System.out.println("1");
	}

	@Then("user enter the url ={string}")
	public void user_enter_the_url(String string) {
		System.out.println("2 "+string);
	}

	@And("user is in the google search page")
	public void user_is_in_the_google_search_page() {
		System.out.println("3");
	}
 
	@Then("user enter the data need to be searched {string}")
	public void user_enter_the_data_need_to_be_searched(String string) {
		System.out.println("4 "+string);
	}

	@And("press enter")
	public void press_enter() {
		System.out.println("5");
	}



	
}
