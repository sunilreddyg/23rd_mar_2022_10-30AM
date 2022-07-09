package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestngTest 
{
  @Test //Invoke method to run without object creation and main method..
  public void tc001() 
  {
	  Reporter.log("Tc001 Executed",true);
  }
  
  @Test
  public void tc002() 
  {
	  Reporter.log("Tc002 Executed",true);
  }
  
  
  @Test
  public void tc003() 
  {
	  Reporter.log("Tc003 Executed",true);
  }
  
  
  
}
