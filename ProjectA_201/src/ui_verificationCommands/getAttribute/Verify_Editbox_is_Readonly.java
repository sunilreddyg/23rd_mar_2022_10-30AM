package ui_verificationCommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Editbox_is_Readonly
{

	public static void main(String[] args) 
	{
		
		/*
		 * Sceanrio:--> verifying Editbox readonly status
		 * 
		 * 			Given Site url  "http://facebook.com"
		 * 			Then verify Email Textbox is in readonly mode...
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();

		
		//Convert editbox into editable mode
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('email').setAttribute('readonly','readonly')");
		
		
		WebElement Email=driver.findElement(By.id("email"));
		String Value=Email.getAttribute("readonly");
		//getattribute return null value when required property doesn't exist at html
		
		if(Value!=null)
		{
			System.out.println("Editbox is in readonly");
		}
		else
		{
			System.out.println("Editbox is not in readonly mode");
		}
		
		
		
		

	}

}
