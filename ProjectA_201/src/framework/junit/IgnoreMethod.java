package framework.junit;


import org.junit.Ignore;
import org.junit.Test;

public class IgnoreMethod {

	@Test
	public void test1() 
	{
		System.out.println("Test1 Executed");
	}
	
	@Ignore  //Method Ignore Test Condition..
	public void test2() 
	{
		System.out.println("Test2 Executed");
	}

	
	@Test
	public void test3() 
	{
		System.out.println("Test3 executed");
	}


}
