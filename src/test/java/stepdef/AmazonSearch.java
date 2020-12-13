package stepdef;

import cucumber.api.PendingException;

import cucumber.api.junit.Cucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class AmazonSearch {
	
	
	

	    @When("^user clicks search and type laptop$")
	    public void user_clicks_search_and_type_something() throws Throwable {
	    	System.out.println("inside when");
	    	//throw new PendingException();
	    }

	    @Then("^user should be shown all available laptop in the inventory$")
	    public void user_should_be_shown_all_available_something_in_the_inventory() throws Throwable {
	    	System.out.println("inside then");
	    	//throw new PendingException();
	    }

	
	

}
