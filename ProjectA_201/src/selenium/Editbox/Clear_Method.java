package selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Method {

	public static void main(String[] args) throws Exception {
		
		//Launch browser and load webpage...
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("Hi");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("Vikram");
		
		/*
		 * Clear is the method explicitly designed to clear
		 * text at editboxes.
		 */

	}

}
