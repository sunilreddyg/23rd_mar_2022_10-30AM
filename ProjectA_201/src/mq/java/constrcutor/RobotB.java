package mq.java.constrcutor;

public class RobotB 
{

	public RobotB() 
	{
		System.out.println("Initiated");
	}
	
	public void run()
	{
		System.out.println("Run Executed");
	}

	public static void main(String[] args) 
	{
		new RobotB().run();

	}

}
