package oops.Inheritance.webdriver;

import org.openqa.selenium.By;

public class Testcases extends Common_Reusable_Actions
{
	String url="http://facebook.com";
	By UID=By.id("email");
	By PWD=By.id("pass");
	
	
	public void setupbrowser()
	{
		
		LaunchBrowser("firefox");
		load_webpage(url);
		System.out.println(driver.getTitle());
	    set_explicitwait_time(30);
	}
	
	public void userlogin()
	{
		driver.findElement(UID).sendKeys("Darshan");
		driver.findElement(PWD).sendKeys("Hello");
	}
	
	public void endbrowser()
	{
		close_browser();
	}

}
