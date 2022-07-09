package framework.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import common_library.CommonReusable_Actions;
import pageobjects.Pages.OrangeHRM_HomePage;
import pageobjects.Pages.OrangeHRM_Menu_List;

public class Run_With_Keywords extends CommonReusable_Actions
{
	
	
	
	OrangeHRM_HomePage home;

	
	@BeforeClass
	public void beforeclass()
	{
		LaunchBrowser("chrome");
		load_webpage("https://opensource-demo.orangehrmlive.com/");
		set_explicitwait_time(30);
	}
	
	
	@Test
	public void userlogin_valid_data()
	{
		home=new OrangeHRM_HomePage(driver);
		Type_text(home.username, home.IP_username);
		Type_text(home.password, home.IP_password);
		click_element(home.login_btn);
		OrangeHRM_Menu_List menulist=new OrangeHRM_Menu_List(driver);
		Assert.assertTrue(menulist.admin.isDisplayed());
		Reporter.log("Login is successfull");
	}
	
}
