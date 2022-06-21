package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_Url_Presented {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		String exp_url="https://www.facebook.com/";
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.urlToBe(exp_url));
		System.out.println("Expected url is presented");
		
		
		WebElement Signup_link=driver.findElement(By.xpath("//a[@href='/reg/']"));
		Signup_link.click();
		
		new WebDriverWait(driver, Duration.ofSeconds(40))
		.until(ExpectedConditions.urlContains("/reg"));
		System.out.println("partial url is presented");
		
		
		
		
		
		

	}

}
