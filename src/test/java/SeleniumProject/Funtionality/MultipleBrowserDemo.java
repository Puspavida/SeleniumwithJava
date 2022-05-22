//How do you execue all the scripts simuntaneously on multiple browser? By using parallel option available in TestNG along with testNG parameter
package SeleniumProject.Funtionality;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.xml.XmlTest;


public class MultipleBrowserDemo {

	public WebDriver driver;
	@BeforeMethod
	public void preCondition(XmlTest x) {
		String browser = x.getParameter("browser");
		Reporter.log(browser,true);
	
		if(browser.equals("GC")) {
			System.setProperty("webriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("http://Google.com/");
	}
	
}
