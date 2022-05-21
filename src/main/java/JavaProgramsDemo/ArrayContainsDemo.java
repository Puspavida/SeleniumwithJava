package JavaProgramsDemo;

import java.util.*;
public class ArrayContainsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arr1 = new ArrayList();
		arr1.add("Ghanshyam");
		arr1.add("Rohan");
		arr1.add("Shital");
		System.out.println("The array contains : " +arr1.contains("Rohan"));
		System.out.println("The array contains : " +arr1.contains("Syam"));
		//Remove the element, array list start with index zeeo
		arr1.remove(0);
		System.out.println(arr1);
		//adding the array element with specify the index
		//Array list goes sequentially we can't add the index in between 
		arr1.add(0, "Syam");
		arr1.add(3, "Roshmi");
		System.out.println(arr1);
	}

}
