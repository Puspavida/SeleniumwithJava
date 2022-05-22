//Write a script to print text of the Link?
package SeleniumProject.Funtionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Text_Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://Google.com/");
		//Navigate to the highlight link
		WebElement linktext = driver.findElement(By.xpath("//input[@id='persitbox']"));
		//get the string text value
		String text = linktext.getText();
		//print the text
		System.out.println(text);
	}

}
