package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test1 
{
	
	@Given("site url facebook")
	public void site_url_facebook() 
	{
	   System.out.println("Site url is Opened");
	}
	@When("Enter valid username")
	public void enter_valid_username() 
	{
	    System.out.println("Valid Email entered successfull");
	}
	@When("Enter valid password")
	public void enter_valid_password() 
	{
	   System.out.println("Valid password entered");
	}
	@When("click on login button")
	public void click_on_login_button() 
	{
		System.out.println("Login button Clicked");

	}
	
	@Then("Login will be successful")
	public void all_login_will_be_successful() 
	{
	    System.out.println("As expected login is sucessful");
	}



	

}
