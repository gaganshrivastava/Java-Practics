package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {5,3,1,4,2,9};
		int n = a.length;
		
		//this is outer loop for number of iteration
		for(int i = 0; i<n-1 ; i++){
			
			int minIndex= i;
			//inner loop for indexing find
			for(int j = i ; j< n ; j++){
				if(a[j] < a[minIndex]){
					minIndex = j;
				}
			}
			
			//swap with the minnum index vaalue
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
			
		}
		
		for(int e: a){
			System.out.print(e + " ");
		}
	}

}
