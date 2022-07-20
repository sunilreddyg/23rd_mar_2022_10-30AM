package framework.testng.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Run_Listeners implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Test initiated => "+getmethodname(result));
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Testpass Screen captured => "+getmethodname(result)+"\n");
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Testfailed email send with attachment => "+getmethodname(result)+"\n");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test Skipped => Re run test => "+getmethodname(result)+"\n");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		System.out.println("Test failed with success percentage => "+getmethodname(result)+"\n");
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("Teststarted => ");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("TestEnded =>");
		
	}
	
	
	//method return constucted methodname...
	public static String getmethodname(ITestResult result)
	{
		return result.getMethod().getConstructorOrMethod().getName();
	}

	

}
