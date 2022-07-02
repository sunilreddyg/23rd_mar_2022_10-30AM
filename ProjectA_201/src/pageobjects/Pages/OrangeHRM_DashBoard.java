package pageobjects.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_DashBoard
{
	
	WebDriver driver;
	
	public OrangeHRM_DashBoard(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(xpath = "//span[contains(.,'Assign Leave')]") public
	WebElement AssignLeave;
	
	@FindBy(xpath = "//span[contains(.,'Leave List')]") public
	WebElement LeaveList;
	
	@FindBy(xpath = "//span[contains(.,'Timesheets')]") public
	WebElement Timesheets;
	
	@FindBy(xpath = "//span[contains(.,'Apply Leave')]") public
	WebElement ApplyLeave;
	
	@FindBy(xpath = "//span[contains(.,'My Leave')]") public
	WebElement MyLeave;
	
	
	@FindBy(xpath = "//span[contains(.,'My Timesheet')]")
	WebElement MyTimeSheet;
	
}
