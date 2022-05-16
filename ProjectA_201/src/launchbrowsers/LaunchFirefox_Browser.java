package launchbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox_Browser 
{

	public static void main(String args[])
	{
		
		/*
		 * Download geckodriver.exe file
		 * 	 => enter site url as  https://www.selenium.dev/downloads/
		 * 	 => Scroll down page until found Browsers
		 * 	 => Click on Browsers tab [It open List of browser]
		 * 	 => Under Firefox browser click on documentation
		 * 	 => Under support platforms selected geckodriver
		 * 			version w.r.t selenium and Firefox Browser version
		 *   =>  After selection version click "gecko driver release
		 *   		link" under support platforms
		 *   => Find asserts under geckdriver latest version
		 *   => downlaod zip format file w.r.t Hotspot size
		 *   
		 *   Note:-->
		 *   		Either create system environment variable for
		 *   		geckodriver or set runtime environment variable
		 *   		for geckodriver.exe file
		 */
		
		//Setting Runtime environment variable for geckodriver.exe
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		
		//Launching firefox instance and storing into reference class
		FirefoxDriver firefox=new FirefoxDriver();
		
		//Load new page to automation browser window
		firefox.get("http://facebook.com");
		
		//Return current window title
		System.out.println(firefox.getTitle());
		
		//Close automation browser
		firefox.close();
	}

}
