package waitcommands;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_Alert {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		
		WebElement Nav_alert=driver.findElement(By.xpath("//a[@id='v-pills-messages-tab']"));
		Nav_alert.click();
		Thread.sleep(4000);
		
		WebElement Alert_link=driver.findElement(By.xpath("//button[contains(.,'Alerts')]"));
		Alert_link.click();
		Thread.sleep(4000);
		
		WebElement Alert_button=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		Alert_button.click();    //This action bring alert window
		
		
		try {
			
			Alert alert=new WebDriverWait(driver, Duration.ofSeconds(50))
			.until(ExpectedConditions.alertIsPresent());
			
			System.out.println(alert.getText());
			alert.accept();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
