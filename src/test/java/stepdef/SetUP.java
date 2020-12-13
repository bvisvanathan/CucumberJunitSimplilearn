package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SetUP {
	
	static WebDriver driver;
	
	@Before
	public void setDriver() {
		
		 driver = new ChromeDriver();
		 System.out.println("inside before  set");
		
	}
	
	@After("@Regression")
    public void closeDriver() {
		System.out.println("inside after class");
		driver.close();
		
	}

}
