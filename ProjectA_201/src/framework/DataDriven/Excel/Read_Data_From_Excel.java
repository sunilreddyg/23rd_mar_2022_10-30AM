package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Excel 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Target binary file location from local system
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Existing Workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get Sheet using book reference
		XSSFSheet sht=book.getSheet("info");
		
		//Get row using sheet reference
		XSSFRow row=sht.getRow(1);
		
		//Target Cell and Read Data from Cell
		String UID=row.getCell(0).getStringCellValue();
		String Email=row.getCell(1).getStringCellValue();
		
		System.out.println(UID+"   "+Email);
		
		sht.getRow(1).getCell(2).getStringCellValue();
		
	}

}
