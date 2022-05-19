package selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Outlook_Login 
{

	public static void main(String[] args) throws Exception 
	{
		//Launch browser and load webpage...
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		//Clicking signin button
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		
		//Enter email and press enter key at keyboard shortcuts
		driver.findElement(By.id("i0116"))
		.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		
		//Static time to hold execution for 5 seconds
		Thread.sleep(5000);
		
		//Enter password 
		driver.findElement(By.name("passwd"))
		.sendKeys("Hello@123"+Keys.ENTER);
		
	
	}

}
