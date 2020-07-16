package oops.myPacakages.models;

public class Student {

	//i can't be accessed outside this classs
	private String 	name ;
	
	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		
	}
	public String  myfunction() {
		return name;
	}
	
	private String password() {
		return "acs@23";
	}
	
	 String passwrd() {
		return "acs@23";
	}
}
