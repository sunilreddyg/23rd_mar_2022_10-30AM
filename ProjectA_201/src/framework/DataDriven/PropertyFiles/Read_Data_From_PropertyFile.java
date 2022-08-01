package framework.DataDriven.PropertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Read_Data_From_PropertyFile {

	public static void main(String[] args) throws IOException, Exception 
	{
		//Target file location
		FileInputStream fi=new FileInputStream("src\\framework\\DataDriven\\PropertyFiles\\input.properties");
		System.out.println("File located");
		
		//Create object for properties
		Properties repository=new Properties();
		//Load file objects to repository
		repository.load(fi);
		
		//Get Any single object from repository using keyname
		String SelectedBrowser=repository.getProperty("browser");
		String Appurl=repository.getProperty("url");
		String driverpath=repository.getProperty("driverpath");
		
		
		WebDriver driver=null;
		if(SelectedBrowser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", driverpath+"chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(SelectedBrowser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", driverpath+"geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		
		driver.get(Appurl);
		
		
		Thread.sleep(5000);
		String UID=Read_propertyFile.getProperty("username");
		driver.findElement(By.name("username")).sendKeys(UID);
		
		
		Read_propertyFile.setProperty("Result", "TestPass");
		
	}

}
