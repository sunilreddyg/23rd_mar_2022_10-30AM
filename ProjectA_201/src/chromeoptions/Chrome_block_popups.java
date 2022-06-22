package chromeoptions;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_block_popups {

	public static void main(String[] args) 
	{
		
		/*
		 * Block pop-up windows
		 * 	By default, ChromeDriver configures Chrome to allow pop-up windows. 
		 * If you want to block pop-ups (i.e., restore the normal Chrome behavior 
		 * when it is not controlled by ChromeDriver), do the following:
		 */
		

		
		
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",
		Arrays.asList("disable-popup-blocking"));
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://hdfcbank.com");
		

	}

}
