package extent_reports;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsWith_Junit 
{
	
	static ExtentReports logger;
	static ExtentTest test;
	static String file_location="Reports\\Final_Report.html";
	@Rule public TestName testmethod=new TestName();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		//Create Html extent report
		logger=new ExtentReports(file_location);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
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
	
	@Test
	public void Tc001_valid_Email()
	{
		test.log(LogStatus.INFO, "Signup link clicked");
		test.log(LogStatus.INFO, "Valid Details Entered successfull");
		test.log(LogStatus.INFO, "Click Create account button");
	}
	
	@Test
	public void Tc002_invalid_Email()
	{
		test.log(LogStatus.INFO, "Signup link clicked");
		test.log(LogStatus.INFO, "Invalid Details Entered successfull");
		test.log(LogStatus.INFO, "Click Create account button");
	}

	

}
