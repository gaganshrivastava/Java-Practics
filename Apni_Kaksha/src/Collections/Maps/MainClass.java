package Collections.Maps;


import java.util.*;
import java.util.Map.Entry;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> ma = new HashMap<String, Integer>();
		//entry<String,Integer>
		
		ma.put("one", 1);
		ma.put("two", 2);
		ma.put("three", 3);
		
		System.out.println(ma);
		ma.put("three", 33); // update the value
		System.out.println(ma);
		
		ma.putIfAbsent("one", 10);
		System.out.println(ma); //so won't be  update because one key is alredy present
		
		System.out.println("value at key two = " + ma.get("two"));
		
		System.out.println("key = four exist :- " + ma.containsKey("four"));
		System.out.println("Value = 6 exist :- " + ma.containsValue(6));
		
		ma.replace("one", 60);
		System.out.println(ma);
		
		ma.replace("one", 60, 10);
		System.out.println(ma);
		
		ma.remove("two", 6);
		System.out.println(ma);
		
		System.out.println("all the keys are :: "+ma.keySet());
		System.out.println("all the values are :: "+ma.values());
		System.out.println("all the entrys (combination of key, value) are :: "+ ma.entrySet());
		
	// to iterate for every element
		Set<Entry<String,Integer>> entries = ma.entrySet();
		
		System.out.println("Keys are");
		for(Entry<String,Integer> x : entries ){
			System.out.println(x.getKey());
		}
		
		System.out.println("values are");
		for(Entry<String,Integer> x : ma.entrySet() ){
			x.setValue(x.getValue() *10);
			System.out.println(x.getValue());
		}
		
		
		////////////////////////////////////////////////////////////
		//getting the ascii value for the Haash Function 
		
		String a[] = {"CAT", "DOG", "FUN"};
		
		for(int i = 0 ; i < a.length ; i++){
			System.out.println("Ascii = " + getHashAscii(a[i]));
		}
		
		
	}
	
	public static int getHashAscii(String s){
		int ascii = 0;
		
		for(int i = 0 ; i< s.length();i++){
			ascii += s.charAt(i);
		}
		
		return ascii;
	}

}
