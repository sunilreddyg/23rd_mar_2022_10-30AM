package ui_verificationCommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Option_Availability 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:--> Verify Expected City Available at City Dropdown
		 * 
		 * 			Given site url "https://v1.hdfcbank.com/branch-atm-locator"
		 * 			When user select any State Option
		 * 			Then verify Respected City names displayed under city dropdown
		 */
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Selecting Dropdown option
		new Select(driver.findElement(By.xpath("//select[@id='customState']")))
		.selectByVisibleText("Gujarat");
		Thread.sleep(4000);
		
		//Identify City Dropdown location
		WebElement CityDropdown=driver.findElement(By.xpath("//select[@id='customCity']"));
		String Cities=CityDropdown.getText();
		System.out.println(Cities);
		
		if(Cities.contains("Baroda"))
			System.out.println("Testpass, Expected city available");
		else
			System.out.println("Testfail, Expected city not available");
		
		

	}

}
