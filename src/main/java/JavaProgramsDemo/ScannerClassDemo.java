//uses of the Scanner class
package JavaProgramsDemo;

import java.util.*;
public class ScannerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
	
		String name= sc.nextLine();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Enter your salary: ");
		double salary = sc.nextDouble();
		
		System.out.println("The name is: " +name);
		System.out.println("The age is: " +age);
		System.out.println("The Salary is: " +salary);
	}

}
