package JavaProgramsDemo;

interface interface3{
	static int i = 100;
	final String name = "Puspa";
	public void Display();
}

interface interface4{
	public void DisplayName();
}

class unemployeed implements interface3,interface4{

	//public String name;
	@Override
	public void DisplayName() {
		// TODO Auto-generated method stub
		
		System.out.println("The person name is: " +this.name);
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub

		System.out.println("The person value is: " +this.i);
	}
	
}

public class InterfaceProperties {
	
	public static void main(String[] args) {

		unemployeed un = new unemployeed();
		/*un.name= "Misti";**/// interfac field we can't assign any value
		//un.i=4; As i is called as final so we can't assign the value to it.
		un.Display();
		un.DisplayName();
	}

}
