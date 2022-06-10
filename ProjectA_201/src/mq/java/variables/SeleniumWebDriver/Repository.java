package mq.java.variables.SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Repository 
{
	String DriverPath;
	WebDriver driver;
	String url;
	
	By email_obj=By.id("email");
	By pwd_obj=By.id("pass");
	
	public void launchchrome()
	{
		System.setProperty("webdriver.chrome.driver", DriverPath+"//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void Signin_valid()
	{
		driver.findElement(email_obj).sendKeys("sunireddy");
		driver.findElement(pwd_obj).sendKeys("hello");
	}
	
	public void Signin_invalid()
	{
		driver.findElement(email_obj).sendKeys("dfjdfd");
		driver.findElement(pwd_obj).sendKeys("sdfjkldjfld");
	}
	
	

}
