package selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Multiple_Selection 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		
		
		WebElement SelectMenu_Button=driver.findElement(By.xpath("//button[contains(.,'Select Menu')]"));
		SelectMenu_Button.click();
		Thread.sleep(3000);
		
		
		WebElement CountryDropdown=driver.findElement(By.id("exampleFormControlSelect2"));
		boolean flag=new Select(CountryDropdown).isMultiple();
		System.out.println("Dropdown is Multiple type --> "+flag);
		
		
		
		
		

	}

}
