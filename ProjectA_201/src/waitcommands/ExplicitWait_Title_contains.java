package waitcommands;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Title_contains 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://facebook.com");
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.titleIs("Facebook – log in or sign up"));
		System.out.println("Title Verified Expected page loaded");
		
		WebElement Developers=driver.findElement(By.linkText("Developers"));
		Developers.click();
		
		boolean flag=wait.until(ExpectedConditions.titleContains("Developers"));
		if(flag==true)
			System.out.println("Title is Presented for developers page");
		else
			System.out.println("Title is not presented");

	}

}
