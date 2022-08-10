package miniproject;

public interface CommonObjects 
{
	//By Default Interface class variables are static and Final
	String obj_login_email="//input[@id='txtUsername']";
	String obj_login_password="//input[@id='txtPassword']";
	String obj_login_Submit_button="//input[@id='btnLogin']";
	String obj_forgot_password="//a[@href='/index.php/auth/requestPasswordResetCode']";
	String obj_Login_password_error_location="//span[@id='spanMessage']";
}
