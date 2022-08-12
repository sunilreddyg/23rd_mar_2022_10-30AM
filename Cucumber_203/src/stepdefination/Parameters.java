package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parameters 
{
	
	@Given("Open browser {string}")
	public void open_browser(String string) 
	{
	   System.out.println(string+"=>  Chrome browser is opened");
	}
	@Given("type url as {string}")
	public void type_url_as(String string) 
	{
	    System.out.println("Url Typed --->"+string);
	}
	@When("user type firstname as {string}")
	public void user_type_firstname_as(String string) 
	{
	   System.out.println(string);
	}
	@When("type Surname as {string}")
	public void type_surname_as(String string) 
	{
	   System.out.println(string);
	}
	@When("type email as {string}")
	public void type_email_as(String string) 
	{
	   System.out.println(string);
	}
	@When("age selected {int}")
	public void age_selected(Integer int1) 
	{
	  System.out.println(int1);
	}
	@When("click on create account button")
	public void click_on_create_account_button() 
	{
	   System.out.println("Button clicked");
	}
	
	@Then("verify status message displayed as {string}")
	public void verify_status_message_displayed_as(String string) 
	{
	   System.out.println(string);
	}



}
