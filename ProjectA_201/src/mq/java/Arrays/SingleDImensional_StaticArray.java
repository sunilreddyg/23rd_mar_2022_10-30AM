package mq.java.Arrays;

public class SingleDImensional_StaticArray 
{

	public static void main(String[] args)
	{
		
		//String array store only set of string values
		String mobile[]=new String[4];
		mobile[0]="iphone";
		mobile[1]="Samsung";
		mobile[2]="Vivo";
		mobile[3]="OnePlus";
		System.out.println(mobile[2]);
		System.out.println("Number of objects available is --> "+mobile.length);
		
		
		//Int array store only set of integer value
		int num[]=new int[3];
		num[0]=100;
		num[1]=200;
		num[2]=300;
		System.out.println("Counst is --> "+num.length);
		
		
		//Storing Combination of values
		Object obj[]=new Object[5];
		obj[0]="iphone";
		obj[1]=50000.00;
		obj[2]=true;
		obj[3]="128GB";
		obj[4]=1;
		
		//Output statement by default cast the value
		System.out.println(obj[0]);
		
		//Casting object to Datatypes
		String MobileName=(String)obj[0];
		double Mobileprcie=(double) obj[1];
		
		System.out.println(MobileName+"   "+Mobileprcie);
		
		
	}

}
