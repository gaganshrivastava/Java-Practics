package oops.Inheritance;

public class Singer extends Person {

	
	public Singer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void singers(){
		System.out.println( name + "Singer  is singing");
	}
	
	//method overridng
	public void eat(){
		System.out.println(name + "Singer   is eating");
	}
}
