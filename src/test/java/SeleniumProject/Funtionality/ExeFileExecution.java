//How do you execute an exe file in Selenium?
package SeleniumProject.Funtionality;

import java.io.IOException;

import org.testng.annotations.Test;

public class ExeFileExecution {

	@Test
	public void ExeFile() throws IOException {
		Runtime.getRuntime().exec("c:/Windows/system32/calc.exe");
		//It will handle the system app 
		
	}
}
