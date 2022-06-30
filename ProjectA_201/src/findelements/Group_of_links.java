package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.Select;

public class Group_of_links {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
	
		WebElement FooterArea=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/footer[1]/div[1]/div[1]"));
		
		//Find list of links under FooterArea
		List<WebElement> AllLinks=FooterArea.findElements(By.tagName("a"));
		System.out.println(AllLinks.size());
		
		
		//Iterate for number of links
		for (int i=0; i <AllLinks.size(); i++) 
		{
			
			String LinkName=AllLinks.get(i).getText();
			String Linkhref=AllLinks.get(i).getAttribute("href");
			
			driver.navigate().to(Linkhref);
			Thread.sleep(4000);
			System.out.println(LinkName+"     "+driver.getTitle());
			
			//Restore all Page References to avalid stale reference exception
			driver.navigate().back();
			FooterArea=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/footer[1]/div[1]/div[1]"));
			AllLinks=FooterArea.findElements(By.tagName("a"));
		}
		
		
	}

}
