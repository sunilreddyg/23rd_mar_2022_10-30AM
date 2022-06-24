package mq.java.Arrays;

public class Double_DimenSional_StaticArray {

	public static void main(String[] args) 
	{
		
		String data[][]=new String[3][2];
		
		//Assign first row index values
		data[0][0]="Ram";
		data[0][1]="Ram@gmail.com";
		
		//Assign Second row index value
		data[1][0]="Sam";
		data[1][1]="Sam@gmail.com";
		
		//Assign third row index value
		data[2][0]="pepo";
		data[2][1]="pepo@gmail.com";
		
		
		System.out.println(data[2][0]);
		System.out.println("Row Count is array -->"+data.length);
		
	}

}
