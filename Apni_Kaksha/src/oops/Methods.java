package oops;

public class Methods {

	public static void main(String[] args) {

		System.out.println("First Main");
		
		//can make the call unless the method is static, so created another main method with same parametes
		
		int result = main(5, 6); //method calling
		System.out.println(result);
		
		//we can call directly a static method 
		sayHi();
		
		 result = main(5); //method overloading
		System.out.println(result);
	}

	static int main(int a) {

		System.out.println("Second Main");

		return a;
	}

	static int main(int a, int b) {

		System.out.println("Third Main");

		return a > b ? a : b;
	}
	
	static void sayHi(){
		System.out.println("Hello");
		System.out.println("Good Evening");
	}
}
