package Collections.Stack;

//public class MyStack_With_LinkedList<E> {   // to make the class generic , sepecify the genriic within<E >  E is the data type... so that what every we give while declaration we get t this.
public class MyStack_With_LinkedList<E> {

	StacklinkedList<E> ll = new StacklinkedList<E>();

	// have to do,

	void push(E e) {
		ll.add(e);
	}

	E pop() throws Exception {
		if (ll == null) {
			throw new Exception("No element is present");
		}
		return ll.removeLast();
	}

	E peek() throws Exception {
		if (ll == null) {
			throw new Exception("No element is present");
		}
		
		return ll.getLast();
	}

}

/// --------------------------------------------------------------------------------------------------------
// linked list with generics

class StacklinkedList<E> {
	Node<E> head;

	void add(E data) {
		Node<E> toAdd = new Node<E>(data);

		// this is for if the list is empty
		if (head == null) {
			head = toAdd;
			return;
		}
		Node<E> temp = head;
		while (temp.next != null) {
			temp = temp.next; // this will assgin the last element to the temp
		}
		// temp is the last node
		temp.next = toAdd;
	}

	
	public E removeLast() throws Exception {
		Node<E> temp = head;

		if (head == null) {
			throw new Exception("No list is present");
		}

		// this is for just if one element in the list
		if (temp.next == null) {
			Node<E> toRemove = temp;
			head = null;
			return toRemove.data;
		}
		while (temp.next.next != null) { // this wil reach till second last
											// element

			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next = null;

		return toRemove.data;
	}

	
	public E getLast() throws Exception {

		Node<E> temp = head;

		if (head == null) {
			throw new Exception("No list is present");
		}

		// this is for just if one element in the list
		if (temp.next == null) {
			return temp.data;
		}

		while (temp.next != null) { // this wil reach till second last elemnt
			temp = temp.next; // assgin the last elemnt
		}
		return temp.data;
	}

	
	// make one element
	static class Node<E> {
		E data;
		Node<E> next;

		public Node(E data) {
			this.data = data;
			next = null;
		}
	}
}
