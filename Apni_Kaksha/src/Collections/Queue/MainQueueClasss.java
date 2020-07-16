package Collections.Queue;

import java.util.*;
public class MainQueueClasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//implementing queue with the hellp of linked list
		// it can be implement with the hep of Dquueue and priority queue also
		Queue<Integer> q = new LinkedList<Integer>();
		//Queue<Integer> dd = new Queue<Integer>();	
		
		q.add(5);
		q.add(6);
		q.add(62);
		
		System.out.println( "List "+ q);
		
		System.out.println( "Top elemt "+q.element());
		
		System.out.println( "removing the first elemnt " +q.remove());
		
		System.out.println("removing the second elemnt "+q.remove());
		
		System.out.println( "After removing toppest element  "+q.peek());
		System.out.println( "After removing  exception occure "+ q.element());
		
		//// for the my queue class
		
		System.out.println("Self   ");
		
		MyQueue<Integer> mq =new MyQueue<Integer>();
		mq.enqueue(12);
		mq.enqueue(18);
		
		mq.printQueue();
		
		mq.enqueue(20);
		mq.enqueue(22);
		
		mq.printQueue();
		
		System.out.println("Top elemnt " + mq.peek());
		
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println("Top elemnt after removing " + mq.peek());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		
		mq.enqueue(220);
		System.out.println(mq.dequeue());

	}

}
