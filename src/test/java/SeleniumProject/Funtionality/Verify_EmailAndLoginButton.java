//Write a script to verify that height of email password and login button which are present in FB login page are same?
package SeleniumProject.Funtionality;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_EmailAndLoginButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		Dimension s1 = email.getSize();
		int h1 = s1.getHeight();
		System.out.println("Height of the EMail textbox: " +h1);
		WebElement pwd = driver.findElement(By.id("pass"));
		Dimension s2 = pwd.getSize();
		int h2 = s2.getHeight();
		System.out.println("Height of password textbox: " +h2);
		WebElement button = driver.findElement(By.id("u_0_v"));
		Dimension s3 = button.getSize();
		int h3 = s3.getHeight();
		System.out.println("Height of login button: "+h3);
		if(h1-h2==0&&h2-h3==0&&h3-h1==0) {
			System.out.println("Height of the email, password and login button is same");
		}else
		{
			System.out.println("Height of the email, password and login button is not same");
		}
	}

}
