package Recursion;

public class PermutationOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		permutation("abc", 0, 2);
	}
	
	static void permutation(String s, int left, int right){
		if(left == right){
			System.out.println(s);
			return;
		}
		for(int i= left; i<= right ; i++){
			s= interchangeChar(s,left, right);
			permutation(s, left+1, right);
			s= interchangeChar(s, left, right);
		}
	}
	
	static String interchangeChar(String s, int a, int b){
		char array[] = s.toCharArray();
		char temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		return String.valueOf(array);
		
	}

}
