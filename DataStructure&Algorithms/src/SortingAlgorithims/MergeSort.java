package SortingAlgorithims;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {3,2,4,1};
		int l = 0, h = a.length ;
		
		mergeSort(a, l, h);
		
		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println();

	}

	public static void mergeSort(int a[], int l, int h) {

		if (h-l <2) { // it must have atlest 2 element
			return;
		}
		
		int mid = (l + h) / 2;
		mergeSort(a, l, mid); // for the left side
		mergeSort(a, mid , h); // for the right side
		mergeMe(a, l, mid, h); // // combine the two list
		

	}

	public static void mergeMe(int a[], int l, int mid, int h) {

		if (a[mid-1] <= a[mid ]) { // this we last lemetn of first array is less then first lement of second arrray  then both the array is alredy sorted
			return;
		}
		
		int i = l, j = mid;
		int temp[] = new int[h-l];
		int index = 0;
		
		while(i < mid && j < h){
			if(a[i] < a[j]){
				temp[index] = a[i];
				index ++;
				i++;
			}else{
				temp[index] = a[j];
				index ++;
				j++;
			}
		}
		
/*		while(i< mid){
			temp[index] = a[i];
			index++;
			i++;
		}
		
		while(j< h){
			temp[index] = a[i];
			index++;
			j++;
		}*/

	 	System.arraycopy(a,i, a, index+l, mid-i ); // we are copying the rest of the values into the  original array
		System.arraycopy(temp, 0, a, l, index); // e are copying the temp sort array to original array
	/*	for(int k = 0; k<a.length; k++){
			a[k] = temp[k];
		}*/
	}
}
