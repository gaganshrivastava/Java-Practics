package Collections.PriorityQueue;

import java.util.*;
public class MainPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("gagan");
		pq.add("kevin");
		
		pq.add("apple");
		
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
		PriorityQueue<Integer> piq = new PriorityQueue<>();
		piq.add(5);
		piq.add(2);
		piq.add(8);
		piq.add(1);
		System.out.println(piq);
		System.out.println(piq.remove());
		System.out.println(piq.remove());
		System.out.println(piq.remove());
	}
	

}
