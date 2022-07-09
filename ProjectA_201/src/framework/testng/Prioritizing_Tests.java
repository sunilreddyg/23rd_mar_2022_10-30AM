package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Prioritizing_Tests 
{
	@Test(priority=0)
	public void x()
	{
		Reporter.log("First Index Text Executed");
	}
	
	@Test(priority=1)
	public void a()
	{
		Reporter.log("Second index test executed");
	}
	
	@Test(priority=2)
	public void f()
	{
		System.out.println("Third Index test executed");
	}

}
