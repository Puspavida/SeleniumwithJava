package SeleniumProject.Funtionality;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class TakeScreenshotDemo {

	@SuppressWarnings("deprecation")
	@Test
	public void ScreenshotDemo() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com/");
		TakesScreenshot e = (TakesScreenshot)driver;
		File src = e.getScreenshotAs(OutputType.FILE);
		File destfile = new File("D://iaj.png");
		FileUtils.copyFile(src,destfile);
	}
}
