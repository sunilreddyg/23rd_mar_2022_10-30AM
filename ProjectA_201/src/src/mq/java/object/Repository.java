package mq.java.object;

public class Repository 
{
	//Reusable method
	public void typetext()
	{
		System.out.println("TypeText Executed");
	}
	
	//Reusable method
	public void selectdropdown()
	{
		System.out.println("Select Dropdown executed");
	}
	
	public static void main(String args[])
	{
		Repository ref=new Repository();
		ref.typetext();
		ref.selectdropdown();
		
	}

}
