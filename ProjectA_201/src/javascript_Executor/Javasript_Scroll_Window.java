package javascript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javasript_Scroll_Window {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		
		
		
		//enable  javascript executor on automatio browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Scroll vertically
		js.executeScript("window.scrollTo(0,100)");
		
		//Scroll Horizontally 
		js.executeScript("window.scrollTo(300,0)");
		
		
}

}
