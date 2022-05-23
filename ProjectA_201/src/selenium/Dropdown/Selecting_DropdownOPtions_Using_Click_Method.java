package selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_DropdownOPtions_Using_Click_Method {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/?");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Copy Direct xpath of OPtions
		//Then Perform click method to select option
		WebElement Telangana=driver.findElement(By.xpath("//option[@value='telangana'][contains(.,'Telangana')]"));
		Telangana.click();
		Thread.sleep(5000);
		
		WebElement HYD=driver.findElement(By.xpath("//option[@value='hyderabad'][contains(.,'Hyderabad')]"));
		HYD.click();
		
		
	}
}
