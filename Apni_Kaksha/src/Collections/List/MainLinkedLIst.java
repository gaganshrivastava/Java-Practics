package Collections.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainLinkedLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ll = new LinkedList<>();

		List<Integer> al = new ArrayList<>();
		ll.add(0);
		ll.add(1);
		ll.add(2);
		Collections.reverse(ll);
		System.out.println(ll);
		/*
		 * System.out.println(ll); System.out.println(ll.get(2));
		 */

		
		 findTimediff(ll); findTimediff(al);
		 

		// add my my linked list
		MyLinkedList my = new MyLinkedList();
		my.add(5);
		my.add(6);
		my.add(9);

		
		System.out.println("Before removing");
		my.print();

		System.out.print("Elemtns is ");
		my.get(0);

		my.remove(2);

		System.out.println("After removing");
		my.print();
		
		System.out.println("Adding at particlaur index");
		my.add(0, 25);

		System.out.println("after adding");
		my.print();
	}

	static void findTimediff(List<Integer> list) {

		long stime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			list.add(i);
			list.add(0, i);

		}
		long etime = System.currentTimeMillis();

		System.out.println(list.getClass().getName() + " = " + (etime - stime));
	}

}
