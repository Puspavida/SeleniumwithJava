package SeleniumProject.Funtionality;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class UseDemo2 {
	
	public WebDriver driver;

	@Test
	public void Demo4() throws InterruptedException
	{
		FindByDemo demo2= new FindByDemo(driver);
		demo2.login("xyz", "ttt");
		Thread.sleep(5000);
	}
}
