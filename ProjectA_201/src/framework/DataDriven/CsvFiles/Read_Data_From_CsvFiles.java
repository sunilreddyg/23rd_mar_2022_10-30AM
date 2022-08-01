package framework.DataDriven.CsvFiles;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class Read_Data_From_CsvFiles 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Target file location
		FileReader fr=new FileReader("src\\framework\\CsvFiles\\InputData.csv");
		System.out.println("File located");
		
		//Create object for csv reader
		CSVReader reader=new CSVReader(fr);
		
		//Reading header values
		String[] Header=reader.readNext();
		System.out.println(Header[0]+"   "+Header[1]);
		
		
		//Read First Record from Csv File
		String[] line=reader.readNext();
		System.out.println(line[0]+"    "+line[1]);
		
		
		String rline[];
		while((rline=reader.readNext())!=null)
		{
			System.out.println(rline[0]+"    "+rline[1]);
		}
		
		
		
		
		
		
		
		
		
	}

}
