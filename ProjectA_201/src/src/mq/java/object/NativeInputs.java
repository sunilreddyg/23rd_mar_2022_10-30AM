package mq.java.object;

public class NativeInputs 
{
	
	public static void Keyboard()
	{
		System.out.println("Keybord executed");
	}
	
	public static void Mouse()
	{
		System.out.println("mouse Executed");
	}
	

	public static void main(String[] args) 
	{
		
		/*
		 * When method is declared with static specifier
		 * no need to created object for class. We can 
		 * methods directly with class name
		 */
		NativeInputs.Keyboard();
		NativeInputs.Mouse();
	}

}
