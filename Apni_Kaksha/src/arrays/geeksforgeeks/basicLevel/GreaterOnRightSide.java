package arrays.geeksforgeeks.basicLevel;

public class GreaterOnRightSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 16, 17, 4, 3, 5, 2 };
		//int a[] = {2 ,3 ,1, 9};

		for (int i = 0; i < a.length -1; i++) {
			int max = a[i + 1];
			for (int j = i + 1; j < a.length; j++) {
				if (max < a[j]) {
					max = a[j];
				}
			}
			a[i] = max;

		}
		a[a.length - 1] = -1;

		for (int x : a) {
			System.out.print(x + " ");
		}
	}

}
