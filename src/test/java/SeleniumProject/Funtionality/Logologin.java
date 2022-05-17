//Write a script to verify that logo of actitime is displayed on the login page?
package SeleniumProject.Funtionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logologin {

	@Test
	public void logoDisplay() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com/");
		WebElement logo= driver.findElement(By.id("logo"));
		if(logo.isDisplayed()) {
			System.out.println("Logo is Displayed");
		}else
		{
			System.out.println("Logo is not Displayed");
		}
		
	}
}
