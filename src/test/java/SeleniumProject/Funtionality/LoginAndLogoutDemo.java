package SeleniumProject.Funtionality;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndLogoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://Google.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("pwd")).sendKeys("admin1");
		driver.findElement(By.id("loginButton")).click();
		while(true)
		{
			try {
				driver.findElement(By.id("logoutLink")).click();
				break;
			
			}catch(NoSuchElementException e) {
				System.out.println("NoSuchElementException");
			}
		}
	}

}
