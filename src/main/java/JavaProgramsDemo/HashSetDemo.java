package JavaProgramsDemo;

import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//It will store the data in sequentially and we can use Iterator in order to go through each elements
		HashSet st = new HashSet();
		st.add(5);
		st.add(4);
		st.add(8);
		st.add(9);
		System.out.println(st);
		Iterator it = st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		HashSet strhash = new HashSet();
		strhash.add("Lima");
		strhash.add("Soumya");
		strhash.add("Ankur");
		System.out.println(strhash);
		System.out.println("The size of the HashSet: " +strhash.size());
		Iterator it1 = strhash.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
			}
		}
	}


