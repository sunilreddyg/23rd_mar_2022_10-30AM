package switchcommands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToFrame_Using_IndeNumber {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/bushire/");
		driver.manage().window().maximize();
		
		//Switch to frame using index number
		driver.switchTo().frame(1);
		
		WebElement OutstandingMenu=driver.findElement(By.xpath("(//div[contains(.,'Outstation')])[6]"));
		OutstandingMenu.click();
		

	}

}
