package SortingAlgorithims;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {4,20,15,2,-2,66,4};
		int n = a.length;
		
		for(int i = 0; i < n-1; i++){
			int minIndex = i;
			for(int j = i+1; j< n; j++){
				if(a[j] < a[minIndex]){
					minIndex = j;
				}
			}
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
		
		for(int x : a){
			System.out.print(x + " ");
		}
	}

}
