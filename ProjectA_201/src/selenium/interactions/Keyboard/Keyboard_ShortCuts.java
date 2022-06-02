package selenium.interactions.Keyboard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_ShortCuts {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");    
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.jqueryscript.net/demo/keyboard-shortcut-handling/");
	driver.manage().window().maximize();
	
	//Press ALT f1
	new Actions(driver).keyDown(Keys.ALT).sendKeys(Keys.F1).perform();
	
	//Perform escape keys
	new Actions(driver).sendKeys(Keys.ESCAPE).perform();
	
	}

}
