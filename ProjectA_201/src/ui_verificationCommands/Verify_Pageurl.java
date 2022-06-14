package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify_Pageurl {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		
		if(driver.getCurrentUrl().contains("https://"))
		{
			System.out.println("Secured Protocal");
			WebElement SigninButton=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
			SigninButton.click();
			
			if(driver.getCurrentUrl().contains("https://login.live.com/"))
				System.out.println("Singin page url is verified");
			else
				System.out.println("Signin page url is not verified");
		}
		else
		{
			System.out.println("Non Secured protocal");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
