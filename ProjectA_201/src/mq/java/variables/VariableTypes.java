package mq.java.variables;

public class VariableTypes
{
	//Global Variable [Instant Variable]
	int a=100;
	String email="info.dsnr@gmail.com";
	
	//Global Variables [Class Variables/ Static Variables]
	static int b=200;
	static String name="mindq dnsr";
	
	
	public void method1()
	{
		int c=300;   //Local Variable [Variable declared inside method block]
		System.out.println(c);
	}
	
	public static void main(String args[])
	{
		VariableTypes obj=new VariableTypes();
		System.out.println(obj.a);
		System.out.println(obj.email);
		
		//Calling Static variable
		System.out.println(VariableTypes.b);
		System.out.println(VariableTypes.name);
	}

}
