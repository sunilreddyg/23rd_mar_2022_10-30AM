package mq.java.variables;

public class Variable_Initiation 
{

	public static void main(String[] args) 
	{
		//Initiating variable and storing value
		int a=100;
		a=200;  
		System.out.println(a);
		
		//Initiate globally variable and values can be stored later
		int b;
		b=300;
		System.out.println(b);
		
		
		//We can initiate group variables at a time
		int x,y,z;
		x=100;y=200;z=300;
		System.out.println(x+y+z);
		
		//Variable initiation using condition class
		if(true)
		{
			String name="MQ";
		}
		
		
		//Here EMPID is a global variable for if Condition
		String EMPID;
		if(true)
		{
			EMPID="MQE001";
		}
		System.out.println(EMPID);
		
		

	}

}
