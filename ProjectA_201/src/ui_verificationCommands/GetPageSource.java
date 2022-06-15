package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetPageSource {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		//Get Current window page source
		String Pagesource=driver.getPageSource();
		
		if(Pagesource.contains("email"))
		{
			driver.findElement(By.id("email")).sendKeys("Darshan");
		}
		else
		{
			System.out.println("Element Not presented at source");
		}
		
		
		//To Handle NoSuchelement exception we can
		//Try catch exception handling..
		
		
		try {
			driver.findElement(By.id("pass")).sendKeys("Hello");
		} catch (Exception e) {
			System.out.println("Password element not presented at source");
		}
		
		

	}

}
