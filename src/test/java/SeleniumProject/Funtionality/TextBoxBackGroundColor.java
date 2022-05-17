//Write a script to print the background color of a textbox?

package SeleniumProject.Funtionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextBoxBackGroundColor {

	@Test
	public void BackText()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement color= driver.findElement(By.id("username"));
		//get the background color we have to use getCssValue() method
		System.out.println("The text background color is : " +color.getCssValue("color"));
	}
}
