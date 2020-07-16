package SortingAlgorithims;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 4, 3, 5,0 };
		
		quickSort(a,0,a.length);
		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println();

	}
	
	public static void quickSort(int a[], int start, int end){
		if(end- start <2) // this is when the element is less the 2
			return;
		
		
		int pivot= partision(a, start , end);
		quickSort(a, start, pivot);
		quickSort(a, pivot+1, end);
	}
	

	public static int partision(int a[], int start, int end){
		int pivot = a[start];
		int i = start, j = end;
		
		while(i< j){
			
			while(i<j && a[--j] >= pivot ){
				//do swapping // bringing  j to the position where a[j] is < thn pivot
				}
			
			while(i<j && a[++i] <= pivot ){ // i reaches till the a[i] is greater than pivot
				/*if(i< j){
					a[j] = a[i];
				}
				*/
			}
			
			//swapping
			if(i< j){
				int k = a[i];
				a[i] = a[j];
				a[j] = k;
			}
			
			System.out.println("After every swapping ");			
			for (int x : a) {
				System.out.print(x + " ");
			}
			
			System.out.println();
			
		}
		
		System.out.println("out pivot at " + j);
		//swap the pivot vaue to j position when i  crosss j correct position 
		a[start] = a[j]; 
		a[j] = pivot;
		
		System.out.println("Before return ");			
		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println();
		return j;
	
	}
}
