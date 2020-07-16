package Collections.List;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class MyFirstArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//without generics
		ArrayList general = new ArrayList();
		general.add("Banana");
		general.add(23);
		
		System.out.println(general);
		
		//with generics
				ArrayList<String> fruits = new ArrayList<>();
				fruits.add("Banana");
				fruits.add("apple");
				fruits.add("orange");
				fruits.add("orange");
				//fruits.add(23);
				
				System.out.println(fruits);
				
				
				
		//making the pairs of different data type(generics)
				// we have to write the full Integer not the int because int doesn't  extends the object class. while Integer extends the object class.  
			Pairs<String, Integer> p1 = new Pairs("Gagan" , 3);  
			
			Pairs<Boolean, Integer> p2 = new Pairs(true , 33); 
			
			p1.show();
			p2.show();
			
			// simalry we can make the linked ist
			List<String> name = new LinkedList<>();
			
			
			//Methods in ArrayList
			
			 List<String> vegitable = new ArrayList();
			 vegitable.add("gobi");
			 
			 vegitable.addAll(fruits);
			 System.out.println("List of vegitable and fruits  is " + vegitable);
			 
			 System.out.println("First index value  of vegetible is " + vegitable.get(1));
			 
			 //as set will set the exist value oly , it update the current vlue
			 vegitable.set(0, "mutter");
			 System.out.println("Updated vegetable " + vegitable);
			 
			 //removeing the elements
			 vegitable.remove(1);
			 System.out.println(" vegetable after Removing the fruits part" + vegitable);
			 
			 //remove all and clear both are same, clear is much faster
			 List<String> toremove = new ArrayList<>();
			 toremove.add("apple");
			 toremove.add("orange");
			 
			 
			 //for the size
			 System.out.println("Size of the fuilts list is "+ fruits.size());
			 
			 fruits.removeAll(toremove);
			 System.out.println("Fruits after moving multiple values " + fruits);
			 
			 fruits.clear();
			 System.out.println("Fruits after clering all values " + fruits);
			 
			 System.out.println("Size of the fuilts list is "+ fruits.size());
			 
			 //conatin() :: return true or false
			 System.out.println(fruits.contains("app"));
			 
			 //isempty() return true or false
			 System.out.println(fruits.isEmpty());
			 
			 //converting into array
			 fruits.toArray(); //this will make the array of Object class
			 
			 // to make the array of particlaue same data ype then
			 String toArray[] = new String[vegitable.size()];
			 vegitable.toArray(toArray);
			 
			 System.out.println("Arrays of vegistable are :: ");
			 for(String x : toArray){
				 System.out.print(x + " ");
			 }
			 System.out.println();
			 System.out.println("Using Iterator method");
			 Iterator it = vegitable.iterator();
			 while(it.hasNext()){
				 System.out.println(it.next());
			 }
			 
			 
			 ////////////////////////////////////////////
			 //making the object of student class
			 Student s1 = new Student("Gagan", 23);
			 Student s2 = new Student("Rohan", 26);
			 
			 List<Student> obj = new ArrayList<>();
			 obj.add(s1);
			 obj.add(s2);
			 System.out.println( "Age "+obj.get(0).age);
			 //obj(0) hold the address of s1, in that s1 there are two value 
			 //obj(1) hold the address of s2
			 
			 System.out.println( "Address of object of students : " + obj);
			 System.out.println("Stuent list");
			 System.out.println();
			 for(Student s : obj){
				 System.out.print(s.age + " " + s.name);
				 System.out.println();
			 }
			 
	}

}
