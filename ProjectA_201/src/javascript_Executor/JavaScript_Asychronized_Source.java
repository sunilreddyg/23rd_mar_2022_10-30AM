package javascript_Executor;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Asychronized_Source {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		// Performing a sleep in the browser under test. 
		
		   long start = System.currentTimeMillis();
		
		   ((JavascriptExecutor) driver)
		   .executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
		 
		   System.out.println("Elapsed time:--> "+(System.currentTimeMillis()-start));
		  
		  System.out.println("All Source loaded at webpage");
		  
		  
		 

	}

}
