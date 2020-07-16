package arrays.geeksforgeeks.basicLevel;

public class Intersection_of_two_arrays {
	// question
	// Given two arrays A and B respectively of size N and M, the task is to
	// print the count of elements in the intersection (or common elements) of
	// the two arrays.

	// For this question, the intersection of two arrays can be defined as the
	// set containing distinct common elements between the two arrays.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 10, 10 ,30,20};
		int b[] = { 10, 10, 10 ,20};
		int c[] = new int[a.length];
		int match[] = new int[a.length];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i] == match[j]){
					break;
				}
				if (a[i] == b[j] & c[j] != -1 ) {
					count++;
					match[i] = a[i];
					c[j] = -1;
					break;
				}

			}

		}

		System.out.println(count);
	}

}
