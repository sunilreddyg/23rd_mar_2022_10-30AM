package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Changes_Using_JavaScriptExecutor 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement Email=driver.findElement(By.id("email"));
		
		//Enable javascript executor on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Hide Element at webpage using javascript
		js.executeScript("arguments[0].style.visibility='hidden'", Email);
		Thread.sleep(4000);
		
		//Get Element to visibility using javascript
		js.executeScript("arguments[0].style.visibility='visible'", Email);
		Thread.sleep(4000);
		
		
		//Disable Element using javascript
		js.executeScript("arguments[0].disabled=true", Email);
		Thread.sleep(4000);
		
		//Enable Element using javascript
		js.executeScript("arguments[0].disabled=false", Email);
		Thread.sleep(4000);
		
		
		//Set Readonly state using javascript for Text intput field
		js.executeScript("arguments[0].readOnly=true", Email);
		Thread.sleep(4000);
		
		
		
		
		
		
		
	}

}
