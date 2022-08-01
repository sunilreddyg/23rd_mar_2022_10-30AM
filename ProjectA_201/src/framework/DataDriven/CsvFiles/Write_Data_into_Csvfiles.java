package framework.DataDriven.CsvFiles;

import java.io.FileWriter;

import com.opencsv.CSVWriter;

public class Write_Data_into_Csvfiles 
{

	public static void main(String[] args) throws Exception
	{
		
		//Create file
		String filepath="src\\framework\\DataDriven\\CsvFiles\\InputData.csv";
		FileWriter fw=new FileWriter(filepath);
		
		//To write date into csv file create object for csvwriter
		CSVWriter writer=new CSVWriter(fw);
		
		String header[]={"Username","Password"};
		writer.writeNext(header);
	
		String Line1[]={"aakash","Hello1234"};
		writer.writeNext(Line1);
	
		//save and close
		writer.close();

	}

}
