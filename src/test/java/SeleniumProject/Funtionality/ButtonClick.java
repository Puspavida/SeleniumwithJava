//How to click on button by using sendKeys() method?
package SeleniumProject.Funtionality;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ButtonClick {

	@Test
	public void ButtonClickDemo() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement btn = driver.findElement(By.id("button"));
		btn.sendKeys(Keys.ENTER);
	}
}
