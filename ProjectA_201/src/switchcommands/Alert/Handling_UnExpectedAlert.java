package switchcommands.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_UnExpectedAlert 
{

	public static void main(String[] args) throws Exception 
	{
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
		WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		Alert_prompt_link.click();   //This link open alert
		Thread.sleep(3000);
		
		
		try {
			
			driver.switchTo().alert().accept();
			System.out.println("alert is presented");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println(driver.getTitle());

	}

}
