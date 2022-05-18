package JavaProgramsDemo;

abstract class demo{
	abstract public void Display();
}

public class AnonymousDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Anonymous classes structure Demo
		demo d = new demo() {
			public void Display() {
				System.out.println("This is displayed method.");
			}
		};

		d.Display();
	}

}
