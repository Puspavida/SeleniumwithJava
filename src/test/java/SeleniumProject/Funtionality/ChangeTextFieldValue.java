//Write the code to change the value present in the text box?
package SeleniumProject.Funtionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeTextFieldValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://Google.com/");
		WebElement wb = driver.findElement(By.id("t3"));
		wb.clear();
		wb.sendKeys("test");
	}

}
