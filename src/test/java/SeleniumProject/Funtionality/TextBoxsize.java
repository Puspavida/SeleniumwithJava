//How do you get the font size of the text box?
package SeleniumProject.Funtionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextBoxsize {

	@Test
	public void TextBoxsizes() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement usertextbox = driver.findElement(By.id("username"));
		String font_size = usertextbox.getCssValue("font-size");
		System.out.println(font_size);
		driver.close();// it will close the current browser
	}
}
