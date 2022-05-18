package SeleniumProject.Funtionality;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	
	
		@BeforeClass
		public void openApp() {
			Reporter.log("Open App", true);
		}
		@AfterClass
		public void closeApp() {
			Reporter.log("Close the app", true);
		}
		@BeforeMethod
		public void Login() {
			Reporter.log("login the app by giving username and password", true);
		}
		@AfterMethod
		public void logout() {
			Reporter.log("Logout the app ", true);
		}
		@Test (priority = 2, invocationCount=2)
		public void editUser() {
		
			Reporter.log("Edit the user details", true);
		}
		@Test
		public void register() {
		
			Reporter.log("Register the user details in the new app", true);
		}
		
		@Test
		public void deleteUser() {
			Reporter.log("Deletet the created user", true);
		}
	}


