package mq.java.methods.methodtypes;

public class MethodTypes 
{
	//Method is a void type it doesn't return any value
	void method1()
	{
		System.out.println("Method1 Executed");
	}
	
	//Method a integer type it return value in integer format
	int method2()
	{
		return 100;
	}
	
	/*
	 * => Other than void all types return values
	 * => For other method types we should write return 
	 * 		keyword at the end of the method
	 * => Return value should match with method type
	 * => finally it return value to method name
	 */
	
	
	//String return method
	String method3()
	{
		return "iphone";
	}
	
	//Boolean return method
	boolean method4()
	{
		return true;
	}
	
	//double return method
	double method5()
	{
		return 100;
	}
	

	public static void main(String[] args) 
	{
			MethodTypes obj=new MethodTypes();
			obj.method1();
			
			//Calling integer return method
			int x=obj.method2();
			System.out.println(x);
			
			//calling string return method
			String name=obj.method3();
			System.out.println(name);
			
			//Calling Boolean return method
			boolean flag=obj.method4();
			System.out.println(flag);
			
			//Calling double return method
			double price=obj.method5();
			System.out.println(price);

	}

}
