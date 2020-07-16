package string;

public class ReplaceVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c = "GeeeksforGeeks - A Computer Science Portal for Geeks";
		
		c = c.replaceAll("[aeiou]", "");
		
		System.out.println(c);
		

	}

}
