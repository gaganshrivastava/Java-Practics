package oops;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		
		c1.legs = 4;
		c1.eyes = 2;
		//c1.walk();
		//c2.eat();
		c1.description();
		c2.description();
	}

}


//creating cat class
class Cat{
	
	//these are the description
	boolean hasfur;
	String bread ;
	
	int legs, eyes;
	
	//these are the behaviours
	public void walk(){
		System.out.println("Cat can walk");
	}
	
	public void eat(){
		System.out.println("Cat can eating");
	}
	
	public void description(){
		System.out.println(" my cat has " + legs + " and " + eyes);
	}
	
}