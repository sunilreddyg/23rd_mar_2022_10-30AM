package framework.DataDriven.Excel.keywords;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_keywords 
{
	
	public static XSSFWorkbook book;
	public static XSSFSheet sht;
	public static String filepath="TestData\\InputData.xlsx";
	
	public static void  Locate_Excel_file()
	{
		try {
			FileInputStream fi=new FileInputStream(filepath);
			book=new XSSFWorkbook(fi);
			System.out.println("File located and Work book is available");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static String  Get_Data(String sheetname,int row, int cell)
	{
		try {
			return book.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
