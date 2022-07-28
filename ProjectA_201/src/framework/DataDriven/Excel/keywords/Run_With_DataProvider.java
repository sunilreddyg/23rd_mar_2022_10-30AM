package framework.DataDriven.Excel.keywords;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Run_With_DataProvider 
{
	
	
	@BeforeClass
	public void beforeclass()
	{
		Excel_keywords.Locate_Excel_file("InputData.xlsx", "DP1");
	}
	@Test(enabled=false,dataProvider="Excel_To_DP",dataProviderClass=Excel_keywords.class)
	public void Tc001_LoginTest(String UID,String PWD)
	{
		System.out.println(UID+"    "+PWD);
	}
	
	@Test(dataProvider="Excel_To_DP",dataProviderClass=Excel_keywords.class)
	public void Tc002_Check_Product(String phonename,String Config,String status)
	{
		
	}
}
