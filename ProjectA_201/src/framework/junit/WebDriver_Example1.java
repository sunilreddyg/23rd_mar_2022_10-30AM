package framework.junit;


import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebDriver_Example1
{
	static WebDriver driver;
	static String driverpath="C:\\Users\\MINDQ\\Desktop\\recent_drivers\\";
	String url="https://www.facebook.com/";
	@Rule public TestName test=new TestName();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", driverpath+"chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}

	@Before
	public void setUp() throws Exception 
	{
		driver.get(url);
	}

	@After
	public void tearDown() throws Exception 
	{
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(src, new File("D:\\01_June_2022_8AM\\Project_203\\screens//"+test.getMethodName()+".png"));
	}
	

	@Test
	public void Verify_SignupLink() 
	{
		driver.findElement(By.xpath("//a[@href='/reg/']")).click();
		String Exp_title="Sign up for Facebook | Facebook";
		Assert.assertEquals(Exp_title, driver.getTitle());
		System.out.println("Singup page title verified");
	}
	
	@Test
	public void Verify_Messenger_link() 
	{
		driver.findElement(By.xpath("//a[@href='https://messenger.com/']")).click();
		String Exp_title="Messenger";
		Assert.assertEquals(Exp_title, driver.getTitle());
		System.out.println("Messenger page title verified");
	}
	
	@Test
	public void Verify_Login_link() 
	{
		driver.findElement(By.xpath("//a[@href='/login/']")).click();
		String Exp_title="Log in to Facebook";
		Assert.assertEquals(Exp_title, driver.getTitle());
		System.out.println("Login page title verified");
	}
	
	@Test
	public void Verify_Pages_link() 
	{
		driver.findElement(By.xpath("//a[@href='/places/']")).click();
		String Exp_title="Discover great places in every city";
		Assert.assertTrue(driver.getTitle().contains(Exp_title));
		System.out.println("Page link  title verified");
	}
	

}
