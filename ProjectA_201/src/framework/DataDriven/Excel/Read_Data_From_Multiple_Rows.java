package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Multiple_Rows {

	public static void main(String[] args) throws IOException 
	{
		
		
		//Target Binary file
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		
		//Get workbook access using file reference
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get Sheet using above workbook
		XSSFSheet sht=book.getSheetAt(3);
		
		
		//Get First and Last Row Count 
		int FRow=sht.getFirstRowNum();
		int LRow=sht.getLastRowNum();
		
		
		//Applying for loop to read data from multiple rows
		for (int i = FRow+1; i <= LRow; i++) 
		{
			
			String UID=sht.getRow(i).getCell(0).getStringCellValue();
			String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(UID+"\t"+PWD);
			
		}

	}

}
