package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Create_Test_At_ExtentReport_File {

	public static void main(String[] args) {
		
		//create extentreport html file at location
		String File_path="Reports\\Report2.html";
		ExtentReports logger=new ExtentReports(File_path, true);
		
				//Create test 
				ExtentTest test1=logger.startTest("Tc001_valid_login");
				
				logger.endTest(test1);
				
				
				//Create test 
				ExtentTest test2=logger.startTest("Tc002_INvalid_login");
				
				logger.endTest(test2);
	
		//Write and Save file
		logger.flush();

	}

}
