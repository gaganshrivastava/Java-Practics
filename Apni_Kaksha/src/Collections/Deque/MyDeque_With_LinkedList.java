package Collections.Deque;

public class MyDeque_With_LinkedList<E> {

	// so in the double ended queue as add first , add last , peek first. last
	// all these functions.
	// we can imlement all these functions.
	
	Node<E> head, tail;
	
	public void addTohead(E data){
		Node<E> toAdd = new Node<E>( data);
		
		if(head== null){
			head = tail = toAdd;
			return;
		}
/*		
		//array goes from head to tail :: head is on the left and side and tail is on the right side
		head.prev = toAdd;
		toAdd.next = head;
		head = toAdd;
	
		*/
		
		//by anuj bhiya
		//it goes from right to left::  head is on the right and side and tail is on the left side
		head.next = toAdd;
		toAdd.prev = head;
		head = toAdd;
		
	}
	
	public void print(){
		Node<E> temp= head;
		while(temp != null){
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		System.out.println();
	}
	//remove logic has to be corrected not working properly
	//public void removeLast(){ 
		public E removeLast(){
		if(head == null){
			//return ;
			return null;
		}
	/*	
		if(tail.next == null){
			System.out.print("Removing element is "+tail.data +" " );
			if(tail.prev !=null){ // this is for the first element
				
				tail.prev.next = null; // this will null the next value of previous node.
				tail = tail.prev; // this will moving the pointer of tail to previous node
			
			}else{ //so make both the head and tail == null
				//tail.prev =null;
				//tail = head = null;
			}
			
		}*/
		System.out.println();
		
		
		//by anuj bhiya 
		Node<E> toRemove = tail;
		tail = tail.next; // this will move the tail pointer to the second last element
		tail.prev = null;// this will remove the connection betwween last annd secondlast elemnt
		// now the last elemnt is the second last element of the list
		
		
		if(tail == null){ //this is when there was only one eleemt in the list and when we remove those then head must also be set to null.
			head = null;
		}
		return toRemove.data;

	}
	
	public static class Node<E>{
		E data;
		Node <E> next, prev;
		
		public Node(E data){
			this.data = data;
			this.next = this.prev = null; 
			
		}
	}
}
