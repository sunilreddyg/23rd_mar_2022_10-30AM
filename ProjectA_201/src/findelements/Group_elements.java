package findelements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Group_elements 
{

	public static void main(String[] args) 
	{
		
	
		/*
		 * FindElement:--->
		 * 			FindElement is a webdriver method which helps to identify any
		 * 			single object with in webpage using ID and Name properties..
		 * 
		 * Syntax:--->
		 * 			WebElement Object=driver.findElement(By.id("propertyvalue"));
		 */
		
		/*
		 * FindElements:--->
		 * 			FindElements is a webdriver method which helps to identify group
		 * 			objects with in webpage using Tagname and classname.
		 * 
		 * 			List<WebElement> Objects=driver.findElements(By.classname("class property"));
		 * 			List<WebElement> Objects=driver.findElements(By.tagname("tagname"));
		 */
		
		
		
		//Don't execute this programm...
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.sampledomain.com/");
		driver.manage().window().maximize();
		
		//Identify single element
		WebElement Element=driver.findElement(By.id("X"));
		
		//set of actions we can perform on single element
		Element.clear();
		Element.sendKeys("");
		Element.click();
		Element.getText();
		Element.isDisplayed();
		Element.submit();
		Element.findElement(By.id("y"));
		Element.findElements(By.className("category"));
		
		
		//Identify Group elements
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		
		//Get single element from list of webelment using index number
		WebElement Single_element=alllinks.get(4);
		
		//set of actions we can perform on single element
		Single_element.click();
		Single_element.clear();
		Single_element.sendKeys("");
		Single_element.getText();
		Single_element.isDisplayed();
		Single_element.submit();
		Single_element.findElement(By.id(""));
		Single_element.findElements(By.tagName(""));
		
		
		
		
		
		
		
		
	}

}
