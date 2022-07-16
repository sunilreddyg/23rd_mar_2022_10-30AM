package framework.testng.BeforeTest_and_AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class Test_for_Chrome
{
  
  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Pretest before launch chrome");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("post after launch chrome");
  }
  
  @Test
  public void login()
  {
	  System.out.println("Login successfull");
  }

}
