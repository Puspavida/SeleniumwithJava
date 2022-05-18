//How do you compare actual and expected results without using if-else statement?
package SeleniumProject.Funtionality;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CompareResult {

	public WebDriver driver;
	public String Title;
	
	@BeforeMethod
	public void preConditions() {
		//Reporter.log("Expected Title");
		System.out.println("Enter the value: ");
		Scanner sc = new Scanner(System.in);
		Title =sc.next();
		Reporter.log("Title: " +Title, true);
		Reporter.log("Open the Chrome browser", true);
		//driver = new ChromeDriver();
		}
	
	@Test
	public void testGoogle() {
		Reporter.log("Google Opened", true);
		//driver.get("http://google.com/");
		
		String actualresult = "Google";
		
		Reporter.log("Google Title captured"+actualresult, true);
		//String titles= driver.getTitle();
		Assert.assertEquals(actualresult, Title);
	}
	
	@AfterMethod
	public void postConidtion() {
		Reporter.log("Close the browser", true);
		//driver.close();
	}
}
