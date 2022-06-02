package selenium.interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Sendkeys_Example {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skyscanner.co.in/");
		driver.manage().window().maximize();
		
		
		WebElement Origin_Textbox=driver.findElement(By.xpath("//input[@id='fsc-origin-search']"));
		
		
		Actions builder=new Actions(driver);
	    builder.click(Origin_Textbox)
	    .pause(2000)
	    .sendKeys(Keys.BACK_SPACE)
	    .sendKeys("HYD")
	    .pause(3000)
	    .sendKeys(Keys.ARROW_DOWN)
	    .sendKeys(Keys.ENTER).perform();
	}

}
