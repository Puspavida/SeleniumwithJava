//Write a script verify whether page is loaded within 3 second?
package SeleniumProject.Funtionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeLimit {

	@Test
	public void Timeperformance() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		try {
			 driver.get("https://www.google.com/");
			 String  title =driver.getTitle();
			 System.out.println(title);
		}
		catch(TimeoutException e)
		{
			System.out.println("The page is not loadded within 1 sec");
		}
		
	}
}
