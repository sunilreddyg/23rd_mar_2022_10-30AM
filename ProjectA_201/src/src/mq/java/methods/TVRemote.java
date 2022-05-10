package mq.java.methods;

public class TVRemote 
{
	
	void on()
	{
		System.out.println("Turn on");
	}
	
	void off()
	{
		System.out.println("Turn off");
	}
	
	//public allow method to access outside package
	public void NextChannel()
	{
		System.out.println("Next Channel Changed");
	}
	
	//public allow method to access outside package
	public void Previous_Channel()
	{
		System.out.println("Previous_Channel Changed");
	}
	
}

