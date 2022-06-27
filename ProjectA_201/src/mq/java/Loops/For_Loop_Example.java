package mq.java.Loops;

public class For_Loop_Example 
{

	public static void main(String[] args) 
	{
		
		
		//Print numbers from 1 to 10
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(i);
		}
		
		
		//Print numbers from 10 to 1
		for (int i = 10; i > 0; i--) 
		{
			System.out.println(i);
		}
		
		
	
		//Storing group of string into Runtime Array
		String browsers[]= {"chrome","firefox","safari","opera"};
		for (int i = 0; i < browsers.length; i++) 
		{
			if(i==1)
			{
				String string = browsers[i];
				System.out.println(string);
			}
			
		}
		
		
		
		//Conduct sum between 1 to 100
		int sum=0;
		for (int i = 1; i <= 100; i++) 
		{
			 sum=sum+i;
		}
		System.out.println("Total value is --> "+sum);
		
		
		
		//How to reverse string
		String toolname="linus";
		
		//Convert String to character array
		char[] ch=toolname.toCharArray();
		
		String str="";
		for (int i = ch.length-1; i >= 0; i--)
		{
			str=str+ch[i];
		}
		
		System.out.println(str);
		
		
		
		//Reverse a string using String Builder
		StringBuilder builder=new StringBuilder("linus");
		System.out.println(builder.reverse());
	}

}
