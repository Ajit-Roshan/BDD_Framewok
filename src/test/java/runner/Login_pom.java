package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Login_pom{

	WebDriver dr;
	
	By search= By.name("q");
		
	public void eData(String data) {
		dr.findElement(search).sendKeys(data);
	}
	
	public void eKey() {
		dr.findElement(search).sendKeys(Keys.ENTER);
	}
	
	
	
	public Login_pom(WebDriver dr) {
		// TODO Auto-generated constructor stub
		this.dr= dr;
	}

	
}
