//How to send a data from TestNG xml suite or xml file into TestNG methods?
package SeleniumProject.Funtionality;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.xml.XmlTest;


public class DemoA {

	@BeforeMethod
	public void preCondition(XmlTest x) {
		String s = x.getParameter("State");
		Reporter.log(s,true);
	}
	@Test
	public void testA(XmlTest x) {
		String c = x.getParameter("City");
		Reporter.log(c,true);
	}
	@AfterMethod
	public void postCondtion(XmlTest x) {
		String a = x.getParameter("Area");
		Reporter.log(a,true);
	}
}
