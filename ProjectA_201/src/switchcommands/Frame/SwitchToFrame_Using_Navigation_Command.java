package switchcommands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToFrame_Using_Navigation_Command {

	public static void main(String[] args) throws Exception 
	{
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.redbus.in/bus-tickets/");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Help=driver.findElement(By.xpath("//a[@href='https://www.redbus.in/info/redcare']"));
	    Help.click();
	    Thread.sleep(5000);
	    
	   
	    driver.navigate().to("https://www.redbus.in/login?offerType=Support&defaultSlide=home&isOnlyMobile=false");
	    Thread.sleep(5000);
	    
	    WebElement MobileNumber=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
	    MobileNumber.sendKeys("9030248855");
		

	}

}
