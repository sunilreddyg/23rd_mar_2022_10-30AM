package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data_into_Excel_Cells 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Taret file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		
		//Access excel workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using above workbook
		XSSFSheet sht=book.getSheet("info");
		
		
		//Write Data into Exisint Row and Cell
		sht.getRow(1).getCell(2).setCellValue("Developer");
		
		//Write Data into Existing row and Newcell
		sht.getRow(1).createCell(3).setCellValue(new Date().toString());
		
		//Write data into Newrow New Cell
		sht.createRow(2).createCell(0).setCellValue("Dileep");
		
		//Creating New Binary file at local drive
		FileOutputStream fo=new FileOutputStream("TestData\\Oputput.xlsx");
		book.write(fo);  //Write Old book refernce to New Output File
		book.close();    //Save file
		

	}

}
