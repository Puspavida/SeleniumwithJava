//How to use SequenceInputSteeam class
package JavaProgramsDemo;
import java.io.*;
public class SequenceInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\File\\JavaTest.txt");

		FileInputStream fis1 = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\File\\JavaTest1");
		
		SequenceInputStream seq = new SequenceInputStream(fis,fis1);
		int i = 0;
		while((i=seq.read())!=-1) {
			System.out.print((char) i);
		}
		
		seq.close();
		fis.close();
		fis1.close();
		
		
	}

}
