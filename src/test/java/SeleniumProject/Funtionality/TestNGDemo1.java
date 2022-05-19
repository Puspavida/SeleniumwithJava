package SeleniumProject.Funtionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGDemo1 {

	@Test
	public void TestDemo() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://google.com/");
		POMclassDemo pos = new POMclassDemo(driver);
		pos.setName("admin");
	}
}
