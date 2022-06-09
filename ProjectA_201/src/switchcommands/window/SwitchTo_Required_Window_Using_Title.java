package switchcommands.window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Required_Window_Using_Title {

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
	    
	    //Clicking hyper link
	    WebElement Help=driver.findElement(By.linkText("Help"));
	    Help.click();
	    
	    
	    //Get Mainwindow Handler
	    String MainWindow=driver.getWindowHandle();
	    
	    //Iterator for Number of windows
	    for (String Eachwindow : driver.getWindowHandles()) 
	    {
			String Runtime_Title=driver.switchTo().window(Eachwindow).getTitle();
			if(Runtime_Title.contains("Help Centre"))
			{
				break;  //Stop iteration
			}
		}
	    
	    
	    //Assumption is when break executed your browser
	    //controls available at reqruied window
	    
	    System.out.println("Current Focused window title is -->"+driver.getTitle());

	}

}
