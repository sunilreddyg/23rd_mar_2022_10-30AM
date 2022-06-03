package robot_window_interface;

import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseWheel_Option 
{

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		//Creating object for get Mouse and Keyboard interactions
		Robot robot=new Robot();
		robot.setAutoDelay(2000);
		
		//Wheel Down at mouse 
		robot.mouseWheel(200);
		
		//Move cursor to location using  x and y coordinates
		robot.mouseMove(305, 165);
		
		//Perform left click action using mouse 
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		

	}

}
