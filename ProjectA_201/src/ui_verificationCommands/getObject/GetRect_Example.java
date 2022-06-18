package ui_verificationCommands.getObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect_Example
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
		WebElement RoundTrip=driver.findElement(By.xpath("//li[contains(@data-cy,'roundTrip')]"));
	

		System.out.println(RoundTrip.getRect().getX());
		System.out.println(RoundTrip.getRect().getY());
		System.out.println(RoundTrip.getRect().getHeight());
		System.out.println(RoundTrip.getRect().getWidth());
		System.out.println(RoundTrip.getRect().getDimension());
		System.out.println(RoundTrip.getRect().getPoint());
	}

}
