package oops.Inheritance;

public class Person {
	
	protected String name;
	public  Person(String name) {
		// TODO Auto-generated method stub
		this .name = name;
		System.out.println("inside the constructor of person");

	}

	
	
	public void walk(){
		System.out.println( name + "person is walking");
	}
	
	public void eat(){
		System.out.println(name + "person is eating");
	}
		

}
