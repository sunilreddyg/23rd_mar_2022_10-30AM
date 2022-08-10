package oops.Interface;

public class SecondEdition implements Book
{

	@Override
	public void Title() 
	{
		System.out.println("Devops");
	}

	@Override
	public void Author()
	{
		System.out.println("Asha");
	}
	
	public static void main(String[] args) {
		Book obj=new SecondEdition();
		obj.Author();
		obj.Title();
	}

}
