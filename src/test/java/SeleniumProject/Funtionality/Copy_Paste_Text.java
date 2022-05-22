//Write a script to copy & paste the value present in one text box into another text box?
package SeleniumProject.Funtionality;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copy_Paste_Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://Google.com");

		//FInd the first textbox web element
		WebElement tx1 = driver.findElement(By.id("t1"));
		//Select the text and Copy it
		tx1.sendKeys(Keys.CONTROL+"a");
		tx1.sendKeys(Keys.CONTROL+"c");
		//find the second text box element
		WebElement tx2 =driver.findElement(By.id("t4"));
		tx2.clear();
		//paste the content which was copied before
		tx2.sendKeys(Keys.CONTROL+"v");
		
	}

}
