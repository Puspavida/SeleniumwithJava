//Write a script to print x and y coordinates of an element?
package SeleniumProject.Funtionality;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XandY_Coordinates_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://Google.com/");
		WebElement dan = driver.findElement(By.id("email"));
		//Get the location of the element box
		Point p =dan.getLocation();
		//get the pixel of the X location
		System.out.println("X coordinate (in pixels): " +p.getX());
		//Get the pixel of the Y location
		System.out.println("Y coordinate (in pixels): " +p.getY());
	}

}
