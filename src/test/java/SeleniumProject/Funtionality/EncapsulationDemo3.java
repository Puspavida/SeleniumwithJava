package SeleniumProject.Funtionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EncapsulationDemo3 {

	private WebElement unusername;
	private WebElement pwpassword;
	private WebElement login;
	public EncapsulationDemo3(WebDriver driver) {
		unusername=driver.findElement(By.id("username"));
		pwpassword=driver.findElement(By.id("password"));
		login=driver.findElement(By.id("login"));
	}
	public void login(String un, String pw) {
		unusername.sendKeys(un);
		pwpassword.sendKeys(pw);
		login.click();
	}
	@Test
	public void Encapsulation1() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		EncapsulationDemo3 demo1=new EncapsulationDemo3(driver);
		demo1.login("Sam", "123456");
	}
	
}