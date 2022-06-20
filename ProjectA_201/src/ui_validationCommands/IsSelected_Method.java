package ui_validationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_Method {

	public static void main(String[] args) 
	{
		
		/*
		 * use select female radio button
		 * Then verify female radio buttion is selected
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://www.facebook.com/reg/");  //Load webpage
		driver.manage().window().maximize();    //maximize browser window

		
		WebElement Female_radio_button=driver.findElement(By.xpath("//input[@value='1']"));
		//Female_radio_button.click();
		
		if(Female_radio_button.isSelected())
			System.out.println("Radio button is  selected");
		else
			System.out.println("Radio button is not selected");
		
		
		

	}

}
