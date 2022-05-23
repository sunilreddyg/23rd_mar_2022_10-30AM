package selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_Two_Options_At_Multiple_Selection_Dropdown {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		
		
		WebElement SelectMenu_Button=driver.findElement(By.xpath("//button[contains(.,'Select Menu')]"));
		SelectMenu_Button.click();
		Thread.sleep(3000);
		
		//Is Multiple return dropdown is multiple Selection
		WebElement CountryDropdown=driver.findElement(By.id("exampleFormControlSelect2"));
		boolean flag=new Select(CountryDropdown).isMultiple();
		
		
		if(flag==true)
		{
			//Deselect all options under multiple selection dropdown
			new Select(CountryDropdown).deselectAll();
			
			//Selecting Multiple Options
			new Select(CountryDropdown).selectByIndex(1);
			new Select(CountryDropdown).selectByIndex(3);
			new Select(CountryDropdown).selectByIndex(5);
			
			Thread.sleep(3000);
			//Deselecting single options from selection
			new Select(CountryDropdown).deselectByIndex(3);
		}
		else
		{
			System.out.println("Dropdown is not a multiple selection type");
		}
		
		

	}

}
