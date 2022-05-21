package selenium.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText_Example {

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		//Identifying link with original link name
		driver.findElement(By.linkText("Places")).click();
		Thread.sleep(5000);
		//Identifying link with original link name
		driver.findElement(By.linkText("Hyderabad")).click();
		
		
		
	}

}
