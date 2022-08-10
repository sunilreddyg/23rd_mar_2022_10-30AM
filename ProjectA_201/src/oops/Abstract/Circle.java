package oops.Abstract;

public class Circle extends Shape
{

	@Override
	void draw() 
	{
		System.out.println("Draw executed from Circle class");
	}
	
	
	public static void main(String[] args) {
		
		Shape obj=new Circle();
		obj.draw();
		obj.corners();
		
		//From Abstarct class Calling static method
		System.out.println(Shape.name);
		
		
	}

}
