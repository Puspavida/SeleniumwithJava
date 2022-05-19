package JavaProgramsDemo;

import java.io.*;
public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fos= new FileOutputStream("C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\File\\JavaTest.txt");
		String message = "My name is Khan";
		byte[] bytemsg = message.getBytes();
		fos.write(bytemsg);
		fos.close();
		System.out.println("Successfully addded.");
		 
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\File\\JavaTest.txt");
		
		int i =0;
		while((i=fis.read())!=-1)
		{
			System.out.print((char) i);
		}
		fis.close();
		
	}

}
