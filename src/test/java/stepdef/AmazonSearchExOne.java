package stepdef;

import cucumber.api.junit.Cucumber;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@RunWith(Cucumber.class)
public class AmazonSearchExOne {
	
	WebDriver driver = SetUP.driver;
	ExtentReports extent;
    ExtentTest logger;
	
	@Given("^user should open chrome browser$")
    public void user_should_open_chrome_browser() throws Throwable {
        //throw new PendingException();
		// driver = new ChromeDriver();
	     //System.setProperty("webdriver.chrome.driver","/home/balajivisvanath/Downloads/chromedriver");
		             		
		
		 System.out.println("inside background given"); 
    }
	
	@Given("^user is already on home page$")
	public void user_is_already_on_home_page() throws Throwable {
	     System.out.println("inside given"); 
	     driver.get("https://www.amazon.in/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		 //throw new PendingException();
	    }
	
	

    
    @When("^user clicks search and type \"([^\"]*)\"$")
    public void user_clicks_search_and_type_something(String productname) throws Throwable {
        //throw new PendingException();
    	extent = new ExtentReports (System.getProperty("user.dir") +"/extent.html", false);
        
        logger = extent.startTest(productname);
        
        logger.log(LogStatus.PASS, "Search in the Amazon Search bar " +  productname);
    	  WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
          Search.sendKeys(productname);
          
     
          WebElement Submit = driver.findElement(By.xpath("//*[@value='Go']"));
          Submit.click();
    	System.out.println("inside when");
    }

    @Then("^user should be shown all available \"([^\"]*)\" in the inventory$")
    public void user_should_be_shown_all_available_something_in_the_inventory(String productname) throws Throwable {
       // throw new PendingException();
    	System.out.println("inside then");
    	extent.endTest(logger);
        extent.flush();
        extent.close();
    }

    @But("^user should not see the \"([^\"]*)\"$")
    public void user_should_not_see_the_something(String excludedproduct) throws Throwable {
       // throw new PendingException();
    	System.out.println("but");
    }

}
