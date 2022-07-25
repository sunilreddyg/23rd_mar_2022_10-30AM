package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

public class Read_binary_File 
{

	public static void main(String[] args) throws IOException 
	{
		
		
		FileInputStream fi=new FileInputStream("TestData\\InputData1.xlsx");
		System.out.println("File located");
	}

}
