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
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		//Identifying single element
		WebElement Dropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		//Select Book OPtions
		new Select(Dropdown).selectByVisibleText("Books");
		
		WebElement Search_button=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		new Actions(driver).click(Search_button).perform();
		Thread.sleep(5000);
		
		WebElement PopularBooks=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]"));
		List<WebElement> Books=PopularBooks.findElements(By.tagName("a"));
		
		for (int i = 0; i < Books.size(); i++) 
		{
			//Get Each book using index number
			WebElement EachBook=Books.get(i);
			System.out.println("Bookname:-->"+EachBook.getText());
			System.out.println("Book Address:-->"+EachBook.getAttribute("href"));
		}
		
		
		
		
		
	}

}
