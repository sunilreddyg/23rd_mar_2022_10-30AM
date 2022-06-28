package mq.java.Loops;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Do_while_loop {

	public static void main(String[] args) throws Exception 
	{
		
		//Valid Condition
		int i=0;
		do {
			System.out.println(i);
			i=i+1;
		} while (i < 11);
		
		
		//Invalid Condition
		int j=10;
		do {
			System.out.println(j);
			j=j-1;
		} while (j < 0);
		
		
		
		//Reload page until Expected Page loaded
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		int count=0;
		boolean flag=false;
		do {
			driver.get("http://google.com");
			

			try {
				flag=new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.titleContains("Facebook"));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			count=count+1;
			if(count==5)
			{
				throw new Exception("Expected Page is not loaded");
			}
			
		} while (flag==false);
		
		System.out.println("page is loaded");
		
		
		

	}

}
