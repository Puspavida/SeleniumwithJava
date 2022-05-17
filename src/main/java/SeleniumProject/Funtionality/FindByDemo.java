package SeleniumProject.Funtionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindByDemo {
	//define the webelement with locator value
	@FindBy(id="Username")
	private
	WebElement unTextBox;

	@FindBy(id="password")
	private
	WebElement pwPassword;

	//initializing the element not the actual one just to avoid the staleElementException
	public FindByDemo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void login(String un, String pw) {
		unTextBox.sendKeys(un);
		pwPassword.sendKeys(pw);
	}
	
	
}


