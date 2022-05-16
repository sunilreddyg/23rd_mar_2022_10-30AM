package launchbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser 
{

	public static void main(String[] args) 
	{
		
		/*
		 * How to downlaod chromedriver.exe file
		 * 
		 * 	 => enter site url as  https://www.selenium.dev/downloads/
		 * 	 => Scroll down page until found Browsers
		 * 	 => Click on Browsers tab [It open List of browser]
		 *   => Under chrome click on documentation link
		 *   => Find Current installed chrome version
		 *   			OpenChromeBrowser --> Click On Settings Button
		 *   			--> Help Menu --> About Google Chrome
		 *   => Download chromedriver w.r.t Chrome Browser version
		 *   		ChromeBrowser 101  <=>  ChromeDriver 101
		 *   => Click on Require link at chromedrivers page
		 *   => Then click on Operating system link [For Windows -32Bit]
		 *   => You receive Zip format file
		 *   => Unzip file to backup folder
		 *   
		 *   Note:-->
		 *   		Create Environment variable for chromedriver or
		 *   		set up runtime environment variable for ChromeDriver
		 */
		
		//setting runtime environment variable for chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		
		//launching chrome instance and storing into reference class
		ChromeDriver chrome=new ChromeDriver();
		
		//Loading new page to automation browser
		chrome.get("https://www.facebook.com/");
		
		//Printing title of webpage
		System.out.println(chrome.getTitle());
		
		//Closing Automation browser
		chrome.close();
		

	}

}
