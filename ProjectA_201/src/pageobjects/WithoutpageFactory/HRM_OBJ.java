package pageobjects.WithoutpageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRM_OBJ 
{
	
	
	public static By Login_UID=By.xpath("//input[@id='txtUsername']");
	public static By Login_PWd=By.xpath("//input[@id='txtPassword']");
	public static By Login_Submit_button=By.xpath("//input[@id='btnLogin']");
	public static By Forgot_password_link=By.xpath("//a[@href='/index.php/auth/requestPasswordResetCode']");
	
	public static String Ip_url="https://opensource-demo.orangehrmlive.com/";
}
