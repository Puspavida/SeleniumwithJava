package SeleniumProject.Funtionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.*;


public class POMLoginPage {

	@FindBy(id="username")
	private WebElement unusername;
	@FindBy(id="password")
	private WebElement pwpassword;
	@FindBy(id="loginbutton")
	private WebElement button;
	@FindBy(xpath="//span[contains[text()='is invalid']]")
	private WebElement errmsg;

	public POMLoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String un) {
		unusername.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		pwpassword.sendKeys(pw);
	}
	public void btnLogin() {
		button.click();
	}
	
	public void getError() {
		Assert.assertTrue(errmsg.isDisplayed());
	}


}
