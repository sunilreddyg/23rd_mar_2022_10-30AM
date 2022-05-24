package selenium.AutoComplete_Editboxes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWait 
{

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skyscanner.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement From=driver.findElement(By.id("fsc-origin-search"));
		From.clear();
		From.sendKeys(Keys.BACK_SPACE);
		From.sendKeys("DEL");
		WebElement DelhiCity=driver.findElement(By.xpath("//span[contains(.,'New Delhi (DEL)')]"));
		DelhiCity.click();
		

		WebElement To=driver.findElement(By.xpath("//input[@id='fsc-destination-search']"));
		To.sendKeys("HYD");
		WebElement HydCity=driver.findElement(By.xpath("(//div[contains(.,'Hyderabad (HYD)India')])[19]"));
		HydCity.click();
		
		
		WebElement Months=driver.findElement(By.name("months"));
		new Select(Months).selectByVisibleText("December 2022");
		
		
		WebElement Date=driver.findElement(By.xpath("//button[@aria-label='Thursday, 29 December 2022']"));
		Date.click();
		
		
		
		/*
		 * Implicitwait manage dynamic timegap
		 * It enabled time when object not found at HTML source
		 * 
		 * Advantages:-->
		 * 		We can avoid nosuchelement exception
		 */
		
	}

}
