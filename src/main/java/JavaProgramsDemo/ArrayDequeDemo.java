package JavaProgramsDemo;

import java.util.*;
public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque<String> arr = new ArrayDeque<String>();
		//added in the list in the ArrayDeque
		arr.add("Nishant");
		arr.add("Hashni");
		arr.add("Vishma");
		//listed the array size
		System.out.println("The ArrayDeque size is : "+arr.size());
		//added the element at the beginning 
		arr.addFirst("First Added Name");
		//Added the element at the last
		arr.addLast("The Last Added Name");
		//if contains the same element name as defined true or false
		System.out.println("The ArrayDeque contain the element: " +arr.contains("Vishma"));
	
		//Get the first element
		System.out.println("The element at the beginning of the queue is " +arr.getFirst());
		//Get the last element
		System.out.println("The element at the end of the queue is " +arr.getLast());
		//Print all the element by using for loop
		for(String str:arr) {
			System.out.println(str);
		}
	}

}
