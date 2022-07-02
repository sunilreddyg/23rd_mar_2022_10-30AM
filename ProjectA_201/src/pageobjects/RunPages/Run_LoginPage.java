package pageobjects.RunPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.Pages.OrangeHRM_HomePage;

public class Run_LoginPage {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    
		driver.manage().window().maximize(); 
		
		//To IDentify @Findy methods We should Take Help of page Factory Class
		OrangeHRM_HomePage Home=PageFactory.initElements
				(driver, OrangeHRM_HomePage.class);
		
		driver.get(Home.IP_url);
		
		//Testcase:--> Valid Username and Valid Password
		Home.username.sendKeys(Home.IP_username);
		Home.password.sendKeys(Home.IP_password);
		Home.login_btn.click();
		
		//Testcase:--> Login with valid email and Invalid password
		driver.get(Home.IP_url);
		Home.usernameentry("Admin");
		Home.passwordentry("Admin");
		Home.clickingloginbutton();
		Thread.sleep(3000);
		if(Home.Verify_Login_pageErrorText("Invalid credentials"))
			System.out.println("Testpass Error message is displayed");
		else
			System.out.println("Testpass error message is not displayed");
		
		
		//Testcase:--> Login without Password Entry
		driver.get(Home.IP_url);
		Home.userlogin("Admin", "");
		Thread.sleep(3000);
		if(Home.Verify_Login_pageErrorText("Password cannot be empty"))
			System.out.println("Testpass Error message is displayed");
		else
			System.out.println("Testpass error message is not displayed");
		
		
		

	}

}
