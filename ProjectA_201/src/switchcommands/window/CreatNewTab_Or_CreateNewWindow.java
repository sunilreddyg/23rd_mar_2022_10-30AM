package switchcommands.window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreatNewTab_Or_CreateNewWindow {

	public static void main(String[] args) 
	{
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.instagram.com");
	    driver.manage().window().maximize();
	    System.out.println(driver.getTitle());
	    
	    //This feature only available in selenium 4
	    
	    //Opening page at New TAB
	    WebDriver JobsTab=driver.switchTo().newWindow(WindowType.TAB);
	    JobsTab.get("https://www.instagram.com/about/jobs/");
	    System.out.println(JobsTab.getTitle());
	    
	    //OPening page at new window
	    WebDriver APIWIndow=driver.switchTo().newWindow(WindowType.WINDOW);
	    APIWIndow.get("https://developers.facebook.com/docs/instagram");
	    System.out.println(driver.getTitle());
	    
	    //Close all browsers
	    driver.quit();

	}

}
