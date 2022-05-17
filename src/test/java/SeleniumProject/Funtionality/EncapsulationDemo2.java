package SeleniumProject.Funtionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EncapsulationDemo2 {

	@Test
	public void Encapsulation() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		EncapsulationDemo demo = new EncapsulationDemo(driver);
		demo.setUserName();
	}
}
