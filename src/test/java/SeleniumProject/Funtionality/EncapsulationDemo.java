package SeleniumProject.Funtionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EncapsulationDemo {
	
	private WebElement TextBox;
	public EncapsulationDemo(WebDriver driver) {
		TextBox=driver.findElement(By.id("Username"));
	}
	
	public void setUserName()
	{
		TextBox.sendKeys("admin");
	}

}
