//Hoe to use the logging method with parameters
package JavaProgramsDemo;

import java.util.logging.Level;
import java.util.logging.Logger;

class Person100{
	public String Name;
	public int Id;
}

public class LoggerParameterDemo {

	private static final Logger logger = Logger.getLogger(LoggerParameterDemo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO,"Login Started");
		Person100 per = new Person100();
		per.Name="Simnya";
		per.Id=100;
		logger.log(Level.INFO,"Person Name {0}",per.Name);
		logger.log(Level.INFO,"Ther Person ID is {0}", per.Id);
		//with double Quote if we mentioned the parameter then the value is going to show there
		
	}

}
