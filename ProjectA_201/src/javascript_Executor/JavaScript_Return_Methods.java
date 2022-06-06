package javascript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Return_Methods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		//enable  javascript executor on automatio browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Return Cookies enabled
		String wintitle=js.executeScript("return document.title").toString();
		System.out.println(wintitle);
		
		//Return url of the current window
		String url=js.executeScript("return location.href").toString();
		System.out.println(url);
		
		//Return Protocal of browser
		String protocal=js.executeScript("return location.protocol").toString();
		System.out.println(protocal);
		
		//Return Cookies enabled
		String st=js.executeScript("return navigator.cookieEnabled").toString();
		System.out.println(st);
				
		//Return Cookies enabled
		String st1=js.executeScript("return navigator.platform").toString();
		System.out.println(st1);
		
		//Open New window at Browser
		js.executeScript("window.open('http://google.com')");
		
		//Create Alert at window
		js.executeScript("alert('Please Enter username')");
		
		
	}

}
