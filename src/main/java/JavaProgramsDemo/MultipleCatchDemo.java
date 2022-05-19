//How to use multiple catch blocks
package JavaProgramsDemo;
import java.io.*;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		int[] arr = new int[2];
		arr[4] = 12;
		FileInputStream fp = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\File\\JavaTest.txt");
	}
		catch(IOException e) {
			System.out.println("IOException Occured");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("An ArrayIndexOutOfBoundsException occured");
		}
		finally {
			System.out.println("Cleaning all resources");
		}
	}

}
