package capturescreen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot_At_Webpage {

	public static void main(String[] args) throws IOException 
	{
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    
	    //Captured screen and converted into file format
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    //Creating folder under your project
	    FileHandler.createDir(new File("screens"));
	    
	    //Dump Original Copy file to Required folder
	    FileHandler.copy(src, new File("screens\\image.png"));
	    

	}

}
