package SeleniumProject.Funtionality;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyExample {
	
	@Test (priority = 2)
	public void createUser() {
		Reporter.log("Create the user", true);
		Assert.fail();// We can intentioanlly failed the testcase.
	}
	@Test (priority = 1, dependsOnMethods= {"createUser"})
	public void deleteUser() {
		Reporter.log("Delete the user details ", true);
	}

}
