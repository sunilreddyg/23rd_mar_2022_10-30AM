package framework.DataDriven.Excel;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Multiple_Cells {

	public static void main(String[] args) throws Exception {
		
		
		//Target Binary file
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		
		//Get workbook access using file reference
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get Sheet using above workbook
		XSSFSheet sht=book.getSheetAt(4);
		
		
		for (int i = 1; i <= sht.getLastRowNum(); i++) 
		{
			
			XSSFRow EachRow=sht.getRow(i);
			int Fcell=EachRow.getFirstCellNum();
			int Lcell=EachRow.getLastCellNum();
			
			for (int j = Fcell; j < Lcell; j++) 
			{
				 String EachCell= EachRow.getCell(j).getStringCellValue();
				 System.out.println(EachCell);
			}
			System.out.println("\n");
			
		}

	}

}
