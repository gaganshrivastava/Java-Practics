package Heaps;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxHeap heap = new MaxHeap(10);
		
		heap.insert(80);
		heap.insert(75);
		heap.insert(60);
		heap.insert(68);
		heap.insert(55);
		heap.insert(40);
		heap.insert(52);
		heap.insert(99);


		heap.printHeap();
		
		heap.delete(5);
		heap.printHeap();
		
		
		heap.printHeap();
		
		System.out.println(heap.peek());
		
		heap.sort();
				heap.printHeap();
	}

}
