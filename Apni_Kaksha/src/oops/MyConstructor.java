package oops;

public class MyConstructor {

	//no argument constructor
	public MyConstructor() {
		// TODO Auto-generated constructor stub
		System.out.println("Object is created");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyConstructor obj1 = new MyConstructor();
		Vehicle v1 = new Vehicle();
		
		//v1.wheels = 4;
		System.out.println("Wheels =" + v1.wheels); 
		System.out.println("Color =" + v1.color); 
		
		Vehicle v2 = new Vehicle(5);
		System.out.println("Wheels of v2= " + v2.wheels);
		
		
		//can't call the default constructor now, if we want then we have to make the default constructor
		//Vehicle v2 = new Vehicle();

	}

}

class Vehicle{
	int wheels;
	 
	String color;
	
	
	//intizle the properties , changing the defalut value to 4 from 0
	public Vehicle() {
		// TODO Auto-generated constructor stub
		wheels = 4;
		
	}
	
	
	//Parameterize constructor
	public Vehicle( float nuOfVehcile) {
		// TODO Auto-generated constructor stub
		wheels = (int)nuOfVehcile;
		
	}
	
	public Vehicle( int wheels) {
		// TODO Auto-generated constructor stub
		this.wheels = wheels;
		
	}
}
