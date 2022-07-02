package pageobjects.RunPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pageobjects.Pages.AssignLeave;
import pageobjects.Pages.OrangeHRM_DashBoard;
import pageobjects.Pages.OrangeHRM_HomePage;

public class Run_PagesWith_Constrcutor_Help {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    
		driver.manage().window().maximize(); 
		
		OrangeHRM_HomePage home=PageFactory.initElements(driver, OrangeHRM_HomePage.class);
		driver.get(home.IP_url);
		home.userlogin("Admin", "admin123");
		Thread.sleep(3000);
		
		OrangeHRM_DashBoard dashboard=new OrangeHRM_DashBoard(driver);
		dashboard.AssignLeave.click();
		Thread.sleep(3000);
		
		AssignLeave leave=new AssignLeave(driver);
		leave.EmployeeName.sendKeys("Rahul roy patil");
		new Select(leave.LeaveType).selectByVisibleText("US - Vacation");
	}

}
