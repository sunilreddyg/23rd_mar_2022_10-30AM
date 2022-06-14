package mq.java.conditional_statements;

public class SwitchCondition {

	public static void main(String[] args) 
	{
		
		String month="feb";
		
		switch (month) {
		case "jan":
			System.out.println("10% Discount");
			break;
			
		case "feb":
			System.out.println("20% Discount");
			break;
			
		case "mar":
			System.out.println("30% Discount");
			break;

		default: System.out.println("Month name mismatch");
			break;
		}
		
		

	
	}

}
