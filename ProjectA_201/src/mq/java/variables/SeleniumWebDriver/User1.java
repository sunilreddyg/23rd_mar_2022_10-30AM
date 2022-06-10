package mq.java.variables.SeleniumWebDriver;

import org.openqa.selenium.WebDriver;

public class User1 
{

	public static void main(String[] args) 
	{
		
		Repository obj=new Repository();
		obj.DriverPath="C:\\Users\\MINDQ\\Desktop\\recent_drivers";
		obj.url="http://facebook.com";
		
		obj.launchchrome();
		obj.Signin_invalid();
		
		WebDriver driver=null;
		driver=obj.driver;  //Assigning repository class variable to current class
		
		System.out.println(driver.getTitle());

	}

}
