package mq.java.variables;

public class DataTypes 
{

	
	public static void main(String[] args) 
	{
		
		/*
		 * byte:-->
		 * 			=> byte is a numeric datatype
		 * 			=> Default value is 0
		 * 			=> Min value is -128  
		 * 			=> Maximum value is 127
		 */
		byte a=127;
		System.out.println("byte value is "+a);
		
		/*
		 * int:-->
		 * 		=>  int is a numeric datatype
		 * 		=>  Default value is 0
		 * 		=> Recomended always int to store numeric values
		 */
		int x=100;
		int y=200;
		int z=x+y;    //+ is a operator it couduct addition between two number
		System.out.println("total is --> "+z);
	
		/*
		 * boolean:-->
		 * 			=> boolean store true/false value
		 * 			=> default value of boolean is false
		 */
		boolean flag=true;
		boolean status=false;
		System.out.println("flag value is -> "+flag);
		System.out.println("flag value is ->"+status);
		
		
		/*
		 * double:-->
		 * 		=> Double accept decimal values to store
		 * 		=> Default value of double is 0
		 */
		double selenium_version=3.149;
		double price=25000.50;
		System.out.println("Version is --> "+selenium_version);
		System.out.println("Price is --> "+price);
		
		
		/*
		 * float:-->
		 * 		=> Float accept decimal values same as double
		 * 		=> Float value should end with f character
		 * 		=> default value is 0
		 */
		float f=1234.12f;
		System.out.println("float value is ---> "+f);
		
		
		/*
		 * char:-->
		 * 			=> Accept only sigle character
		 * 			=> Only store single character in single quotes
		 * 			=> Default value is null
		 */
		char group1='A';
		char group2='B';
		System.out.println("group value is -->"+group1);
		System.out.println("group1 value is -->"+group2);
		
		
		/*
		 * String:-->
		 * 			=> String is a non-primitive datatype
		 * 			=> String starts with Uppercase characters
		 * 			=> String allow to store set of characters
		 * 			=> String data stored in double quotes
		 * 			=> Default value is null.
		 * 			=> string also called as class because it contains
		 * 				set of events.
		 */
		String name="Mindq";
		String email="info.dsnr@mindqsystems.com";
		String mobile="9030248855";
		System.out.println(name+"\t"+email+"\n"+mobile);
		
		
	
		/*
		 * Arrays:-->
		 * 		Array Store set of values
		 */
		int num[]= {100,200,300};
		System.out.println(num[1]);
		
		
		
		
		
		
	}

}
