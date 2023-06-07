package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	public static WebDriver dr;
	
	@Given("the user has opened {string} browser")
	public void the_user_has_opened_browser(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		
		if(string.equalsIgnoreCase("chrome")) {
			dr= new ChromeDriver();
			dr.manage().window().maximize();
		}		
	}

	@When("user enter url {string}")
	public void user_enter_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		
		dr.get(string);
	}

	@When("user enter {string} in search box")
	public void user_enter_in_search_box(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		
		System.out.println("input is :: "+string);
		dr.findElement(By.name("q")).sendKeys(string);
	}

	@Then("hit enter")
	public void hit_enter() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		
		dr.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@And("close the started tab")
	public void close_the_started_tab() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		
		dr.close();
	}
	
}
