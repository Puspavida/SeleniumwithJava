package JavaProgramsDemo;

interface DisplayInterface{
	public void Display();
}
public class AnonymousInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DisplayInterface display = new DisplayInterface() {

			@Override
			public void Display() {
				// TODO Auto-generated method stub
				System.out.println("This is the Display method.");
			}
			
		};
		
		display.Display();
		
	}

}
