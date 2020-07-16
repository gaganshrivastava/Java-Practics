package oops;

import oops.Person_StaticExample.B;
import oops.Person_StaticExample.C;

public class StaticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.PI);

		Person_StaticExample objPerson = new Person_StaticExample();

		// make the objec of nonstatic class.
		B objB = objPerson.new B();

		// we can direct make the object of static class just by importig that
		// class
		C objC = new Person_StaticExample.C();
		C objtC = new C();

	}

	// nested class > as the parent class is not static so we can't create a
	// static varialbe in the nested class or child class.

	// maked the different class.
	/*
	 * class Person{ int age; String name;
	 * 
	 * //static String breedo; }
	 */
	
	
	static {
		System.out.println(" First static block run then main block method");
	}

}
