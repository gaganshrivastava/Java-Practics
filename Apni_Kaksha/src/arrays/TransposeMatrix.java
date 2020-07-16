package arrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 1, 2 }, { 3, 4 } };

		int b[][] = new int[a[0].length][a.length];

		System.out.println("Original Matrix is: ");

		for (int x[] : a) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < a.length; i++) { // rows
			for (int k = 0; k < a[0].length; k++) {
				b[k][i] = a[i][k];
				//col wise == rows wise
			}

		}

		System.out.println("Transpose Matrix is: ");
		for (int x[] : b) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}

	}

}
