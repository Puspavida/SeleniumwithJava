package JavaProgramsDemo;

interface interface1{
	public void DisplayInterface1();
}

interface interface2{
	public void DisplayInterface2();
}

class Employee implements interface1,interface2{

	public String frist_name;
	public String last_name;
	@Override
	public void DisplayInterface2() {
		// TODO Auto-generated method stub
	
		System.out.println("The name of the Employee is: " + (this.frist_name+this.last_name));
	}

	@Override
	public void DisplayInterface1() {
		// TODO Auto-generated method stub

		System.out.println("The Employee First Name is : " +this.frist_name);
		System.out.println("THe Employee Last Name is : " +this.last_name);
	}
	
}
public class MultipleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		emp.frist_name="Ramesh";
		emp.last_name="Sourav";
		emp.DisplayInterface1();
		emp.DisplayInterface2();

	}

}
