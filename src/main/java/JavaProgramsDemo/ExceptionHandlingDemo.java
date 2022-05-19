//How to use Exceptional Handling Blocks
package JavaProgramsDemo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int[] arr = new int[2];
			arr[0]=45;
			arr[1]=12;
		//int i = 0;
		int j =arr.length;
		for(int i = 0; i<j;i++)
		{
			System.out.println(arr[i]);
		}
			//	arr[2]=65;
			
		}catch (Exception e) {
			System.out.println("A exception has occured");
		}
	}

}
