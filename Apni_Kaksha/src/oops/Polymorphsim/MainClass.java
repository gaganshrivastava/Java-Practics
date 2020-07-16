package oops.Polymorphsim;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		
		//upcasting
		Pet p = d;
		Animal a = d;
		
	

		// both will refer the dog walk function. as in hte runtime it will check which object refers to.
	//method overridng
		
		p.walk();
		d.walk();
		
		//SO variable s are not overriding only methodsa re overriding
		System.out.println(p.name);
		System.out.println(d.name);
		System.out.println(a.name);
	}

}
