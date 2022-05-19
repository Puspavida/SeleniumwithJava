//How to list files in a directory
package JavaProgramsDemo;

import java.io.File;
public class ListingDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//local file folder path
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\File");
	
		//It will take a list that is  in a folder how many files are present  and saved in variable which is string type
		String filename[] = f.list();
		//It will go through each list by using for loop and print the file name
		for(String fil:filename) {
			System.out.println(fil);
		}
	}
	

}
