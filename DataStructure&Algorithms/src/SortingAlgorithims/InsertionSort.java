package SortingAlgorithims;

public class InsertionSort {

	static int step = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//insertion sort is good for short nummbers, its is also a stable sort, and better version of bubble sort
		int a[] = { 9, 8, 5, 4,1, 3, 2, 1 };
		int n = a.length;
		
		//In this we assume that 0th elemetn is the smallest elemet so we starttt the loop through first element and compare all the left element from that position.
		// and we shift the larger element to the right
		
		for (int i = 1; i < n; i++) { // this loop will travese th array from first position till the end
			int temp = a[i];
			int index = 0;
			boolean flag = false;

			for (int j = i - 1; j >= 0; j--) { //this will comapre each element to the left of ith element and replace if left element is greater then ith element 
				step++;
				if (a[j] > temp) {
					flag = true;
					index = j; // this will give the position whre we have to put the smallest element
					a[j + 1] = a[j]; // after every loop one right shift of the position will take place
				} else {
					continue;
				}
			}
			if (flag)
				a[index] = temp;
		}

		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("Steps = " + step);
		/*for (int x : InserSort(a)) {
			System.out.print(x + " ");
		}*/

	}

	public static int[] InserSort(int a[]) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			int temp = a[i];
			int index = -1;
			for (int j = i; j >= 0 && a[j - 1] > temp; j--) {
				index = j - 1;
				a[j] = a[j - 1];
			}
			if (index != -1)
				a[index] = temp;
		}

		return a;
	}

}
