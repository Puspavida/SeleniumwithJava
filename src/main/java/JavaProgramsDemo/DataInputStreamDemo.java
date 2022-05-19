//How to use the DataInputStream
package JavaProgramsDemo;
import java.io.*;
public class DataInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
	
			FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\File\\JavaTest.txt");
		
			DataInputStream dis = new DataInputStream(fis);
			//char i;
			//i = (char)dis.read();// byte to char type casting we have to update
			char i = (char) dis.read();
			System.out.println(i);
			dis.close();
			fis.close();
		}catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
