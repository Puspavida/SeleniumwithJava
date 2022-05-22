//Write a code to print the value present in the textbox?
package SeleniumProject.Funtionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxValueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://Google.com/");
		//Identify the text field
		WebElement text = driver.findElement(By.id("t12"));
		//get the attribute of the textfield
		String printtext = text.getAttribute("value");
		//print the value
		System.out.println(printtext);
	}

}
