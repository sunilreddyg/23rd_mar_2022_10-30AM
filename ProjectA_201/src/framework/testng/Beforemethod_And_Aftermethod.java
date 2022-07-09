package framework.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Beforemethod_And_Aftermethod {

  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Test Precondition");
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("Test Post Condition");
  }
  
  @Test
  public void tc001() 
  {
	  Reporter.log("Tc001_User_Registration",true);
  }
  
  @Test
  public void tc002() 
  {
	  Reporter.log("Tc001_User_Login",true);
  }

}
