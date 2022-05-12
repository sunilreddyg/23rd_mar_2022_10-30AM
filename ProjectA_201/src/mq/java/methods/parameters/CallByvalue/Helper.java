package mq.java.methods.parameters.CallByvalue;

public class Helper 
{
	//Method parameter with call by value
	void method1(String name)
	{
		System.out.println(name);
	}
	
	void method2(int speed)
	{
		System.out.println(speed);
	}
	
	void method3(boolean flag)
	{
		System.out.println(flag);
	}
	
	void method4(double price)
	{
		System.out.println(price);
	}
	
	void method5(char ch)
	{
		System.out.println(ch);
	}

	public static void main(String[] args) 
	{
		Helper obj=new Helper();
		obj.method1("Iphone");
		obj.method2(10);
		obj.method3(true);
		obj.method4(1200.15);
		obj.method5('A');
	}

}
