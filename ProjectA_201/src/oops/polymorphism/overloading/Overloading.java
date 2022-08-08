package oops.polymorphism.overloading;

public class Overloading
{
	
	public void print_product()
	{
		System.out.println("Iphone");
	}
	
	public void print_product(double price)
	{
		System.out.println("Iphone"+"     "+price);
	}
	
	public void print_product(String color, double price)
	{
		System.out.println("Iphone"+"   "+color+"     "+price);
	}
	
	public void print_product(double price, String color)
	{
		System.out.println("Iphone"+"   "+price+"     "+color);
	}
	

	public static void main(String[] args)
	{
		Overloading obj=new Overloading();
		obj.print_product(100000.00);
		obj.print_product("Blue", 150000.00);
		obj.print_product(230000.00, "Red");

	}

}
