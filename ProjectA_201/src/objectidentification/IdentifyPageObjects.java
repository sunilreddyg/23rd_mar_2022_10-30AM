package objectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyPageObjects {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.findElement(By.id("email")).sendKeys("sunil");
	    driver.findElement(By.id("pass")).sendKeys("djflkdjfk");
	    driver.findElement(By.name("login")).click();


	}

}
