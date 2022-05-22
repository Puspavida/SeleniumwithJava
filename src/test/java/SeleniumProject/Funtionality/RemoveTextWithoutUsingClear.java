//Write a script to remove text present in the text box without using clear method? we can use Keys.Control option 
package SeleniumProject.Funtionality;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveTextWithoutUsingClear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://Google.com/");
		WebElement wb = driver.findElement(By.id("t4"));
		wb.sendKeys(Keys.CONTROL+"a");
		wb.sendKeys(Keys.DELETE);
	}

}
