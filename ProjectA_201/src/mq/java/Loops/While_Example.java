package mq.java.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class While_Example {

	public static void main(String[] args) throws Exception {
		
		
		//print number 1 to 10 using while loop
		int i=1;
		while(i < 11)
		{
			System.out.println(i);
			i=i+1;
		}
		
		
		//print number 10 to 1 using while loop
		int j=10;
		while(j > 0)
		{
			System.out.println(j);
			j=j-1;
		}
		
		
		//While With false Condition
		boolean flag=false;
		while(flag)
		{
			System.out.println("Never run this condition");
		}
		
		//Manage Explicit wait using while loop
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		
		WebElement Retype_Email=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		
		int count=0;
		while(!Retype_Email.isDisplayed())
		{
			System.out.println("Checking visibility");
			Thread.sleep(1000);
			count=count+1;
			if(count==30)
			{
				throw new Exception("Timeout Completed");
			}
		}
		
		System.out.println("Required object is visible at webpage");

	}

}
