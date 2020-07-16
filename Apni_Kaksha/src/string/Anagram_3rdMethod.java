package string;

public class Anagram_3rdMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 

		String a = "abc#";
		String b = "a#bc";
		
		boolean isAnagram = true;
		
		int al[] = new int[256];
		
		for(char c : a.toCharArray()){
			int index = (int)c;
			al[index]++;
		}
		
		for(char c : b.toCharArray()){
			int index = (int)c;
			al[index]--;
		}
		
		for(int i = 0; i< al.length;i++){
			if(al[i] != 0){
				isAnagram = false;
				break;
			}
		}
		
		if (isAnagram) {
			System.out.println("Yes the given words are Anagrams");
		} else {
			System.out.println("No the givn words are not Angrams");
		}
		
		
	}

}
