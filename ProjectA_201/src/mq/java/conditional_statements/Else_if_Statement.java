package mq.java.conditional_statements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Else_if_Statement {

	public static void main(String[] args) 
	{
		//Multile decision statements take place here
		String browser="ie";
		
		if(browser.equals("firefox"))
		{
			System.out.println("Firefox is Launched");
		}
		else if (browser.equals("chrome")) 
		{
			System.out.println("Chrome is launched");
		}
		else if (browser.equals("ie")) 
		{
			System.out.println("IE browser is launched");
		} 
		else 
		{
			System.out.println("Browser is mismatched");
		}
		
		
		
		//Cross Browser automation
		
		WebDriver driver=null;
		String bname="chrome";
		String driverpath="C:\\Users\\MINDQ\\Desktop\\recent_drivers\\";
		
		if(bname.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", driverpath+"geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(bname.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", driverpath+"chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.get("http:///facebook.com");
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
		
		
		
	 
	 

	}

}
