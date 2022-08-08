package oops.polymorphism.overriding;


public class Circle extends Shape
{
	
	public void draw()
	{
		System.out.println("Circel Child  Class Method");
	}

	public static void main(String[] args) 
	{
			Circle obj1=new Circle();
			obj1.draw();
			
			Shape obj2=new Circle();
			obj2.draw();
	
	}

}
