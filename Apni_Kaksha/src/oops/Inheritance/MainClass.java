package oops.Inheritance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Teacher t = new Teacher("xx");
		t.name = "Gagan ";
		t.eat();
		t.walk();
		t.teach();
		
		System.out.println();
		Singer s = new Singer("ROhn");
		s.name = "ROhn ";
		s.eat(); //overridde the eat method of person class
		s.walk();
		s.singers();
		/*	
		//Upcating
		Teacher t1 = new Teacher();
		Person p = t1;
		
		//downcasting
		Teacher t4 = new Teacher();
		
		Singer  s2 = new Singer();
		Person p3 = s2;
		Person p2 = t4;
		//Teacher t2 =  p2; >> person explicity teacher nhi ho sakta... we have to tell that a  person is a teacher. 
		
		Teacher t2 = (Teacher) p2; // by alone this it will giv error in the run time.
		//to remove the error go to line 26 then run 
			
		//Teacher t3 = (Teacher) p3;
		
		//to check the correct instance use::  return true or false.
		boolean yup = p3 instanceof Teacher;
		System.out.println(yup);*/
		
		
		//use of super keyword
	//	Teacher t = new Teacher("Gagan ");
		t.eat();
		/*t.walk();
		t.teach();*/

	}

}
