package framework.DataDriven.Excel.keywords;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Excel_keywords 
{
	
	public static XSSFWorkbook book;
	public static XSSFSheet sht;
	public static String filepath="TestData\\";
	
	public static void  Locate_Excel_file(String Filename,String sheetname)
	{
		try {
			FileInputStream fi=new FileInputStream(filepath+Filename);
			book=new XSSFWorkbook(fi);
			sht=book.getSheet(sheetname);
			System.out.println("File located and Work book is available");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

	public static String  Get_Data(String sheetname,int row, int cell)
	{
		try {
			return sht.getRow(row).getCell(cell).getStringCellValue();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public static int getrowcount(String sheetname)
	{
		try {
			return sht.getLastRowNum();
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	
	public static void Write_Data(String sheetname,int row, int cell,String write)
	{
		try {
			sht.getRow(row).createCell(cell).setCellValue(write);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void create_outputfile(String outputfile)
	{
		try {
			book.write(new FileOutputStream(outputfile));
			book.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@DataProvider
	public static String[][] Excel_To_DP()
	{
	
		int Rcount=sht.getLastRowNum();
		int Ccount=sht.getRow(1).getLastCellNum();
		String data[][];
		data=new String [Rcount+1][Ccount];
		for (int i = 0; i <= Rcount; i++) 
		{
				for (int j = 0; j < Ccount; j++) 
				{
					data[i][j]=sht.getRow(i).getCell(j).getStringCellValue();
				}
		}
		
		return data;
		
	}
	
	
	

}
