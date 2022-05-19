//how to use file reader class
package JavaProgramsDemo;
import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\File\\JavaTest.txt");
		char[] charr = new char[20];
		fr.read(charr);
		int len = charr.length;
		for(int i = 0; i<len; i++)
		{
			System.out.print(charr[i]);
		
		}
		fr.close();
	}

}
