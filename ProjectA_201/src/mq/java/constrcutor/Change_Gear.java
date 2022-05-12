package mq.java.constrcutor;


public class Change_Gear 
{
	//constructor
	public Change_Gear() 
	{
		System.out.println("Hold clutch");
	}
	
	//Reusable method
	public void Gear1()
	{
		System.out.println("First gear changed");
	}
	
	//Reusable method
	public void Gear2()
	{
		System.out.println("Second gear changed");
	}
	
	//Reusable method
	public void Gear3()
	{
		System.out.println("third gear changed");
	}


	//Main method [Runnable]
	public static void main(String[] args) 
	{
	 //Calling Instant method with help of constructor
		new Change_Gear().Gear1();
		new Change_Gear().Gear2();
		
		//Create object and storing into variable reference
		Change_Gear obj=new Change_Gear();
        obj.Gear3();
        obj.Gear1();
        
       
	}


}
