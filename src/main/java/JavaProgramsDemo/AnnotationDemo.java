package JavaProgramsDemo;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
//To make sure the annotation is available in runtime
@Retention(RetentionPolicy.RUNTIME)
//mentioning the Annotation name
@interface Author{
	//Method of the annotation to access this annotation
	String name();
}
//On this name variable will display the name which was assing to the annotation
@Author (name = "Puspa")

//defin the class
class Person123{
	void Display()
	{
		System.out.println("This is the person class.");
	}
}
public class AnnotationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class<Person123> aclass = Person123.class;
		Annotation annotation = aclass.getAnnotation(Author.class);
		Author myAnnotation = (Author) annotation;
		System.out.println("name: " +myAnnotation.name());
}
}
