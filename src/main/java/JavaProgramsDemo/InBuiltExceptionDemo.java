//How to use in built function
package JavaProgramsDemo;

public class InBuiltExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int[] arr = new int[2];
			arr[3]=45;
		}catch(ArrayIndexOutOfBoundsException exp)
		{
			System.out.println("ArrayIndexOutofBound Exception Occured");
		}
	}

}
