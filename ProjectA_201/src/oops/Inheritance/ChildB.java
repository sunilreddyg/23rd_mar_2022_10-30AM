package oops.Inheritance;

public class ChildB extends ChildA
{

	public void method3()
	{
		method1();    //From parent class
		method2();    //From ChildA class
	}
	

	public static void main(String[] args) {
		
		

		ChildA obj=new ChildB();
		obj.method1();   //Parent Class
		obj.method2();   //ChildA class method
		
		
		Parent ref=new ChildB();
		ref.method1();  //Parent Class

	}

}
