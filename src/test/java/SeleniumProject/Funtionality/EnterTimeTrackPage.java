package SeleniumProject.Funtionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EnterTimeTrackPage {
	
	@FindBy(id="logout")
	private WebElement clicklogout;
	
	@FindBy(xpath="//div[@class='popup_menu_arrow\']")
	private WebElement helpElement;
	
	@FindBy(linkText="About actTime")
	private WebElement aboutActTime;
	
	@FindBy(xpath="//span[contains(text(), 'build')]")
	private WebElement buildnumber;
	
	@FindBy(xpath="//im[@title = 'sim']")
	private WebElement close;

	public EnterTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogoutLink() {
		clicklogout.click();
	}
	
	public void helpElement() {
		helpElement.click();
	}
	
	public void clickAboutActiTime() {
		aboutActTime.click();
	}
	
	public void verifyBuildNumber(String BuildNumber)
	{
		String aBuildNumber = buildnumber.getText();
		Assert.assertEquals(aBuildNumber, BuildNumber);
	}
	public void clickClose()
	{
		close.click();
	}
	
}
