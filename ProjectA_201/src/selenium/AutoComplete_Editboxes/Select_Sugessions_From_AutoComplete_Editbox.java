package selenium.AutoComplete_Editboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Select_Sugessions_From_AutoComplete_Editbox 
{

	public static void main(String[] args) throws Exception 
	{
		
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skyscanner.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement From=driver.findElement(By.id("fsc-origin-search"));
		From.clear();
		From.sendKeys(Keys.BACK_SPACE);
		From.sendKeys("DEL");
		Thread.sleep(5000);
		
		WebElement DelhiCity=driver.findElement(By.xpath("//span[contains(.,'New Delhi (DEL)')]"));
		DelhiCity.click();
		

		WebElement To=driver.findElement(By.xpath("//input[@id='fsc-destination-search']"));
		To.sendKeys("HYD");
		Thread.sleep(4000);
		WebElement HydCity=driver.findElement(By.xpath("(//div[contains(.,'Hyderabad (HYD)India')])[19]"));
		HydCity.click();
	}

}
