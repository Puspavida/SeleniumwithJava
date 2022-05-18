package JavaProgramsDemo;

//Anonymous class define with properties
abstract class A{
	abstract public void Display();
	
}

public class AnnonymousClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		A newA = new A() {
			public int ID = 645;
			public void Display()
			{
				//printing the same properties in this ID
				System.out.println("This is the ID of the given function: " +this.ID);
			}
		};
	
		newA.Display();
	}

}
