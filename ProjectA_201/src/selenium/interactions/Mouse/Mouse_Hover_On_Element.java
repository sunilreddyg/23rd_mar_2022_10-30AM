package selenium.interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_On_Element 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		//Perform Hover action on location
		WebElement Signin=driver.findElement(By.xpath("//span[contains(.,'Hello, Sign in')]"));
		new Actions(driver).moveToElement(Signin).perform();
		
		WebElement CreateHere=driver.findElement(By.xpath("(//a[contains(.,'Start here.')])[1]"));
		new Actions(driver).click(CreateHere).perform();
		
	}

}
