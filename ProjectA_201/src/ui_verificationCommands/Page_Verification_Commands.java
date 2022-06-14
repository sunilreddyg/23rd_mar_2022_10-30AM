package ui_verificationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verification_Commands {

	public static void main(String[] args) 
	{
		
		//Launch browser and load webpage...
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Get page title
		String PageTitle=driver.getTitle();
		System.out.println("Window Title is --> "+PageTitle);
		
		//Get Page url
		String Pageurl=driver.getCurrentUrl();
		System.out.println("WIndow Url is ---> "+Pageurl);
		
		//Get Current Window ID
		String WindowID=driver.getWindowHandle();
		System.out.println(WindowID);
		
		//Get PageSource
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
		

	}

}
