package stepdef;

import io.cucumber.java8.En;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@RunWith(Cucumber.class)
public class TestSearch implements En {
	
	 public TestSearch() {
	
	Given("user test is already on home page", () -> {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 System.out.println("inside given");
	});

	When("user test clicks search and type laptop", () -> {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 System.out.println("inside when");
	});

	Then("user test should be shown all available laptop in the inventory", () -> {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 System.out.println("inside then");
	});
 }	

}
