//How to use logger with multiple properties
package JavaProgramsDemo;

import java.util.logging.Level;
import java.util.logging.Logger;

class Student100{
	public String stuName;
	public int stuId;

}

public class Loggerproperties {

	private static final Logger logger = Logger.getLogger(Loggerproperties.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO,"Our application just started.");
		Student100 s100 = new Student100();
		s100.stuName = "Ramya";
		s100.stuId= 5;

		//here we have define two parameter with the help of new Object[] (Passed multiple parameter)
		logger.log(Level.INFO,"The Student Name is {0} Student Id is {1}", new Object[] {s100.stuName,s100.stuId});

		


		}

	}
