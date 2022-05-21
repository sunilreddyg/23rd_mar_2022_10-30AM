package selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Keyboard_Shortcuts {

	public static void main(String[] args) {
		
		//Launch browser and load webpage...
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("firstname"))
		.sendKeys("newuser"+Keys.TAB+"webdriver");
		
		//Selecting Dropdown usng char sequences
		driver.findElement(By.id("day")).sendKeys("25");
		
		//Selecting dropdown options using Multiple Keyboar keys
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		
		
		

	}

}
