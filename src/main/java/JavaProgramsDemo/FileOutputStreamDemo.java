//How to use FileOutputStream class 
package JavaProgramsDemo;
import java.io.*;
public class FileOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\File\\JavaTest.txt");
		
			String str = "Hello World";
			//Need to convert string to byte as we have to convert so it should be readable.
			byte[] arr = str.getBytes();
			fos.write(arr);//To write the byte into the txt file one by one
			fos.close(); // once its done it will close the file and update successfully updated
			System.out.println("The file has successfully updated.");
		}catch(IOException e) {
			System.out.println("An Exception has Occured");
		}

	}

}
