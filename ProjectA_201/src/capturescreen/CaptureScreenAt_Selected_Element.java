package capturescreen;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenAt_Selected_Element 
{

	public static void main(String[] args) throws Exception 
	{
		
		

		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Email_Obj=driver.findElement(By.xpath("(//div[@class='_6lux'])[1]"));
	    File src=Email_Obj.getScreenshotAs(OutputType.FILE);
	    //Creating folder under your project
	    FileHandler.createDir(new File("screens"));
	    
	    //Dump Original Copy file to Required folder
	    FileHandler.copy(src, new File("screens\\image.png"));
	    
 
	    

	}

}
