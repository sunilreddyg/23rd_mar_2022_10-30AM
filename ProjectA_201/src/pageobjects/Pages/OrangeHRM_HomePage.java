package pageobjects.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRM_HomePage 
{

	@FindBy(id="txtUsername") public WebElement username;
	@FindBy(xpath="//input[@id='txtPassword']")public WebElement password;
	@FindBy(xpath="//input[@id='btnLogin']") public WebElement login_btn;
	@FindBy(linkText="Forgot your password?")public WebElement forgot_your_password;
	@FindBy(xpath = "//span[@id='spanMessage']") public WebElement Login_Error_Text;
	//TestData
	public String IP_url="https://opensource-demo.orangehrmlive.com/";
	public String IP_username="Admin";
	public String IP_password="admin123";
	
	
	public void usernameentry(String UID)
	{
		username.sendKeys(UID);
	}
	
	public void passwordentry(String PWD)
	{
		password.sendKeys(PWD);
	}
	
	public void clickingloginbutton()
	{
		login_btn.click();
	}
	
	public void userlogin(String UID,String PWD)
	{
		username.sendKeys(UID);
		password.sendKeys(PWD);
		login_btn.click();
	}
	
	public boolean Verify_Login_pageErrorText(String Exp_Text)
	{
		 boolean flag=Login_Error_Text.getText().equals(Exp_Text);
		 return flag;
	}
	
	
}
