package switchcommands.ActiveElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiveElement_Example {

	public static void main(String[] args) throws Exception {
		
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.amazon.com");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    WebElement Departments=driver.findElement(By.xpath("//select[contains(@id,'searchDropdownBox')]"));
	    new Actions(driver).click(Departments).perform();
	    Thread.sleep(2000);
	    
	    driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(2000);
	    driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(2000);
	    driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	    		
	    
	    
	    
	    

	}

}
