package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait_Example 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("http://facebook.com");
		
		
		long start_time=System.currentTimeMillis();
		
		try {
			driver.findElement(By.id("email1234"));
			System.out.println(System.currentTimeMillis()-start_time);
		} catch (Exception e) {
			System.out.println(System.currentTimeMillis()-start_time);
		}
		
		
		//Manage More timegap to load page objects
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		
		/*
		 * Implicitwait avoid nosuchelement exception..
		 */
	
	}

}
