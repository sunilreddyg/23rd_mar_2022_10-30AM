package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Element_Declaration
{
	
	
	//@Findby method look for object at webpage [This object only access using pagefactory class]
	@FindBy(name="firstname") WebElement Firstname_EB;
	
	//@FindBy also look for group of objects at webpage
	@FindBy(tagName="a") List<WebElement> page_links;
	

	/*
	 * Once object is located and it will not be sarched over and over again
	 * 		[Mostly it is usefull in ajax web application]
	 */
	@FindBy(name="reg_passwd__") @CacheLookup WebElement Password_EB;
	

	/*
	 * @FindBYS:
	 * When Required webelement objects need to match all of the given criteria..
	 */
	@FindBys
	({
		@FindBy(tagName="select"),       //wrong tagname 
		@FindBy(tagName="input"),
		@FindBy(className="_8esa "),
	}) List<WebElement> Bys_Group_Objects;
	
	

	/*
	 * @FindAll:-->
	 *  When required webelement objects need to match at least one of the give criteria
	 */
	
	@FindAll
	({
		@FindBy(tagName="select"),    		//wrong tagname
		@FindBy(tagName="input"),
		@FindBy(className="_8esa "),
	}) List<WebElement> Group_objects;
	
	

}
