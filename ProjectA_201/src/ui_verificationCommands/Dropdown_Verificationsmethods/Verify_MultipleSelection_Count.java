package ui_verificationCommands.Dropdown_Verificationsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_MultipleSelection_Count {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Given Site url http://bridgeqsystems.com/demo.php
		 * Then click on Menu link
		 * Then Verify dropdown is a multiple selection type
		 * And Confirm selection meet with expected count as 3
		 */

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		//Clicking menu link
		WebElement Menu_link=driver.findElement(By.xpath("//button[contains(.,'Select Menu')]"));
		Menu_link.click();
		Thread.sleep(2000);
		
		boolean flag=new Select(driver.findElement(By.id("exampleFormControlSelect2"))).isMultiple();
		System.out.println("Multiple Selection Status is --> "+flag);
		
		//This condition allow only selecton on multiple type
		if(flag==true)
		{
			 Select CountrySelector=new Select(driver.findElement(By.id("exampleFormControlSelect2")));
			 CountrySelector.deselectAll();   //Deselect command only work on multiple selection drodpowns
			 CountrySelector.selectByIndex(1);
			 CountrySelector.selectByIndex(3);
			 
			 int Count=CountrySelector.getAllSelectedOptions().size();
			 if(Count > 1)
			 {
				 System.out.println("Testpass, Acceping more than one selection");
			 }
			 else
			 {
				 System.out.println("Testfail, Not accepting more than one selection");
			 }
			
		}
		else
		{
			System.out.println("Dropdown is not a multiple selection type");
		}
		
		driver.close();
		
	}

}
