package oops.Encapsulation;

public class Encaps 
{
	private String name;
	private String mobile;
	public String EMPID="MQ001";
	
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
		System.out.println("Set name Successfull");
	}

	public String getMobile() 
	{
		return mobile;
	}

	public void setMobile(String mobile) 
	{
		this.mobile = mobile;
	}

}
