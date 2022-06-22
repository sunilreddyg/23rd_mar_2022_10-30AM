package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_ElementSelection_StateTobe {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();// TODO Auto-generated method stub
		
		
		By Female_Radio_button=By.xpath("//input[@value='1']");

		//This action wait until expected radio button or chekced is checked
		try {
			
			new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions
					.elementSelectionStateToBe(Female_Radio_button, true));
			System.out.println("Female radio button is selected");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//This action wait until expected radio button or chekced is unchecked
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions
					.elementSelectionStateToBe(Female_Radio_button, false));
			System.out.println("Female radio button is not selected");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
