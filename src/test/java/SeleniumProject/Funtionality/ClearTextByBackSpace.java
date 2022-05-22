//Write a script to clear the text present in the text box by pressing back space?
package SeleniumProject.Funtionality;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTextByBackSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://Google.com/");
		WebElement web = driver.findElement(By.id("t4"));
		String st = web.getAttribute("value");
		//First read the string then calculate the length
		int count = st.length();
		//By using the for loop we can count the length then click on backspace
		for(int i =1;i<=count;i++) {
			web.sendKeys(Keys.BACK_SPACE);
		}

	}

}
