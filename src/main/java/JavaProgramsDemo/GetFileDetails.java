//How to use file class to get the file details
package JavaProgramsDemo;
import java.io.File;

public class GetFileDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fp = new File("C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\File\\JavaTest.txt");
		//It will give the file path
		System.out.println(fp.getAbsolutePath());
		//It will give the folder path
		System.out.println(fp.getParent());
	}

}
