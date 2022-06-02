package robot_window_interface;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		
		WebElement Upload_link=driver.findElement(By.xpath("//button[contains(.,'Upload & Download')]"));
		Upload_link.click();
		Thread.sleep(2000);
		
		WebElement UploadButton=driver.findElement(By.xpath("//input[@id='uploadFile']"));
		new Actions(driver).click(UploadButton).perform();
		Thread.sleep(2000);
		
		String path="D:\\Sample_Resume\\3year_EXP\\MyResume";

		//Copy Path to Clipbaord
		StringSelection spath=new StringSelection(path);
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(spath, spath);
		
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		//Release Control key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
	}

}
