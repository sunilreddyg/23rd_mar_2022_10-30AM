package framework.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.lang.reflect.Method;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Testng_WebDriver_Testcase1 
{
	
  WebDriver driver;
  String url="http://facebook.com";
  

  @BeforeMethod
  public void beforeMethod() 
  {
	 driver.get(url);
  }

  @AfterMethod
  public void afterMethod(Method method) throws Exception 
  {
	 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(src, new File("screens\\image"+method.getName()+".png"));
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  }

  @AfterClass
  public void afterClass() throws Exception 
  {
	  Thread.sleep(5000);
	  driver.close();
  }
  
  
  @Test(priority=0)
  public void Verify_SignUpWebpage()
  {
	  driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).click();
	  Assert.assertEquals(driver.getTitle(), "Sign up for Facebook | Facebook");
	  Reporter.log("SIngup page title is verified");
  }
  
  @Test(priority=1)
  public void Verify_MessengerLink()
  {
	  driver.findElement(By.xpath("//a[contains(.,'Messenger')]")).click();
	  Assert.assertEquals(driver.getTitle(), "Messenger");
	  Reporter.log("Messenger page title is verified");
  }
  

}
