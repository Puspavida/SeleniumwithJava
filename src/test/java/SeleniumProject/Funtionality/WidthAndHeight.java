//Write a script to print Width and Height of a text box?
package SeleniumProject.Funtionality;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WidthAndHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://Google.com/");
		WebElement email = driver.findElement(By.id("Email"));
		Dimension d = email.getSize();
		System.out.println("Height of the textbox: " +d.getHeight());
		System.out.println("Width of the textbox: " +d.getWidth());
	}

}
