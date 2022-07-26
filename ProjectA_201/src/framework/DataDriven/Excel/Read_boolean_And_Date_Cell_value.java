package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_boolean_And_Date_Cell_value {

	public static void main(String[] args) throws IOException {
		

		//Taret file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		
		//Access excel workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using above workbook
		XSSFSheet sht=book.getSheet("date");
		
		//Target row using sheet reference
		XSSFRow row=sht.getRow(1);
		
		
		//Read Date cell value
		Date date=row.getCell(1).getDateCellValue();
	
		//Converting Date into Required format
		String NewDate=new SimpleDateFormat("dd/MM/yyyy").format(date);
		System.out.println(NewDate);
		
		
		//Get Boolean value from cell
		boolean flag=row.getCell(2).getBooleanCellValue();
		if(flag==true)
			System.out.println("Prodcut available");
		else
			System.out.println("product not available");
		
		
		//Converting boolean value to string [AutoBoxing]
		String flag1=new Boolean(flag).toString();
		System.out.println(flag1);
		
	}

}
