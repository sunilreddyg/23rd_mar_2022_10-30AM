package switchcommands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchBetween_Multiple_Frames {

	public static void main(String[] args) throws Exception 
	{
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://epass.apcfss.in/");
	    driver.manage().window().maximize();
	    
	    //Switch to frame using index number
	    driver.switchTo().frame(3);
	    WebElement Fee_Structure=driver.findElement(By.xpath("//a[@href='FeestructureReport.do']"));
	    Fee_Structure.click();
	    Thread.sleep(4000);
	    
	    //Get Controls Back to mainpage
	    driver.switchTo().defaultContent();
	    
	    //Switching to frame using index number
	    driver.switchTo().frame(5);
	    new Select(driver.findElement(By.xpath("//select[@id='univ']")))
	    .selectByIndex(3);
	    
	    
	    
	}

}
