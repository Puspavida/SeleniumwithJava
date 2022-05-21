package JavaProgramsDemo;
//enum is special class in which we can define all the constant variable which can't be change only we can access it
//we can access the enum variable by using enum class and will store enum class type variable.
enum Speed{
	Low,
	Medium,
	High,
	Highiest
}
//we can use loop through enum which has value() method. Enum constant are public static and final 
public class EnumsClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Speed speed = Speed.Highiest;
		switch(speed){
		case Low:
			System.out.println("The speed is low.");
			break;
		case Medium:
			System.out.println("The speed is Medium.");
			break;
		case High:
			System.out.println("The speed is High.");
			break;
		case Highiest:
			System.out.println("The speed is Highiest.");
			break;
		}
	}

}
