//Write a script to verify that email text box and Next button present in Gmail login page are aligned horizontally?
package SeleniumProject.Funtionality;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxAlignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://Google.com/");
		WebElement wb = driver.findElement(By.id("Email"));
		Point p1 =wb.getLocation();
		int x1 = p1.getX();
		System.out.println("X value of EMail field:" +x1);
		
		WebElement next = driver.findElement(By.id("next"));
	
		Point p2 = next.getLocation();
		int x2 = p2.getY();
		
		System.out.println("Y value of the next button: " +x2);
		if(x2-x1<=0)
		{
			System.out.println("Email textbox and next button aligned horizontally");
			
		}else
		{
			System.out.println("Not Alligned Horizontally.");
		}
	}

}
