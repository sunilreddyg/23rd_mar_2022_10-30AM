package oops.Interface;

public class FirstEdition implements Book
{
	
	
	
	@Override
	public void Title() {
		System.out.println("Selenium1");
		
	}

	@Override
	public void Author() {
		System.out.println("SunilReddy");
		
	}
	
	
	public static void main(String[] args) {
		
		Book obj=new FirstEdition();
		obj.Author();
		obj.Title();
		obj.method1();

	}


}
