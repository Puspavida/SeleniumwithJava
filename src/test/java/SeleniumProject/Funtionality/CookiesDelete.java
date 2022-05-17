//Write a script to delete all the cookies present in the browser?
package SeleniumProject.Funtionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CookiesDelete {

	@Test
	public void Cookies() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		//deleteAllCookies() method we can use the delete all the cookies
	}
}
