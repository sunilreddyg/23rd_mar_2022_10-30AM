package oops.Inheritance;

public class ChildA extends Parent
{
	
	String email="info@gmail.com";

	public void method2()
	{
		System.out.println(name);
		method1();
	}
	public static void main(String[] args) 
	{
		//Create Object to Current Class
		ChildA obj=new ChildA();
		obj.method1();    //Parent class
		obj.method2();   //Child class
		
		//Create object to Current Class Using parent Class reference
		Parent ref=new ChildA();
		ref.method1();
		System.out.println(ref.name);
		
	}

}
