package mq.java.Loops;

public class Foreach_Example {

	public static void main(String[] args) {
		
		
		//Print array values
		String browsers[]= {"chrome","firefox","edge","safari","ie"};
		for (String eachbrowser : browsers) 
		{
			System.out.println(eachbrowser);
		}
		
		
		//Print Integer array values
		int num[]= {100,200,300,400,500};
		for (int i : num) 
		{
			System.out.println(i);
		}
		
		
		
		
		//Double Dimension array value
		String userdata[][]=
			{
					{"sam","9030248888"},
					{"rajesh","900248899"},
					{"sindhu","5214521452"},
					{"hari","9025852025"},
					
			};
		
		
		for (String[] EachRow : userdata) 
		{
			
			System.out.println(EachRow[0]+"    "+EachRow[1]);
			
		}
		
		
		
	}

}
