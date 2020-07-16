package Collections;
import java.util.*;
public class GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ml = new LinkedList<String>();
		String s[] = {"cat", "tat", "bat","tab","rat","tar","owll"};
		//ml.(groupAnagrams(s));
		
		//output
		//[[tat], 
		//[bat, tab], 
		//[rat, tar],
		//[cat], [owll]]
		
		System.out.println(groupAnagrams(s));
		
		

	}
	
	public  static List<List<String>> groupAnagrams(String[] strs){
		//<first string is for the key , second string is the different values combination of those key character)>
				Map<String, List<String>> map = new HashMap<>();
				
				for(String x: strs){
					char charArray[]= x.toCharArray(); // string is converted to  char array to sort
					Arrays.sort(charArray); // then char array is again converted to String after sorting
					
					String sorted = new String(charArray);
					
					if(!map.containsKey(sorted)){
						map.put(sorted, new LinkedList<String>());
					}
					map.get(sorted).add(x) ; 
				}
				
				System.out.println(map);
				
			return new LinkedList<>( map.values());
	}

}
