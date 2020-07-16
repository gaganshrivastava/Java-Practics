package arrays.geeksforgeeks.basicLevel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class K_Largest_element {

	// to find 3 largest elements in given aaray
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 5, 6, 8, 2, 3, 7, 15, 25, 45, 69, 85, 20, 66, 96 };

		int MaxNumbers = 3;

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < MaxNumbers; i++) {
			pq.add(a[i]);
		}

		System.out.println(pq);
		System.out.println(pq.peek());
		for (int i = MaxNumbers; i < a.length; i++) {
			if (a[i] > pq.peek()) {
				pq.remove();
				pq.add(a[i]);
			}
			
			System.out.println(pq);
		}
		System.out.println(pq);

		// for decreasing order
		ArrayList<Integer> al = new ArrayList<>(pq); // by this we can add queue into list
		Collections.sort(al, Collections.reverseOrder());  // by this we can revers the order... reverseOrder is the comparater
		
		System.out.println(al);
		
	}

}
