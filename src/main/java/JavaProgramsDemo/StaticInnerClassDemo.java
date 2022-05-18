package JavaProgramsDemo;

class Outer23{
	static class Inner40{

		static public int innerID;
	}
	
	public void Displayed() {
		Inner40.innerID=78;
		System.out.println("The Value of the ID of the inner class is " +Inner40.innerID);
	}
}
public class StaticInnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer23 obj23 = new Outer23();
		obj23.Displayed();
		Outer23.Inner40.innerID=65;
		System.out.println("The value of the inner id is " +Outer23.Inner40.innerID);
	}

}
