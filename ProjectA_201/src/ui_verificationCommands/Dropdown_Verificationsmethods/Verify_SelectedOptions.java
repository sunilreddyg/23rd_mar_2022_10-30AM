package ui_verificationCommands.Dropdown_Verificationsmethods;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_SelectedOptions {

	public static void main(String[] args) 
	{
		
		/*
		 * Given Site url is  https://www.facebook.com/r.php
		 * Then verify DOB month display Current Month
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		

		WebElement Dropdown_month=driver.findElement(By.id("month"));
		
		//Get Current Month from local systems
		String Exp_month=new SimpleDateFormat("MMM").format(new Date());
		System.out.println(Exp_month);
		
		//Read Selected Option value 
		String Act_month=new Select(Dropdown_month)
				.getFirstSelectedOption().getText();
		
		
		if(Exp_month.equals(Act_month))
			System.out.println("Testpass, Expected Month is Displayed");
		else
			System.out.println("Testfail, Expected month is not displayed");
	}

}
