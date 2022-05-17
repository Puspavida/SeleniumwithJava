package SeleniumProject.Funtionality;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultipleElements {

	@FindBy(id="username")
	private List<WebElement> allusername;

	public MultipleElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void All() {
		int count= allusername.size();
		for(int i = 0; i<count;i++)
		{
			allusername.get(i).click();
		}
	}

}

