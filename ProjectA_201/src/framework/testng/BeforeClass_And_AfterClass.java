package framework.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeClass_And_AfterClass 
{

  @BeforeClass //invoke before execution of @Test annotated method
  public void beforeClass() 
  {
	  System.out.println("Class Precondition");
  }

  @AfterClass //invoke after execution of last @Test annotated method
  public void afterClass() 
  {
	  System.out.println("Class Post Condition");
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
