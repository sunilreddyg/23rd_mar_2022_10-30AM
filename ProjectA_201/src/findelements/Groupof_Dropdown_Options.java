package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Groupof_Dropdown_Options {

	public static void main(String[] args) throws Exception {
		

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		Thread.sleep(3000);
		
		//Identifying single object at webpage
		WebElement MonthDropdown=driver.findElement(By.xpath("//select[@id='month']"));
		
		//Identifying group of objects under products dropdown..
		List<WebElement> AllOptions=MonthDropdown.findElements(By.tagName("option"));
		
		

		System.out.println("Option Count is -->"+AllOptions.size());
		
		for (WebElement EachOption : AllOptions) 
		{
			EachOption.click();
			Thread.sleep(1000);
		}
	}

}
