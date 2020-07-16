package Collections.Comparable_Comparators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> ls = new ArrayList<Student>();
		ls.add(new Student(25, "kumar"));
		ls.add(new Student(23, "gagan"));
		ls.add(new Student(24, "mshra"));
		
		ls.add(new Student(63, "rohan"));
		
		
		//this will call the toString function and return the each value of the object
		 ls.forEach(System.out:: println);
		 
		// and when we implements the comparable interface and override the Compare TO method and do the operation on the bassic of marks then we got the sorted list.
		 Collections.sort(ls);
		 System.out.println("After Sorting ");
		 ls.forEach(System.out:: println);
		
	}

}

class SortByNameThenMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.name.equals(o2.name)){
			return o1.marks - o2.marks;
		}else{
			return o1.name.compareTo(o2.name);
		}
		
		
	}
	 
}
