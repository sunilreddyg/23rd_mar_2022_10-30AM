package framework.junit;


import org.junit.Test;
import common_library.CommonReusable_Actions;
import pageobjects.Pages.OrangeHRM_DashBoard;
import pageobjects.Pages.OrangeHRM_HomePage;


public class Run_PageObjects_Using_Junit extends CommonReusable_Actions
{
	OrangeHRM_HomePage home;
	OrangeHRM_DashBoard dashboard;
	
	@Test
	public void Tc001()
	{
		LaunchBrowser("chrome");
		home=new OrangeHRM_HomePage(getdriver());
		load_webpage(home.IP_url);
		home.userlogin(home.IP_username, home.IP_password);
		
	
		
		dashboard=new OrangeHRM_DashBoard(getdriver());
		click_element(dashboard.ApplyLeave);
		
	}

	

}
