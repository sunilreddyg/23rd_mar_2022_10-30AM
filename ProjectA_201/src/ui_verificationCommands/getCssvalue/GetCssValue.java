package ui_verificationCommands.getCssvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		
		WebElement ContactSales=driver.findElement(By.xpath("//a[@href='/contact-sales/']"));
		
		//Get Location styles
		String BGColor=ContactSales.getCssValue("background-color");
		System.out.println(BGColor);
		
		String TextType=ContactSales.getCssValue("text-transform");
		System.out.println(TextType);
		
		
		
		
	}

}
