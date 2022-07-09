package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ignore_testng_methods 
{
	@Test
	public void tc001()
	{
		Reporter.log("Tc001 Successfully executed",true);
	}
	
	@Test(enabled=false)
	public void tc002()
	{
		Reporter.log("Tc002 Successfully executed",true);
	}
	
	
	
	
}
