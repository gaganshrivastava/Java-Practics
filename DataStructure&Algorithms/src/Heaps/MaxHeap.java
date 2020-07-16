package Heaps;

public class MaxHeap {

	private int[] heap;
	private int size;
	
	public MaxHeap(int capacity) {
		heap = new int[capacity]; // this is to chnage the  array length
	}
	
	
	public void insert(int value){
		if(isFull()){
			throw new IndexOutOfBoundsException("Hep is full");
		}
		
		heap[size] = value; // firrst assgining then incrementing the index.
		
		fixHeapAbove(size); // after every insertion we have to fix the  heap
		size++;
		
	}
	
	
	public int delete(int index){
		if(isEmpty()){
			throw new IndexOutOfBoundsException("Heap is empty");
		}
		
		int deletingValue = heap[index];
		int parentValue = getParaent(index);
		
		// we always replce the deleteing index with the left(if rightchild in last level is not present) most value of the of the last level of heap to maintain the heap structure.
		
		heap[index] = heap[size-1]; // always the last elemt of the heap
		
		if(index == 0 || heap[index] < heap[parentValue]){// upar vala pareent bada hai eeche vala fix karo
			fixHeapBelow(index, size-1);
		}else{
			fixHeapAbove(index);
		}
		
		size --;
		return deletingValue;
	}
	
	public void fixHeapAbove(int index){
		int newValue = heap[index];
		while(index > 0 &&  newValue > heap[getParaent(index)]){ // if the nw value is gretaer then its parent then we are swapping
			heap[index] =  heap[getParaent(index)]; // putting the parent value to new position 
			index = getParaent(index);// assgining the new index position so that the new value will search more upward
		}
		heap[index] = newValue;
		
	}
	
	private void fixHeapBelow(int index, int lastHeapIndex){
		int childToSwap;
		while(index <= lastHeapIndex){
			int leftChild = getChild(index, true);  //index of left and right child
			int rightChild = getChild(index, false);
			if(leftChild  <= lastHeapIndex) {
				// it means it has a left child
				if(rightChild > lastHeapIndex){
					childToSwap = leftChild;
				}else{
					// node also have a right child
					childToSwap = heap[leftChild] > heap[rightChild] ? leftChild : rightChild; // assign the bif=gger value postion
				}
				
				if(heap[index] <heap[childToSwap]){
					// now swap
					int tmp = heap[index];
					heap[index] = heap[childToSwap];
					heap[childToSwap] = tmp;
				}else{
					// no need to swap
					break;
				}
				
				index = childToSwap;
			}else{
				// don't have any left child ,, no heap
				break;
			}
			
		}
	}
	
	
	
	// printing the heap
	public void printHeap(){
		for(int i = 0 ; i < size ; i++){
			System.out.print(heap[i] + " ");
			}
		System.out.println();
	}
	
	
	public int peek(){
		if(isEmpty()){
			throw new NullPointerException();
		}
			
			return heap[0];
	}
	
	
	//heap sort // it a o(nlogn) //
	// after sorting the heap will no longer be a heap
	public void sort(){
		int lastIndex = size -1;
		for(int i = 0 ; i < lastIndex;i++){
			int tmp = heap[0];
			heap[0] = heap[lastIndex - i];
			heap[lastIndex - i] = tmp;
			
			fixHeapBelow(0, lastIndex -i -1); // 1 becase we want to excelude the root value postion
		}
	}
	
	public boolean isFull(){
		return size == heap.length;
	}
	
	//return the index oft he parent
	public int getParaent(int index){
		return (index - 1) / 2;
	}
	
	//return the index of the child
	public int getChild(int index, boolean left){
		return index*2 + ((left) ? 1 :2 ); // 2 *i +1 for left  or 2*i + 2 for right
	}
	public boolean isEmpty(){
		return size == 0;
	}
}
