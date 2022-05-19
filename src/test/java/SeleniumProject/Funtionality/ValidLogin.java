package SeleniumProject.Funtionality;

import org.testng.annotations.Test;

import BaseTest.Base;

public class ValidLogin extends Base{

	//This is the Testcase one
	/*  1.	Enter the valid username
2.	Enter the valid password
3.	Click on login button
4.	Click on logout link
 **/
	@Test
	public void testValidLogin() {
		POMLoginPage poms= new POMLoginPage(driver);
		//Enter the user name
		poms.setUsername("Admin");
		//Enter the password
		poms.setPassword("password");
		//click on login option
		poms.btnLogin();
		//click on logout
		EnterTimeTrackPage ett = new EnterTimeTrackPage(driver);
		ett.clickLogoutLink();
	}
}
