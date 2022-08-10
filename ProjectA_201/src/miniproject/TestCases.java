package miniproject;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCases extends Common_Reusable_Actions implements CommonObjects,InputData
{
	
	@Test(enabled=false)
	public void Tc001_HrmLogin()
	{
			Type_text(obj_login_email, IP_login_email);
			Type_text(obj_login_password, IP_login_password);
			click_element(obj_login_Submit_button);
	}
	
	@Test
	public void Tc001_HrmLogin_invalid_password()
	{
			Type_text(obj_login_email, IP_login_email);
			Type_text(obj_login_password, "");
			click_element(obj_login_Submit_button);
			Assert.assertTrue(Verify_element_text(obj_Login_password_error_location, IP_Pwd_Empty_error_msg));
	}
	
	
	
	@BeforeClass
	public void setupbrowser()
	{
		LaunchBrowser(IP_browsername);
		load_webpage(IP_Page_url);
		set_explicitwait_time(IP_exp_timeout);
		Assert.assertTrue(verify_titlePresented(IP_OrangeHrm_page_title));
		
	}
	

}
