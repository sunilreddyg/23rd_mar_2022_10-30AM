package ui_verificationCommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Attribute_Example1 
{

	public static void main(String[] args) throws Exception {
		
		
		
		/*
		 * Scenario:--> Verify Roundtrip Selection
		 * 			Given site url is "http://makemytrip.com"
		 * 			When Selected Roundtrip Button
		 * 			Then Verify it is Selected
		 * 			And Verify double seat fares options is disabled from webpage
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement RoundTrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		RoundTrip.click();
		Thread.sleep(2000);
		
		
		WebElement DoubleSeat_SelectionButton=driver.findElement(By.xpath("//li[contains(.,'Double Seat  FaresFly Safer with Double SeatDouble Seat service is available only for domestic one-way economy flights. You can continue to book at the regular fare or change your search parameter(s) to avail of this service.')]"));
		String RuntimeClass=DoubleSeat_SelectionButton.getAttribute("class");
		System.out.println(RuntimeClass);

		
		if(RuntimeClass.contains("isItemDisabled"))
			System.out.println("Testpass, Element is disabled on roundtrip selection");
		else
			System.out.println("Testfail, Element is enabled on roundtrip selection");
	}

}
