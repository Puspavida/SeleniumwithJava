package JavaProgramsDemo;

class Outer{
	class Inner{
		public int InnerID;
	}
	
	public void DisplayedInner() {
		Inner in = new Inner();
		in.InnerID = 45;
		System.out.println("The value od the ID of the Inner Class is: " +in.InnerID);
	}
}


public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer obj = new Outer();
		obj.DisplayedInner();
	}

}
