package findelements;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.MonthDay;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_RequiredData_From_Calendar {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		//Close adevertise window
		WebElement OKButton=driver.findElement(By.xpath("//button[contains(.,'OK')]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", OKButton);
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", OKButton);
		Thread.sleep(4000);
		

		//Creating object for get Mouse and Keyboard interactions
		Robot robot=new Robot();
		robot.setAutoDelay(2000);
	
		//Move cursor to location using  x and y coordinates
		robot.mouseMove(305, 165);
		
		//Perform left click action using mouse 
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(3000);
	
		
		WebElement Date=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", Date);
		Date.click();
		Thread.sleep(1000);
		
		
		String Exp_Month_Year="September2022";
		String Exp_date="21";

		while(true)
		{
			
			
			WebElement Month_And_Year_Location=driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c59-10 ng-star-inserted']"));
			String Act_month=Month_And_Year_Location.getText();
			if(Act_month.equals(Exp_Month_Year))
			{
				driver.findElement(By.linkText("22")).click();
				break;
			}
		
			WebElement NextButton=driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c59-10']"));
			NextButton.click();
			Thread.sleep(1000);
			
			
			
		}
		
		
		
		
	}

}
