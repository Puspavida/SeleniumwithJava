//How to use HashMap
package JavaProgramsDemo;

import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hmap = new HashMap<>();
		//added all the list to the HashMap as Key and Values pairs
		hmap.put(1, "Sam");
		hmap.put(2, "Hasni");
		hmap.put(8, "Tina");
		hmap.put(4, "Ghanto");
		//Printed all the maps
		System.out.println("The HashMap value is : " +hmap);
		//Get the value based on the keys
		System.out.println("The value of 2 is: " +hmap.get(8));
		//Give the size of the HashMap
		System.out.println("The size of the HashMap is :" +hmap.size());
		//If the containsKey value or key matched with mentioned element
		System.out.println("The HashMap contains key 3: "+hmap.containsKey(3));
		System.out.println("The HashMap contains the value as Tina :" +hmap.containsValue("Tina"));
		//remove the key from the list
		hmap.remove(4);
		System.out.println("The HashMap value is : " +hmap);
		
	}

}
