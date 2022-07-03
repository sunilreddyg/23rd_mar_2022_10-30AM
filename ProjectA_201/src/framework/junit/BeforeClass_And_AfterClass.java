package framework.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClass_And_AfterClass {

	
	@Test
	public void test1() 
	{
		System.out.println("Test1 executed");
	}
	
	@Test
	public void test2() 
	{
		System.out.println("Test2 executed");
	}
	
	
	@BeforeClass //This annoation run before execution of fist @Test method with in class
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Class Precondition");
	}

	@AfterClass //This annoation invoke after last @Test execution
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Class PostCondition");
	}


}
