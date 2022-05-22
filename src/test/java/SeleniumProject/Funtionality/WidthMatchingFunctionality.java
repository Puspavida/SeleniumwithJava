//Write a script to verify that width of email textbox and next button is same which are present in Gmail login page?
package SeleniumProject.Funtionality;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WidthMatchingFunctionality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://Google.com/");
		WebElement web1 = driver.findElement(By.id("Email"));
		Dimension s1 = web1.getSize();
		int w1 = s1.getWidth();
		WebElement web2 = driver.findElement(By.id("next"));
		Dimension s2 = web2.getSize();
		int w2 = s2.getWidth();
		System.out.println("Width of Email textbox: " +w1);
		System.out.println("Width of the next Button: "+w2);
		if (w1==w2)
		{
			System.out.println("Width of email textbox and next button is same");
		}else {
			System.out.println("Width of the email textbox and next button is not same.");
		}
	}

}
