package SeleniumProject.Funtionality;
//testcase three

import BaseTest.Base;
import org.testng.annotations.*;

public class VerifyBuildNumber extends Base{
/* 1.	Enter the valid username
2.	Enter the valid password
3.	Click on login button
4.	Click on Help
5.	Click on About actiTime
6.	Verify that build number is 2772661
7.	Click on logout
8.	Click on close
 **/
	
	@Test
	public void testVerifyBuildNumber() {
		POMLoginPage poms = new POMLoginPage(driver);
		//Eneter the Valid Username
		poms.setUsername("admin");
		//Enter the valid password
		poms.setPassword("1234");
		//click on login link
		poms.btnLogin();
		
		EnterTimeTrackPage ttpp= new EnterTimeTrackPage(driver);
		//click on Help link
		ttpp.helpElement();
		// click on AboutActiTime
		ttpp.clickAboutActiTime();
		//Verify the Build Number
		ttpp.verifyBuildNumber("29885");
		//close about ActiTime popup
		ttpp.clickClose();
		//click on logout link
		ttpp.clickLogoutLink();
	}
	
}
