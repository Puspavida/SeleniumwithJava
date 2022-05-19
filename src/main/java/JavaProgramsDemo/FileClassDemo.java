//Shows the way to use the file class
package JavaProgramsDemo;

//In this package file methods are present
import java.io.File;

public class FileClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//File class
		//Given the file path
		String path ="C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\File\\JavaTest.txt";
		//create a file class to create a new file
		File file = new File(path);
		//used the file class to read the file content is available or not
		System.out.println("Can we read the file: " +file.canRead());
		
		
	}

}
