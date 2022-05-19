//Open the browser and enter the following url then enter invalid email address, invalid password and click on signIn verify that error message is displayed
package SeleniumProject.Funtionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameExample {

	@Test
	public void framesDemo() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://google.com/");
		driver.findElement(By.id("Id")).sendKeys("admin1");
		driver.findElement(By.id("pwd")).sendKeys("1234");
		driver.findElement(By.id("submit_but")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("zohoiam");
		
		WebElement errmsg = driver.findElement(By.id("msgpanel"));
		if(errmsg.isDisplayed())
		{
			System.out.println(errmsg.getText());
		}
	}
}
