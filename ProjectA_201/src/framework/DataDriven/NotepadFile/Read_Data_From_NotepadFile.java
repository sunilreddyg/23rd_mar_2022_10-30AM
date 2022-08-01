package framework.DataDriven.NotepadFile;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read_Data_From_NotepadFile 
{

	public static void main(String[] args) throws IOException 
	{
		
		FileReader reader=new FileReader("src\\framework\\NotepadFile\\Input.txt");
		Scanner sc=new Scanner(reader);
		System.out.println("File located");
		
		//Read until has a next line records available
		while(sc.hasNext())
		{
			String line=sc.next();
			
			//Split line with delimeted file 
			String records[]=line.split(",");
			System.out.println(records[0]+"   "+records[1]);
			
		}
		

	}

}
