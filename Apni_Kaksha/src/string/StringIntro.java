package string;

public class StringIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//insiziation by literals
		//this will be  in string pool area 
		String name = "gagan   ";
		String name2 = "gagan";
		
		//String is a class so it can be inzilatis by new 
		//this will be in heap area, as the objects are stored in heap area
		String aname = new String("gagan");
		
		System.out.println(name == aname); //false
		System.out.println(name == name2); //true
		
		System.out.println(name.charAt(2));
		System.out.println( "Total length = "+ name.length() );
		
		System.out.println(name.substring(2));
		System.out.println(name.substring(2, 4));
		
		System.out.println(name.contains("ga "));
		System.out.println(name.equals(aname));
		System.out.println(name.isEmpty());
		System.out.println(name.concat("Shrives"));
		System.out.println(name + "Shrives");
		
		System.out.println(name.replace('g', 'G'));
		
		String cars = "tata, hyndai, maruti";
		String allcars[]= cars.split(",");
		char c[] = cars.toCharArray();
		for(String a : allcars){
			System.out.println(a);
		}
		
		//System.out.println(name.split("^G"));
	}

}
