//How to use properties interface
package JavaProgramsDemo;

interface TotalMarks{
	public void calculate();
}

interface PropertiesDemo extends TotalMarks{
	public void Display();
}

class PropertiesDemo1 implements PropertiesDemo{

	public String Name;
	public int mark1;
	public int mark2;
	public int sum;
	
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
			sum = this.mark1+this.mark2;	
			System.out.println("The Student Total mark is: " +this.sum);
			
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub

		System.out.println("The Student name is: " +this.Name);
	
	}
	
	
}


public class PropertiesInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PropertiesDemo1 prop = new PropertiesDemo1();
		prop.Name = "Srujal";
		prop.mark1 = 150;
		prop.mark2= 200;
		prop.Display();
		prop.calculate();
		
	}

}
