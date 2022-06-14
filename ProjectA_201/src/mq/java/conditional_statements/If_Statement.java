package mq.java.conditional_statements;

public class If_Statement 
{

	public static void main(String[] args)
	{
	
		/*
		 * if:-->
		 * 		=> If only accept boolean statement.
		 * 		=> If usefull to execute any block of statement.
		 */
		
		
		int Age=19;
		if (Age > 18)  //Here greaterthan return boolean value
		{
			System.out.println("Statement1");
			System.out.println("Statement2");
		}
		
		//Using If Condition only single statement to Execute
		if(Age==18)
			System.out.println("Statement3");
		
		System.out.println("Regular statement");
		
		
		
		
		

	}

}
