package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;

public class Create_Extent_Reports {

	public static void main(String[] args) 
	{
		//create extentreport html file at location
		String File_path="Reports\\Report1.html";
		ExtentReports logger=new ExtentReports(File_path, true);
		
		//Write and Save file
		logger.flush();
	}

}
