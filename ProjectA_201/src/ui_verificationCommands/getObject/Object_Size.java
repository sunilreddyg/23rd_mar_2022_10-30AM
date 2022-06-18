package ui_verificationCommands.getObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Object_Size {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		
		WebElement ContactSales=driver.findElement(By.xpath("//a[@class='link'][contains(.,'Company')]"));
		
		//Get Object Height and width
		int ObjHeight=ContactSales.getSize().getHeight();
		int ObjWidth=ContactSales.getSize().getWidth();
		
		System.out.println("Object height is --> "+ObjHeight);
		System.out.println("Object width is --> "+ObjWidth);
		
		
		//Verify Object visibility based on Object Dimension
		if(ObjHeight > 0)
			System.out.println("Object is visible");
		else
			System.out.println("Object is not visible at webpage");
	}

}
