package switchcommands.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToSecondWindow {

	public static void main(String[] args) throws Exception {
		
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
	    
	    for (String Eachwindow : AllWindowIDS) 
	    {
			driver.switchTo().window(Eachwindow);
		}
	    
	    //Here is the assumption after complted loop
	    //By default Controls will be available at second window
	    System.out.println("Second window title is --> "+driver.getTitle());
	    
	    
	    
	    
	    
	    
	    

	}

}
