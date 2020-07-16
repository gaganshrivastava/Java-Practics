package string;

public class Aagram_2ndMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "abc ";
		String b = "abc";
		
		boolean isAnagram = true;
		//256 because total distinct charcters are 256
		//by default al & bl has 0
		int al[] = new int[256];
		int bl[] = new int[256];
		//we are making the count of every char in the string (number of occurecnce)
		for(char c : a.toCharArray()){
			int index = (int)c;
			al[index]++;
		}
		
		for(char c : b.toCharArray()){
			int index = (int)c;
			bl[index]++;
		}
		
		for(int i = 0 ; i < al.length ; i++){
			if(al[i] != bl[i]){
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
