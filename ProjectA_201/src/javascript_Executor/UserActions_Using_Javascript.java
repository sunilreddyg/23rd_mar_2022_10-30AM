package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserActions_Using_Javascript 
{

	public static void main(String[] args) 
	{
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//Enabling javascript executor on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Type text into editbox
		js.executeScript("document.getElementById('email').value='Darshan'");
		js.executeScript("document.getElementById('pass').value='Darshan'");
		
		//Click Method using javascript..
		WebElement LoginButton=driver.findElement(By.xpath("//button[@name='login']"));
		js.executeScript("arguments[0].click()", LoginButton);

		
		
	}

}
