package pageobjects.WithoutpageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_HRMlogin 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    
		driver.manage().window().maximize(); 
		driver.get(HRM_OBJ.Ip_url);
		
		driver.findElement(HRM_OBJ.Login_UID).sendKeys("Admin");
		driver.findElement(HRM_OBJ.Login_PWd).sendKeys("admin123");
		driver.findElement(HRM_OBJ.Login_Submit_button).click();

	}

}
