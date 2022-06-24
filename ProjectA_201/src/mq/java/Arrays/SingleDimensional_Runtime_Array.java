package mq.java.Arrays;

public class SingleDimensional_Runtime_Array 
{

	public static void main(String[] args)
	{
		
		//Storing group of string into Runtime Array
		String browsers[]= {"chrome","firefox","safari","opera"};
		System.out.println(browsers[2]);
		
		
		//Read all array values
		for (String eachbrowser : browsers) 
		{
			if(eachbrowser.equals("safari"))
			{
				System.out.println("Option Presented");
			}
		}
		
		
		
		//Storing group of Integer values into Runtime Array
		int code[]= {101,102,103,104,105};
		System.out.println(code[3]);
		
		
		//Storing Combination of values
		Object obj[]= {"Samsung",40000.00,true,2};
		String name=(String) obj[0];  //Casting object to string
		System.out.println(name);
	}

}
