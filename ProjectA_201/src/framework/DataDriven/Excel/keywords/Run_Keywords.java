package framework.DataDriven.Excel.keywords;

public class Run_Keywords {

	public static void main(String[] args) 
	{
		
		Excel_keywords.Locate_Excel_file();
		String UID=Excel_keywords.Get_Data("info", 1, 0);
		System.out.println(UID);
		
		
		
		
		
	}

}
