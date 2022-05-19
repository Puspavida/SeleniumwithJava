//use of Interface
package JavaProgramsDemo;

interface InterfaceDemo {

	public void DisplayInterfaceMethod();
}

class Person implements InterfaceDemo{
	String name = "Interface";
	@Override
	public void DisplayInterfaceMethod() {
		// TODO Auto-generated method stub
	
		
		System.out.println("This is interface methods." +this.name);
	}
	
}
