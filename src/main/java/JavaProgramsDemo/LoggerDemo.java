//How to use the logger class
package JavaProgramsDemo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerDemo {

	private static final Logger logger = Logger.getLogger(LoggerDemo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		logger.log(Level.WARNING,"HelloWorld");
		//in selenium we are using Reporter.log
		// Basically this is used as Level of alert message whether its a critical message or not it will show as console what's the message type
		
		
	}

}
