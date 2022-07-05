package extent_reports;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_library.CommonReusable_Actions;

public class Junit_WebDriver_Extent_Reports 
{
	

	static ExtentReports logger;
	static ExtentTest test;
	static String file_location="Reports\\Final_Report.html";
	@Rule public TestName testmethod=new TestName();
	static CommonReusable_Actions keyword;
	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		keyword=new CommonReusable_Actions();
		driver=keyword.getdriver();
		keyword.LaunchBrowser("chrome");
		//Create Html extent report
		logger=new ExtentReports(file_location);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		keyword.close_browser();
		//Write all reports
		logger.flush();
			
	}

	@Before
	public void setUp() throws Exception 
	{
		//Capture current constructed methodname at runtime
		String TestMethod_name=testmethod.getMethodName();
		test=logger.startTest(TestMethod_name);
	
	}

	@After
	public void tearDown() throws Exception 
	{
		test.log(LogStatus.INFO, "ScreenCaptured",test.addScreenCapture("C:\\Users\\MINDQ\\Documents\\Searches\\Pictures\\Smoke_And_SanityTesting.png"));
		logger.endTest(test);
	}
	
	
	
}
