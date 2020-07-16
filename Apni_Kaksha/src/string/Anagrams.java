package string;

//A set of characters can form a palindrome if at most one character occurs odd number of times and all characters occur even number of times.
//link :: https://www.geeksforgeeks.org/check-characters-given-string-can-rearranged-form-palindrome/
public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Anagrams are those which have the same number of character and repaeat the same number of times.
		String a = "geeksogeeks";
		String b = "geeksoskeeg";
		
		//System.out.println('a' == 'A');
		
/*		a = a.toLowerCase();
		b= b.toLowerCase();*/

		boolean isAnagram = false;
		boolean visited[] = new boolean[a.length()];
		
		if (a.length() == b.length()) {
			//every char of first string must be present in second string
			for (int i = 0; i < a.length(); i++) {
				char e = a.charAt(i);
				isAnagram = false; // matches till the last char, because oncee the anagram is true it  will remain true for the further coming chars 
				for (int j = 0; j < b.length(); j++) {
					if ((b.charAt(j) == e) && (!visited[j])) {
						visited[j] = true;
						isAnagram = true;
						break;
					}
				}
				if (!isAnagram) {
					break;
				}
			}
			
			
			//every char of Second string must be present in first string
/*			for (int i = 0; i < b.length(); i++) {
				char e = b.charAt(i);
				isAnagram = false; // matches till the last char, because oncee the anagram is true it  will remain true for the further coming chars 
				for (int j = 0; j < a.length(); j++) {
					if (a.charAt(j) == e) {
						isAnagram = true;
						break;
					}
				}
				//if any char doen't match then break , not a anagram
				if (!isAnagram) {
					break;
				}
			}*/
			
		}

		if (isAnagram) {
			System.out.println("Yes the given words are Anagrams");
		} else {
			System.out.println("No the givn words are not Angrams");
		}
		
		
		
		
		
		
		
		
	}

}
