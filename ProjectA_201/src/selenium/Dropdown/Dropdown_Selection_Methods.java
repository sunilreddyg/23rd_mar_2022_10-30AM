package selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection_Methods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		
		
		//selecting dropdown using option name
		new Select(driver.findElement(By.id("day")))
		.selectByVisibleText("23");
		
		//selecting dropdown using value property
		new Select(driver.findElement(By.id("month")))
		.selectByValue("9");
		
		//selecting dropdown using index number
		new Select(driver.findElement(By.id("year")))
		.selectByIndex(25);
		
	}

}
