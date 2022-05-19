package SeleniumProject.Funtionality;

//import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMclassDemo {
	
	@FindBy(id ="username")
	private WebElement unusername;
	
	public POMclassDemo(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void setName(String user)
	{
		unusername.sendKeys(user);
	}

}
