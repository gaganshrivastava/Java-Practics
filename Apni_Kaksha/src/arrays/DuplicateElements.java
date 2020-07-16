package arrays;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 1, 2, 1, 2, 5, 1, 5, 8 };

		int freq[] = new int[a.length];

		int visited = -1;

		for (int i = 0; i < a.length; i++) {
			int count = 1;
			if (freq[i] != visited) {
				for (int j = i + 1; j < a.length; j++) {

					if (a[i] == a[j]) {
						count++;
						freq[j] = visited;
					}
				}
			}

			if (freq[i] != visited) {
				freq[i] = count;

			}
		}

		System.out.println("Duplicate elemts are ");

		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 1) {
				System.out.println(a[i]);
			}
		}

	}

}
