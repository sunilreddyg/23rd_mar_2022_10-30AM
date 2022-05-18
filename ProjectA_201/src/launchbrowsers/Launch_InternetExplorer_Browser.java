package launchbrowsers;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch_InternetExplorer_Browser {

	public static void main(String[] args) 
	{
		
		/*
		 * Download IEDriverServer.exe file
		 * 
		 * 	=> enter site url https://www.selenium.dev/downloads/
		 * 	=> Under The Internet Explorer Driver Server
		 *  => Downlaod latest stable version w.r.t Hotspot size
		 *  => Unzip file to back up driver
		 *  => And set Runtime environment variable before
		 *  		launch IE browser
		 *  
		 *  Configutation to follow:-->
		 *  
		 *  		=> make sure zoom level is 100
		 *  		=> Change security and privacy settings
		 *  	
		 *  		Open IE browser --> TollsMenu --> InternetOptions
		 *  		--> Select privacy and security tabs --> Then
		 *  			uncheck all protected modes..
		 *  
		 */
		
		
		//Setting runtime environment variable for IEDriverServer.exe
		System.setProperty("webdriver.ie.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\IEDriverServer.exe");
		
		//Launching IE browser instance and storing into Referrence
		InternetExplorerDriver ie=new InternetExplorerDriver();
		
		//Load page to browser window
		ie.get("http://google.com");
		
		//Printing title of Current Window
		System.out.println(ie.getTitle());
		
		//Closing Active automation browser
		ie.close();

	}

}
