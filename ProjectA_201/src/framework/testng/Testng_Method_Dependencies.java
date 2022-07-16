package framework.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testng_Method_Dependencies
{
	
	@BeforeClass
	public void SetUp_browser()
	{
		System.out.println("Set all desired capabilites");
	}
	

	@Test(priority=0)
	public void Browser_launch()
	{
		Assert.assertTrue(true);
		Reporter.log("Browser launch successfull");
	}
	
	
	@Test(priority=1,dependsOnMethods="Browser_launch")
	public void App_Load()
	{
		Assert.assertEquals("Sign In", "Sign In");
		Reporter.log("Load application successfull");
	}
	
	@Test(priority=2,dependsOnMethods="App_Load")
	public void User_login()
	{
		Assert.assertEquals("email", "email");
		Reporter.log("Account login successfull");
	}
	

	@Test(priority=3,dependsOnMethods="User_login")
	public void ComposeEmail()
	{
		Assert.assertEquals("msg", "emsg");
		Reporter.log("Email sent successfull");
	}
	
	
	@Test(priority=4,dependsOnMethods="User_login")
	public void Search_email()
	{
		Assert.assertEquals("mail", "mail");
		Reporter.log("Email found");
	}
	
	@Test(priority=5,dependsOnMethods="User_login")
	public void Verify_Email_At_inbox()
	{
		Assert.assertEquals("user", "user");
		Reporter.log("email found at inbox");
	}
	
	@Test(priority=6,dependsOnMethods= {"ComposeEmail","User_login"})
	public void Verify_Email_At_Sentemails_AfterSendEmail()
	{
		Assert.assertTrue(true);
		Reporter.log("Sent mail found");
	}
	
	
	@Test(priority=7,dependsOnMethods="User_login")
	public void User_Signout()
	{
		Assert.assertEquals("Log In", "Log In");
		Reporter.log("Account signout successfull");
	}
	

	@AfterClass
	public void Close_browser()
	{
		System.out.println("browser closed");
		
	}


}
