//Define
package JavaProgramsDemo;

import java.util.*;
class Person120{
	public String Name;
}

public class ArrayListClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList alist = new ArrayList();

		Person per1 = new Person();
		per1.name= "Rama";
		Person per2 = new Person();
		per2.name="Niyas";
		alist.add(per1);
		alist.add(per2);
		
		System.out.println("The First Person name is : " +((Person)alist.get(0)).name);
		System.out.println("The second person name is : " +((Person)alist.get(1)).name);
		
		

	}

}
