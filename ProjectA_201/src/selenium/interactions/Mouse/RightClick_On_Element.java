package selenium.interactions.Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_On_Element {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//Use Mouse Right click at location
		WebElement Element=driver.findElement(By.xpath("//span[contains(.,'right click me')]"));
	    new Actions(driver).contextClick(Element).perform();
		
		//Click Method using mouse interactions class
		WebElement Delete_button=driver.findElement(By.xpath("//li[contains(.,'Delete')]"));
		new Actions(driver).click(Delete_button).perform();
		
		
		
		
		
		
	}

}
