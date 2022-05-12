package mq.java.methods.parameters.CallByvalue;

public class Repository
{
	
	public void userlogin(String uid,String pwd)
	{
		System.out.println(uid);
		System.out.println(pwd);
	}

	public static void main(String[] args) 
	{
		Repository obj=new Repository();
		obj.userlogin("12345", "Arj123");
		obj.userlogin("45124521", "xyz123");
		
	}

}
