package arrays.geeksforgeeks.basicLevel;

public class ZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a[] = { 4, 3, 7, 8, 6, 2, 1 };
		int a[] ={1,4,3,2};
		
		int n = a.length;
		for (int o = 1, e = 0; o < n && e < n; o += 2, e += 2) {
			if (a[e] > a[o]) {
				int temp = a[o];
				a[o] = a[e];
				a[e] = temp;
			}
		}
		for (int o = 1, e = 2; o < n && e < n; o += 2, e += 2) {
			if (a[e] > a[o]) {
				int temp = a[o];
				a[o] = a[e];
				a[e] = temp;
			}
		}

		
		for (int x : a) {
			System.out.print(x + " ");
		}
	}

}
