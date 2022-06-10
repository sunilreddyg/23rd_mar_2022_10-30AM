package capturescreen;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenwith_timestamp {

	public static void main(String[] args) throws Exception 
	{
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    
	    
	    //Java Time stampt
	    Date d=new Date();   //import java.util;
	    //Create simple date formatter
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss");
	    //COnvert date using simple date formatter
	    String time=sdf.format(d);
	    System.out.println(time);
	    
	    
	    //Capture screen shot and stroing referece file format
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    //Copy screen to local folder
	    FileHandler.copy(src, new File("screens\\Image"+time+".png"));

	    
	    
	}

}
