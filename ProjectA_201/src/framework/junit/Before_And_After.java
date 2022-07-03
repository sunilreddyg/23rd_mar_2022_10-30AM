package framework.junit;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Before_And_After 
{

	@Before  //Invoke Every Test before
	public void setUp() throws Exception 
	{
		System.out.println("Test PreCondition");
	}
	
	@After //Invoke Every test after
	public void tearDown() throws Exception 
	{
		System.out.println("Test PostCondition");
	}
	
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


}
