package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_Attribute 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
	
		By Email=By.id("email");
		
		try {
			new WebDriverWait(driver, Duration.ofSeconds(50))
			.until(ExpectedConditions.attributeToBe(Email, "type", "text"));
			System.out.println("Element have selected attribute");
			
			new WebDriverWait(driver, Duration.ofSeconds(100))
			.until(ExpectedConditions.attributeContains(Email, "placeholder", "Hello Sunil"));
			System.out.println("Element have selected attribute");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
