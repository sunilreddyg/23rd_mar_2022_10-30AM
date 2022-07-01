package findelements.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Table_Data_From_SpecificRow_And_Cell {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.icicidirect.com/sector/sectorsnapshot/it%20-%20software");
		driver.manage().window().maximize();
		
		
		WebElement Table=driver.findElement(By.xpath("//table[contains(@class,'result')]"));
		
		//Finding list of rows available with in table
		List<WebElement> rows=Table.findElements(By.tagName("tr"));
		rows.remove(0);
		
		//Target 4th row
		WebElement SecondRow=rows.get(3);
		
		//Finding list of cells under second row
		List<WebElement> Cells=SecondRow.findElements(By.tagName("td"));
		
		String CName=Cells.get(0).getText();
		String Profit=Cells.get(2).getText();
		
		System.out.println(CName+"    "+Profit);
	}

}
