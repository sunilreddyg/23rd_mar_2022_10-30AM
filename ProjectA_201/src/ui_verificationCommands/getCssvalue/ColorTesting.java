package ui_verificationCommands.getCssvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ColorTesting {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		
		WebElement ContactSales=driver.findElement(By.xpath("//a[@href='/contact-sales/']"));
		
		//Get Location styles
		String BGColor=ContactSales.getCssValue("background-color");
		System.out.println(BGColor);
		
		
		Color ObjColors=Color.fromString(BGColor);
		System.out.println(ObjColors.asHex());
		System.out.println(ObjColors.asRgb());
		System.out.println(ObjColors.asRgba());
		
		
		String Exp_color_inHex="#17a954";
		if(Exp_color_inHex.equals(ObjColors.asHex()))
			System.out.println("Color is matching");
		else
			System.out.println("Color mismatched");
		
		
	}

}
