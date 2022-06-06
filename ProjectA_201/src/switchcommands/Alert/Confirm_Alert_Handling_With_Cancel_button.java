package switchcommands.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirm_Alert_Handling_With_Cancel_button {

	public static void main(String[] args) throws Exception 
	{
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Cancel_link=driver.findElement(By.xpath("//a[@href='#CancelTab']"));
	    Cancel_link.click();   //This command open Confirm alert page
	    Thread.sleep(3000);
	    
	    WebElement Confirm_box_link=driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	    Confirm_box_link.click();  //This action will bring confirmation alert
	    Thread.sleep(3000);
	    
	    
	  //Switching to alert and wrapped alert into Interface class
	    Alert alert=driver.switchTo().alert();
	    
	    //Get text on alert
	    String alert_msg=alert.getText();
	    System.out.println(alert_msg);
	    
	    alert.dismiss();   //This command click cancel button on alert
	    
	    
	    Thread.sleep(3000);
	    driver.close();    //Once alert closed control by default comes to browser
	    

	}

}
