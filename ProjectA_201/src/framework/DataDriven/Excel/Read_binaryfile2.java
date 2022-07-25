package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Read_binaryfile2 {

	public static void main(String[] args) 
	{
	
		FileInputStream fi=null;
		try {
			fi=new FileInputStream("TestData\\InputData.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		if(fi!=null)
		{
			System.out.println("File is located");
		}
		else
		{
			System.out.println("File is not located");
		}
		
	}

}
