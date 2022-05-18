package SeleniumProject.Funtionality;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	@Test
	public void TestNGDEmo1()
	{
		//we have used log for printing the text
		Reporter.log("Welcome to TestNG Instead of Print we can use this",true);
	}

}
