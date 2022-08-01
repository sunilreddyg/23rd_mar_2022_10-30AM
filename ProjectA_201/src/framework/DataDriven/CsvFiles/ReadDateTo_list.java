package framework.DataDriven.CsvFiles;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

public class ReadDateTo_list {

	public static void main(String[] args) throws IOException {
		//Target file
		String filepath="src\\framework\\DataDriven\\CsvFiles\\InputData.csv";
		FileReader reader=new FileReader(filepath);
		System.out.println("file is located");
		
		//Create object for csv reader
		CSVReader csv=new CSVReader(reader);
		
		//Read first record from file
		String headers[]=csv.readNext();
		System.out.println(headers[0]+"      "+headers[1]);
		
		
		List<String[]> list=csv.readAll();
		for (String[] Record : list) 
		{
			System.out.println(Record[0]+"     "+Record[1]);
		}
		
		
		
		
		
				
	}

}
