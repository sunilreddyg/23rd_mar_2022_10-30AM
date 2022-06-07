package switchcommands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToFrame_Using_WebElement_Reference {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/bushire/");
		driver.manage().window().maximize();
		
		//Switch to frame using webelemnet reference
		WebElement NewFrame=driver.findElement(By.xpath("//object[contains(@width,'430')]"));
		driver.switchTo().frame(NewFrame);
		
		WebElement OutstandingMenu=driver.findElement(By.xpath("(//div[contains(.,'Outstation')])[6]"));
		OutstandingMenu.click();
		

	}

}
