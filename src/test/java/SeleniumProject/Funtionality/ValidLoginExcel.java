package SeleniumProject.Funtionality;
import java.util.*;

import BaseTest.Base;
import Generic.Excel;

import org.testng.annotations.*;
public class ValidLoginExcel extends Base {

	@Test
	public void testValidLogin() {
		String xlspath = "C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\TestData\\Testdata.xlsx";
		String sheet = "Sheet1";
		String un = Excel.getCellData(xlspath, sheet, 1, 0);
		String pw = Excel.getCellData(xlspath, sheet, 1, 1);
		POMLoginPage login = new POMLoginPage(driver);
		login.setUsername(un);
		login.setPassword(pw);
		login.btnLogin();
		
		EnterTimeTrackPage enter = new EnterTimeTrackPage(driver);
		enter.clickLogoutLink();
		
	}
	
	//Invalid login test with multiple input multiple times
	@Test
	public void testInvalidInput() {
		String xlspath = "C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\TestData\\Testdata.xlsx";
		String sheet = "Sheet1";
		
		int rc = Excel.getRowData(xlspath, sheet);
		for(int i = 0; i<=rc; i++)
		{
			String un = Excel.getCellData(xlspath, sheet, i, 0);
			String pw = Excel.getCellData(xlspath, sheet, i, 1);
			POMLoginPage login1 = new POMLoginPage(driver);
			login1.setUsername(un);
			login1.setPassword(pw);
			login1.btnLogin();
			login1.getError();
		}
	}
}
