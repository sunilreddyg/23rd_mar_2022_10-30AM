package framework.testng.Suite_Parameter;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Get_Parameters_From_Suite 
{
	public WebDriver driver;
	String path="C:\\Users\\MINDQ\\Desktop\\recent_drivers\\";
	
	@Test(priority=0)
	@Parameters("browser_name")
	public void launch_browser(String browsername)
	{
		switch (browsername) 
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
			driver=new ChromeDriver();
			Reporter.log("Chrome browser launched");
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", path+"geckodriver.exe");
			driver=new FirefoxDriver();
			Reporter.log("firefox browser launched");
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver", path+"IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			System.out.println("Ie Browser launched");
			break;

		default:  System.out.println("Browsername mimsatch");
			break;
		}
		
	}
	
	@Test(priority=1)
	@Parameters("appurl")
	public void loadWebpage(String url)
	{
		driver.get(url);
		Reporter.log("Application load finished");
		
		driver.manage().window().maximize();
		Reporter.log("Browser maximize finished");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Reporter.log("30 seconds implicit wait assigned");
	}
	
	
	@Test(priority=2)
	@Parameters({"uid","pwd"})
	public void User_login(String Auid, String Apwd)
	{
		WebElement Email_EB=driver.findElement(By.id("email"));
		Email_EB.clear();
		Email_EB.sendKeys(Auid);
		Reporter.log("Email enter finished");
		
		WebElement Passoword_EB=driver.findElement(By.id("pass"));
		Passoword_EB.clear();
		Passoword_EB.sendKeys(Apwd);
		Reporter.log("Password Enter finished");
		
	}
	
	
	
	
	
	

}
