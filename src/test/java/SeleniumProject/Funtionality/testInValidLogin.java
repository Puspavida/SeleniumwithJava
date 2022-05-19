package SeleniumProject.Funtionality;

//Testcase 2
import BaseTest.Base;
import org.testng.annotations.*;
public class testInValidLogin extends Base {
/* 1.	Enter the invalid username
2.	Enter the invalid password
3.	Click on Login button
Verify the error message is displayed
 **/
	
	@Test
	public void testinvalidLogin() {
		POMLoginPage poms = new POMLoginPage(driver);
		//Enter the invalid username
		poms.setUsername("asdd");
		//enter the invaid password
		poms.setPassword("sdfd");
		//click on login link
		poms.btnLogin();
		//verify error message
		poms.getError();
	}

}
