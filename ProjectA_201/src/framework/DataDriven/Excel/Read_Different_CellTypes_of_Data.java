package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Different_CellTypes_of_Data {

	public static void main(String[] args) throws Exception {
		
		
		//Target Binary file
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		
		//Get workbook access using file reference
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get Sheet using above workbook
		XSSFSheet sht=book.getSheetAt(5);
		
		
		for (int i = 1; i <= sht.getLastRowNum(); i++) 
		{
			
			XSSFCell cell=sht.getRow(i).getCell(0);
			
			String Username=null;
			if(cell.getCellType()==CellType.STRING)
			{
				Username=cell.getStringCellValue();
			}
			else if(cell.getCellType()==CellType.NUMERIC)
			{
				Username=NumberToTextConverter.toText(cell.getNumericCellValue());
			}
			
			System.out.println(Username);
			
		}
		

	}

}
