package ui_verificationCommands.getObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ObjLocation 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		
		WebElement ContactSales=driver.findElement(By.xpath("//a[@class='link'][contains(.,'Company')]"));
		
		
		int Objx=ContactSales.getLocation().getX();
		int Objy=ContactSales.getLocation().getY();
		System.out.println(Objx);
		
		//Get Window Coordinates horizontal..
		int WindowX=driver.manage().window().getSize().getWidth();
		System.out.println(WindowX);
		
		if(Objx < WindowX/2)
			System.out.println("Object located at left side of the page");
		else
			System.out.println("Object not located at left side of the page");
		
		
		//Verify Object visibility using Coordinates
		if(Objx > 0)
			System.out.println("Object visible at webpage");
		else
			System.out.println("Object not visible at webpage");
		
		
	}

}
