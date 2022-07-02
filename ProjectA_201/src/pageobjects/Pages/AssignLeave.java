package pageobjects.Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AssignLeave
{
	
	public AssignLeave(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[contains(@id,'empName')]")
	public WebElement  EmployeeName;
	
	@FindBy(xpath = "//select[contains(@id,'txtLeaveType')]")
	public WebElement  LeaveType;
	
	@FindBy(xpath = "//a[contains(@href,'balance')]")
	public WebElement  balanceNotSufficient;
	
	@FindBy(xpath = "(//img[@class='ui-datepicker-trigger'])[1]")
	public WebElement  FromDateCalendar;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	public WebElement  FromDate_Month;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	public WebElement  FromDate_Year;
	
	@FindBy(xpath = "(//img[@class='ui-datepicker-trigger'])[2]")
	public WebElement  To_Date_calendar;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	public WebElement  ToDate_Month;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	public WebElement  ToDate_Year;
	
	@FindBy(xpath = "//select[@id='assignleave_partialDays']")
	public WebElement  PartialDays;
	
	@FindBy(xpath = "//textarea[contains(@id,'txtComment')]")
	public WebElement  Comment;
	
	@FindBy(xpath = "//input[@id='assignBtn']")
	public WebElement  assign_btn;



}