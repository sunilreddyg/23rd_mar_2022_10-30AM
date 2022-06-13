package mq.java.variables;

public class String_Comparision_Commands 
{

	public static void main(String[] args) 
	{
		

		/*
		 * String:-->
		 * 			=> String store set of characters
		 * 			=> String is not only a datatype also called as class
		 * 			=> Because String contains set of events to validate store characters
		 */
		
		
		/*
		 * Equals:-->
		 * 		method verify equal comparision between two strings and return
		 * 		boolean value true/false
		 * 		Note:--> Euqal is case sensitive comparision
		 */
		String Exp_res="Account Created";
		String Act_res="Account created";
		
		boolean flag=Act_res.equals(Exp_res);
		System.out.println("Equal Comparision is --> "+flag);
		
		

		/*
		 * EqualIgnorecase:-->
		 * 			Method verify equal comparision by ignoring case sensitive
		 * 			and return boolean value.
		 */
		boolean flag1=Act_res.equalsIgnoreCase(Exp_res);
		System.out.println("EqualIgnore case Comparision is --> "+flag1);
		
		

		/*
		 * Contains:-->
		 * 			Method verify substring characters available at mainString
		 * 			and return value boolean value.
		 */
		String Status="Account 100 created successful";
		boolean flag2=Status.contains("created");
		boolean flag3=Status.contains("Account created");
		boolean flag4=Status.contains("created successful");
		
		System.out.println(flag2+"\t"+flag3+"\t"+flag4);

		
		/*
		 * Length:--> Method return number of characters available
		 * 			 at string , Method return in  integer format
		 */
		String MobileNumber="9030248855";
		int Count=MobileNumber.length();
		System.out.println("Characters available at string is --> "+Count);
		System.out.println("Comparision is -->  "+(Count==10));
		
		/*
		 * substring:-->
		 * 		Method get sub string charcters from main string
		 */
		String AccountNumber="123488881478";
		String lastDigits=AccountNumber.substring(8);
		System.out.println("last 4 Digits are --> "+lastDigits);
		
		String MiddleChars=AccountNumber.substring(4,8);
		System.out.println("Middle 4 digits are --> "+MiddleChars);
		
		
		/*
		 * startswith:-->
		 * 			Method verify given string started with expected characters
		 * 			and return boolean value
		 */
		boolean flag5=AccountNumber.startsWith("1234");
		System.out.println("Starts With status is ---> "+flag5);

		
		/*
		 * endswith:-->
		 * 			Method verify given string ends with expected characters
		 * 			and return boolean value
		 */
		boolean flag6=AccountNumber.endsWith("1478");
		System.out.println("Ends with status is --> "+flag6);
		
		
		/*
		 * isempty:-->
		 * 		method return characters available status in 
		 * 		boolean format
		 * 		=> Return true when string doesn't have any charactes
		 * 		=> Return false when string has characters
		 */
		String var="";
		String var1="Hello";
		System.out.println("var empty status is ---> "+var.isEmpty());
		System.out.println("Var1 empty statu is ---> "+var1.isEmpty());

		

		/*
		 * charsAt:-->
		 * 		Method return single character using index number
		 */
		String browsername="Chrome,Firefox";
		char ch=browsername.charAt(0);
		System.out.println("charcters available at 7th index number ---> "+ch);

		
		
		/*
		 * tolowercase:-->
		 * 			Convert all uppercase characters in lowercase
		 */
		String toolname="WebDriver";
		System.out.println(toolname.toLowerCase());
		
		
		/*
		 * toUppercase:-->
		 * 			Convert all lowercase characters in Uppercase
		 */
		System.out.println(toolname.toUpperCase());
		

		/*
		 * trim:--> method trim extra spaces [Only left and Right spaces]
		 */
		String pincode="   500035    ";
		System.out.println("length before trim is --> "+pincode.length());
		String NewPincode=pincode.trim();
		System.out.println("Lenth after trim is ---> "+NewPincode.length());


		
		/*
		 * Concat:-->
		 * 			Add new string to existing charactes
		 */
		String browsers="Chrome,Firefox";
		String New_browser=browsers.concat(",Safari");
		System.out.println(New_browser);
		System.out.println(browsers+",Opera");  //we can use + operator to club two strings

		
		
		/*
		 * replace:-->
		 * 		Replace old characters with New characters 
		 */
		String Toolname="WebDrover";
		String Rep=Toolname.replace("o", "i");
		System.out.println("After replace character is --> "+Rep);
		
		
		String Price="?49,000";
		String Newprice=Price.replace("?", "").replace(",", "");
		System.out.println(Newprice);

		
		

	}

}
