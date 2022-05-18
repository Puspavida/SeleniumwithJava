package SeleniumProject.Funtionality;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsssertDemo {
	
	@Test
	public void testGoogle() {
		SoftAssert sft = new SoftAssert();
		Reporter.log("Step 1", true);
		sft.assertEquals("xyz", "xyz");
		Reporter.log("Step 2", true);
		Reporter.log("Step 3", true);
		sft.assertAll();
		Reporter.log("Step 4", true);
	}

}
