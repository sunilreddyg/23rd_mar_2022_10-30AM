package selenium.list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_Items_From_List {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		
		/*
		 * note:--> There is no separate commands available for
		 * 			for list of options to select.
		 * 		
		 * 		Step1:--> click on list box To open Menulist
		 * 		Step2:--> Click again required item to select
		 */
		
		driver.findElement(By.xpath("//a[contains(.,'Select Product Type')]")).click();
		driver.findElement(By.xpath("//li[@value='4'][contains(.,'Loans')]")).click();
		
		Thread.sleep(4000); //Timeout to load sub categories
		driver.findElement(By.xpath("//a[contains(.,'Select Product')]")).click();
		driver.findElement(By.xpath("//li[@value='1'][contains(.,'Personal Loan')]")).click();
	}

}
