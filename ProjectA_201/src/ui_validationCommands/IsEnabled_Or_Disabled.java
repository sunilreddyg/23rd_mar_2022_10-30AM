package ui_validationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_Or_Disabled 
{

	public static void main(String[] args) throws Exception 
	{
		

	
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  	
		driver.get("https://www.instagram.com/accounts/emailsignup/");  
		driver.manage().window().maximize();  
		Thread.sleep(5000);
		
		/*
		 * Check Singup button by default disabled before enter
		 * valid Credentials..
		 */
								
		WebElement Signup=driver.findElement(By.xpath("//button[contains(.,'Sign up')]"));
		if(!Signup.isEnabled())
			System.out.println("Object is disabled For enter credentials");
		else
			System.out.println("Tesfail, Object is Enabled before enter credentials");
			
		
		

	}

}
