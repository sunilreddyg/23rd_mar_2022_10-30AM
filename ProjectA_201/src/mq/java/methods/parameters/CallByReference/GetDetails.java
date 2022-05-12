package mq.java.methods.parameters.CallByReference;

public class GetDetails 
{
	
	public void getstudentdetails(StudentDetails details)
	{
		System.out.println(details.name);
		System.out.println(details.email);
		details.PrintName();
	}
	
	
	public static void main(String args[])
	{
		
		GetDetails obj=new GetDetails();
		obj.getstudentdetails(new StudentDetails());
		
	}

}
