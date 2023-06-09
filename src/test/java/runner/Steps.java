package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	public static WebDriver dr;
	
	@Given("user on search page")
	public void user_on_search_page() {
		dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.google.com");
	}
	
	@When("user enter search data and hit hit enter")
	public void user_enter_search_data_and_hit_hit_enter() {
		Login_pom lg= new Login_pom(dr);
		lg.eData("noamundi");
		lg.eKey();
	}
	
	@Then("user should be on result page")
	public void user_should_be_on_result_page() {
		String t= dr.getTitle();
		System.out.println("title is "+t);
		
		dr.close();
	}
	
}
