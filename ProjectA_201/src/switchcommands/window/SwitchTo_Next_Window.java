package switchcommands.window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) throws Exception 
	{
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.instagram.com");
	    driver.manage().window().maximize();
	    
	    //Hyper link open page at new window
	    WebElement Blog=driver.findElement(By.linkText("Blog"));
	    Blog.click();
	    Thread.sleep(4000);
	    
	    //Get All Window Handles
	    Set<String> AllWindowIDS=driver.getWindowHandles();
	    
	    //Converting all Dynamic ID's into iterators
	    Iterator<String> itr=AllWindowIDS.iterator();
	    
	   //Read First Iterator using Next keyword
	    String WIND1=itr.next();
	    String WIND2=itr.next();
	   
	    
	    System.out.println(driver.getTitle());
	    
	    driver.switchTo().window(WIND2);
	    System.out.println("Sub window title is "+driver.getTitle());
	    
	    driver.switchTo().window(WIND1);
	    System.out.println("Main window title is --> "+driver.getTitle());
	    
	    
	}

}
