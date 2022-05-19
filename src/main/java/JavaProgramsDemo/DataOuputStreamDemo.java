//How to use Data Output Stream
package JavaProgramsDemo;
import java.io.*;

public class DataOuputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileOutputStream fos = new FileOutputStream("C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\File\\JavaTest.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		//its allow to write primitive data types
		dos.writeInt(66);
		System.out.println("Added");
		dos.flush();
		fos.close();	
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}
	}

}
