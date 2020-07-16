package Collections.Comparable_Comparators;

public class Student implements Comparable<Student> {

	int marks;
	String name;
	
	
	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	
	@Override
	public String toString(){
		return "Student [ marks = " + marks + ", name = " + name +"]";
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
	/*	if(this.marks > o.marks) return 1;
		else if(this.marks < o.marks) return -1;  // decreasing karna hai toh < vale ko +
		
		return 0;

		// if we want to change the order of sorting then  invert the sign
		 
*/
		//# above code can bee done by single line
	//return this.marks - o.marks;	
	return o.marks - this.marks;
	}
	
}
