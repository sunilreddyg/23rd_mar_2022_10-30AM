package switchcommands.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling_Sendkeys_Command 
{

	public static void main(String[] args) throws Exception 
	{
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Alert_with_textbox_link=driver.findElement(By.xpath("//a[@href='#Textbox']"));
	    Alert_with_textbox_link.click();   
	    Thread.sleep(3000);
	    
	    WebElement prompt_box_link=driver.findElement(By.xpath("//button[contains(@onclick,'promptbox()')]"));
	    prompt_box_link.click();   //This command open prompt type alert
	    Thread.sleep(3000);
	    
	    
		 //Switching to alert and wrapped alert into Interface class
		  Alert alert=driver.switchTo().alert();
		  
		  //Type text into alert textbox
		  alert.sendKeys("SunilReddy");
		  Thread.sleep(5000);
		  
		  alert.accept();  //This command close alert bring control back to webpage
		  
		  //driver.close();
		   
		    
		    
		    
	}

}
