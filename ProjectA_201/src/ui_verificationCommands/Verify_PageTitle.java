package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify_PageTitle 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		
		String Exp_title="Outlook – free personal email and calendar from Microsoft";
		
		if(driver.getTitle().equals(Exp_title))
		{
			System.out.println("Expected title presented");
			
			WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
			Signin_btn.click();
			
			if(driver.getTitle().contains("Sign in"))
			{
				System.out.println("Login page loaded");
			}
			else
			{
				System.out.println("Login page title is mismatched");
			}
			
		}
		else
		{
			System.out.println("Wrong title presented");
		}
		
		
		
		

	}

}
