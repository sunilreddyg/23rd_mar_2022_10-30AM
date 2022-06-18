package ui_verificationCommands.Dropdown_Verificationsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Option_Count {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Given Site url https://www.cleartrip.com/
		 * When user select 9 adult
		 * Then verify child dropdown should contains 0
		 * And verify infant dropdown only contains 9 Option
		 */
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement Adults=driver.findElement(By.xpath("(//select[contains(@class,'default-select bc-neutral-100 bg-transparent h-8 br-4 pl-2 p-relative zIndex-5')])[1]"));
		WebElement Children=driver.findElement(By.xpath("(//select[contains(@class,'default-select bc-neutral-100 bg-transparent h-8 br-4 pl-2 p-relative zIndex-5')])[2]"));
		WebElement Infants=driver.findElement(By.xpath("(//select[contains(@class,'default-select bc-neutral-100 bg-transparent h-8 br-4 pl-2 p-relative zIndex-5')])[3]"));
		
		
		//Select Adults dropdown
		new Select(Adults).selectByVisibleText("9");
		Thread.sleep(2000);
		
		int ChildrensCount=new Select(Children).getOptions().size();
		
		if(ChildrensCount == 0+1)
			System.out.println("Expected Count is matching");
		else
			System.out.println("Expected count is mismatch");
		
		
		
		int InfantCount=new Select(Infants).getOptions().size();
		if(InfantCount ==9+1)
			System.out.println("expected count is matching");
		else
			System.out.println("Expected count is not matching");
	}

}
