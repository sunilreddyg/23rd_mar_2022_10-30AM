package pageobjects.Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class OrangeHRM_Menu_List
{
	WebDriver driver;
	
	public OrangeHRM_Menu_List(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;  //Assigning browser controls to Global Driver
	}
	
	@FindBy(xpath = "//b[contains(.,'Admin')]")
	public WebElement  admin;
	
	@FindBy(xpath = "//b[contains(.,'PIM')]")
	public WebElement  pIM;
	
	@FindBy(xpath = "//b[contains(.,'Leave')]")
	public WebElement  leave;
	
	@FindBy(xpath = "//b[contains(.,'Time')]")
	public WebElement  time;
	
	@FindBy(xpath = "//b[contains(.,'Recruitment')]")
	public WebElement  recruitment;
	
	@FindBy(xpath = "//b[contains(.,'My Info')]")
	public WebElement  myInfo;
	
	@FindBy(xpath = "//b[contains(.,'Performance')]")
	public WebElement  performance;
	
	@FindBy(xpath = "//b[contains(.,'Dashboard')]")
	public WebElement  dashboard;
	
	@FindBy(xpath = "//b[contains(.,'Directory')]")
	public WebElement  directory;
	
	@FindBy(xpath = "//b[contains(.,'Maintenance')]")
	public WebElement  maintenance;
	
	@FindBy(xpath = "//b[contains(.,'Buzz')]")
	public WebElement  buzz;


	public boolean veriyPageurl()
	{
		String Pageurl=driver.getCurrentUrl();
		boolean flag=Pageurl.contains("dashboard");
		return flag;
	}
}