//how to use File Writer class
package JavaProgramsDemo;

import java.io.*;


public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter fw = new FileWriter("C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\File\\JavaTest.txt");
			fw.write("SimpleTrick");
			fw.close();
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
