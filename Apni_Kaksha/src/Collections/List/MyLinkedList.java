package Collections.List;

public class MyLinkedList {
	Node head;

	// adding a element
	void add(int data) {
		Node toAdd = new Node(data);
		if (head == null) {
			head = toAdd;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next; // this will assgin the last element to the temp
		}
		// temp is the last node
		temp.next = toAdd;
	}

	// printing all elements
	void print() {
		Node temp = head;
		while (temp != null) {

			System.out.println(temp.data);
			temp = temp.next; // this will assgin the last element to the temp
		}
	}

	// getting the value at particular index
	void get(int index) {
		Node temp = head;
		int i = 0;
		while (temp != null) {
			if (i == index) {
				System.out.println(temp.data);
				return;
			} else {
				i++;
				temp = temp.next;
			}

		}
		if (temp == null) {
			System.out.println("Index out of bound Exception OR LIst is empty so Can't get");
		}
	}

	// removeing the element
	void remove(int index) {
		Node temp = head;
		Node peeche = null;
		int i = 0;

		if (index < 0) {
			return;
		}
		while (temp != null) {

			if (index != 0) {
				if (i == index) {
					peeche.next = temp.next;
					return;
				} else {
					i++;
					peeche = temp;
					temp = temp.next;
				}
			} else {
				// if index == 0, then aage the aage vala ka address to the head
				head = temp.next;
				return;
			}

		}

		if (temp == null) {
			System.out.println("Index out of bound OR List is empty so Can't remove");
		}

	}
	
	
	//adding at particular index
	void add(int index, int data){
		Node temp = head;
		Node peeche = null;
		Node toAdd =  new Node(data);
		int i = 0;
		
		while(temp != null){
			
			if(index == 0){
				toAdd.next = head;
				head = toAdd;
				return;
				
			}
			if(i == index){
				toAdd.next = temp;
				peeche.next = toAdd;
				return;
			}else{
				i++;
				peeche = temp;
				temp = temp.next;
			}
			
			
		}
	
	}

	// make one element
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

}
