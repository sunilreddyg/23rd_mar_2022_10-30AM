package framework.testng.TestSuite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class1
{
	@Test
	public void tc001()
	{
		Reporter.log("tcoo1 executed");
	}
	
	@Test
	public void tc002()
	{
		Reporter.log("tcoo2 executed");
	}
	
	
	@Test
	public void tc003()
	{
		Reporter.log("tcoo3 executed");
	}

}
