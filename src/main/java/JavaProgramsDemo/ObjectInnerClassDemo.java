package JavaProgramsDemo;

class Outer12{
	class Inner20{
		
		public int innerID1;		
	}
	
	public void Displayed() {
		Inner20 in20 = new Inner20();
		in20.innerID1=780;
		System.out.println("The value of the inner class is " +in20.innerID1);
	}
}
public class ObjectInnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer12 objout = new Outer12();
		objout.Displayed();
		Outer12.Inner20 inobj = objout.new Inner20();

		inobj.innerID1 = 897;
		System.out.println("The value of the Inner id is: " +inobj.innerID1);
	}

}
