package oops.encapsulation;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		//so by making the variable private we can't set the varible with new value
		/*s1.name = "Tom" ;
		s1.age = 56;
		*/
		
		s1.setAge(25);
		s1.setName("Gagan");
		
		System.out.println(s1.getAge());
		

	}

}
