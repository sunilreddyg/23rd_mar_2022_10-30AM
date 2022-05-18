package launchbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriver_Interface {

	public static void main(String[] args) 
	{
		
		/*
		 * Note:--> Webdriver is a interface class it is designed
		 * 			to manipulate all browser instances support by 
		 * 			selenium
		 * 	
		 * 			Webdriver inteface helps to conduct cross
		 * 			browser automation without repeating code
		 * 			for each browser..
		 */
		
		//Chrome Browser automation using WebDriver Interface
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.get("http://facebook.com");
	
		//Firefox Browser automation using WebDriver Interface
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver d2=new FirefoxDriver();
		d2.get("http://outlook.com");
		
		//IE Browser automation using WebDriver Interface
		System.setProperty("webdriver.ie.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\IEDriverServer.exe");
		WebDriver d3=new InternetExplorerDriver();
		d3.get("http://google.com");
		
		/*
		 * WebDriver:--> 
		 * 			WebDriver is a interface class it is implemented
		 * 			all browser instances support by Selenium.
		 * 
		 * 			WebDriver methods are usefull to automate
		 * 			different browsers like [Chrome,Safari,Opera ---etc]
		 */
	
		/*
		 * Exceptions:-->
		 * 
		 * 		IllegalStateException:-->
		 * 		=> This exception we receive when don't define
		 * 			environment path for browser drivers
		 * 							[OR]
		 * 
		 * 		=> When we define wrong path  or Spell Mistakes
		 * 
		 * 		SessionNotCreateException:-->
		 * 			=> When your browser driver and browser version
		 * 				is mismatched
		 * 
		 * 		
		 * 		InvalidArgumentException:-->
		 * 		=> When url format is mimstached
		 * 		=> Url should start with http://  or https://
		 */
		
		
	}

}
