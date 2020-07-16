package oops.Inheritance;

public class Teacher extends Person {
	
	

	public Teacher(String name) {
		super(name);
		System.out.println("Inside teacher constructor");
		// TODO Auto-generated constructor stub
	}

	public void teach(){
		System.out.println( name + "Teacher is teaching");
	}
	
	//method overriding
	
	public void eat(){
		super.eat(); // calling the parent eat method first then exceute below code.
		System.out.println(name + "teacher  is eating");
	}
	
}
