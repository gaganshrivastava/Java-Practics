package Collections.Queue;

import Collections.Queue.Queue_linkedlist.Node;

public class MyQueue<E> {

	Node<E> head, rare;

	// for pushing (adding )
	public void enqueue(E e) {
		Node<E> toAdd = new Node<E>(e);

		// when list is empty and first element is adding
		if (head == null) {
			head = rare = toAdd; // both the head and rare are pointing to first
									// elemt
			return;
		}

		rare.next = toAdd; // assgin the address of new node to the current last
							// elemnt (next/ address part)
		rare = toAdd; // moving the rare node to the last node of the list.
	}

	// for removing (popping )
	public E dequeue() {

		Node<E> temp = head; //step 1

		if (head == null) {
			return null;
		}
		
		//step 2
		// mooving the head to next position
		head = head.next;

		if (head == null) { // this is for, if there is only one element in the
							// list and
			rare = null; // after removing head move forward and rare still
							// remain in the old positoon and peeche ho jayega
							// head sai.. so rare ko bhi null karo
		}
		
		//step 3
		return temp.data; // returning the original head data

	}

	// for geeting the top element (peek )
		public E peek() {
			
			if (head == null) {
				return null;
			}
			return head.data; // returning the original head data

		}
	
	
	public void printQueue() {

		// printing all elements
		Node<E> temp = head;
		System.out.print("[");
		while (temp != null) {
			System.out.print(temp.data +", " );
			temp = temp.next; // this will assgin the last element to the temp
		}
		System.out.print("]");
		System.out.println();
	}
}

class Queue_linkedlist<E> {

	// make one node
	static class Node<E> {
		E data;
		Node<E> next;

		public Node(E data) {
			this.data = data;
			next = null;
		}
	}
}
