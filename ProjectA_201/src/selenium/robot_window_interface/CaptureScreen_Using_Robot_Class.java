package robot_window_interface;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreen_Using_Robot_Class 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		//Creating object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		//Capturing buffered image
		BufferedImage image=robot.createScreenCapture(new Rectangle(800,600));
		
		//Write image into local folder
		String path="D:\\03-May_11Am_2022\\ProjectA_201\\src\\robot_window_interface\\image1.png";
		ImageIO.write(image, "PNG", new File(path));
		
		
	}

}
