package string.GeeksForGeeks;

public class Binary_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "1111";
		int count = 0;

		for (int i = 0; i < a.length() - 1; i++) {
			if (a.charAt(i) == '1') {
				for (int j = i + 1; j < a.length(); j++) {
					if (a.charAt(j) == '1') {
						System.out.println(a.substring(i, j+1));
						count++;
					}
				}
			}

		}
		
		System.out.println(count);

	}

}
