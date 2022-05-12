package mq.java.methods.parameters.CallByvalue;

public class Calculator 
{
	//global variables
	int a;
	int b;

	
	//Class Constructor with parameters
	public Calculator(int x, int y) 
	{
		a=x;
		b=y;
	}
	
	//Instant Method
	public void add()
	{
		System.out.println(a+b);
	}
	
	//Instant Method
	public void mul()
	{
		System.out.println(a*b);
	}

	public static void main(String[] args) 
	{
		
		new Calculator(100, 200).add();
		new Calculator(10, 100).mul();

	}

}
