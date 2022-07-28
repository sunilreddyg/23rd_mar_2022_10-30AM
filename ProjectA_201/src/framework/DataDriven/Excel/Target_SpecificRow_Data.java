package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Target_SpecificRow_Data {

	public static void main(String[] args) throws IOException {
		
		
		//Target Binary file
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		
		//Get workbook access using file reference
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get Sheet using above workbook
		XSSFSheet sht=book.getSheet("condition");
		
		
		//Iterate for number of rows
		for (int i = 1; i <= sht.getLastRowNum(); i++) 
		{
			//Read Execution cell value
			String Exe_status=sht.getRow(i).getCell(2).getStringCellValue();
			if(Exe_status.equalsIgnoreCase("y"))
			{
				String UID=sht.getRow(i).getCell(0).getStringCellValue();
				System.out.println(UID);
				
				//Get Execution Status
				String Status=sht.getRow(i).getCell(3).getStringCellValue();
				if(Status.equals("text"))
				{
					System.out.println(UID+"    "+"Reading text completed");
				}
				else if(Status.equals("alert"))
				{
					System.out.println(UID+"    "+"Reading alert completed");
				}
				
				
			}
			
		}
		
		
		
		

	}

}
