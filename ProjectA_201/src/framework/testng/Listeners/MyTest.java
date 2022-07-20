package framework.testng.Listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class MyTest 
{
  @Test
  public void tc001() 
  {
	  Assert.assertEquals("email", "email");
  }
  
  @Test
  public void tc002() 
  {
	  Assert.assertEquals("gmail", "google");
  }
  
  @Test
  public void tc003() throws Exception 
  {
	  throw new SkipException("I Skipped");
  }
  
  @Test
  public void tc004() 
  {
	  Assert.assertEquals("wd", "wd");
  }
  
  @Test
  public void tc005() throws Exception 
  {
	  throw new SkipException("I Skipped");
  }
  
  int i=0;
  @Test(invocationCount=5,successPercentage=60)
  public void tc006() throws Exception 
  {
	 i=i+1;
	
	 if(i==2 || i==4)
	 {
		 Assert.assertEquals("wd1", "wd");
	 }
  }
  
  
}
