package Collections.Maps;

import java.util.HashSet;
import java.util.Set;

public class HashCodeAndEuals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pen p1 = new Pen(10, "red");
		Pen p2 = new Pen(10, "red");
		
		System.out.println(p1 == p2);
		
		System.out.println(p1.equals(p2)); 
		//this above case since the address is different so it return false
		// we can override the equal method since both the pen are equal 
		
		//Now after overrideing it check the value instea d of obj address
		
		//Now we are making Set of pens
		Set<Pen> myset = new HashSet<>();
		
		myset.add(p1);
		myset.add(p2);
		
		//so both the address values will be inserted in the set though the values are same.
		System.out.println(myset);
		
		// So when ever we are overideing the equals methods of Objec class we have to override the hashCode method also.
		// after overriding the hash code also there will be only one address with the same ascii value 
		
	}

}

class Pen{
	int price;
	String color;
	
	public Pen(int price, String color) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.color = color;
	}
	
	@Override
	public boolean equals(Object obj){
		Pen that = (Pen) obj;
			boolean isEqual = this.price == that.price && this.color.equals(that.color);
		
			return isEqual;
	}
	
	@Override
	public int hashCode(){
		return price + color.hashCode();  // string also implement both the hashcode and equals methoods 
	}
}