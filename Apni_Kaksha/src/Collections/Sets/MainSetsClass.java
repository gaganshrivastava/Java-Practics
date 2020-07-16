package Collections.Sets;

import java.util.*;

public class MainSetsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Set<String> s = new HashSet<>();
		s.add("babnana");
		s.add("apple");
		System.out.println(s.add("carrot"));
		System.out.println(s.add("carrot")); // no duplicate elements

		//output will come in the sorted order most of the case or it get randommly
		System.out.println(s);

		// to get he output in the same order we put use linked haset
		Set<String> sl = new LinkedHashSet<>();
		sl.add("babnana");
		sl.add("apple");
		System.out.println(sl.add("carrot"));
		System.out.println(sl.add("carrot")); // no duplicate elements

		System.out.println(sl);

		// to get he output in the sort order use tree set
		Set<String> st = new TreeSet<>();
		st.add("babnana");
		st.add("apple");
		System.out.println(st.add("carrot"));
		System.out.println(st.add("carrot")); // no duplicate elements

		System.out.println(st);

		// operations of Sets.. differnet methods

		Set<Integer> si = new HashSet<>();

		si.add(12);
		si.add(11);
		si.add(65);

		Set<Integer> si2 = new HashSet<>();

		si2.add(2);
		si2.add(11);
		si2.add(66);
		
		si.addAll(si2); // add all the elemtn those are not present in si.  (union operation)
		//output wil be in random order
		System.out.println(si);
		
		si.retainAll(si2); // intersection >> common in both ... remove all those values from si which are not present in si2. or it will be all those value which are in si2.
		System.out.println(si);
		
	
		System.out.println(si.containsAll( si2));
		
		
		System.out.println("Set example");
		
		Set<Integer> myset = new HashSet<>();
		myset.add(2);
		myset.add(4);
		myset.add(1);
		
		System.out.println(myset);
		
		
		
	}

}
