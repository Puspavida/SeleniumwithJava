package SeleniumProject.Funtionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Constructor5 {
	
	@FindBy(id="username")
	private WebElement unTextbox;
	public void setUsername(String un) {
		unTextbox.sendKeys(un);
	}
	
	@Test
	public void mainclass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com/");
		Constructor5 cons =  new Constructor5();
		PageFactory.initElements(driver, cons);
		cons.setUsername("admin");
	}

}
