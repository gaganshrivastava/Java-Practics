package Collections.Deque;

import java.util.*;

public class DequeMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<Integer> deque = new LinkedList<>();
		ArrayDeque<Integer> ad = new ArrayDeque<>();

		// methods of array Deque
		ad.addFirst(25);
		ad.addLast(15);

		System.out.println(ad);
		ad.pop();
		System.out.println(ad);

		// methods of Stack
		ad.push(36);
		ad.push(410);

		System.out.println(ad);
		System.out.println("Peek = " + ad.peek());

		ad.pop();
		System.out.println(ad);
		ad.pop();
		System.out.println(ad);
		////////////////////////// --------------------------------------
		System.out.println();
		System.out.println();
		System.out.println("With my Deuque class");
		// with the Mydeque class
		MyDeque_With_LinkedList<Integer> md = new MyDeque_With_LinkedList<Integer>();

		md.addTohead(25);
		md.print();
		System.out.println(md.removeLast());
		md.print();
		
		

	}

}
