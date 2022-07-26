package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Numeric_Cell 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Taret file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		
		//Access excel workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using above workbook
		XSSFSheet sht=book.getSheet("numbers");
		
		//Target row using sheet reference
		XSSFRow row=sht.getRow(1);
		
		
		//Read characters from targeted cell
		String PhoneName=row.getCell(0).getStringCellValue();
		System.out.println(PhoneName);
		
		//Read numbers from cell
		//ByDefault Excel read numeric values in decimal format
		double Price=row.getCell(1).getNumericCellValue();
		System.out.println(Price);
		
		//Read numerics from cell
		double quatity_in_dble=row.getCell(2).getNumericCellValue();
		System.out.println(quatity_in_dble);
		
		//Converting decimal value to int value
		Double d=new Double(quatity_in_dble);
		int quantity_in_int=d.intValue();
		System.out.println(quantity_in_int);
		
		
		//Read Numeric cell value
		double MobileIn_dble=row.getCell(3).getNumericCellValue();
		String Mobile_txt=NumberToTextConverter.toText(MobileIn_dble);
		System.out.println(Mobile_txt);
		
	}

}
