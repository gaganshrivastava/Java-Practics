package string;

public class ReverseAword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "gagaa";
		a = a.trim();
		String words[] = a.split(" "); 

		//this will just reverse the string
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i].trim());
			System.out.print(" ");

		}
		
		//this will remove the extra spaces in betwen the words
		System.out.println();
		System.out.println(reverseString("the "));
		

	}
	
	//better explanination
	//https://www.youtube.com/watch?v=tNNJWsVo748&list=PLKKfKV1b9e8ps6dD3QA5KFfHdiWj9cB1s&index=27
	static public String reverseString(String s){
		String ans = "";
		int i = s.length()-1;
		
		while(i>=0){
			
			//to removve the spaces from last and i reaches at the last char of the word
			while(i>=0 && s.charAt(i) == ' ') {
				i--;
			}
			
			//to escape  the spaces at the starting
			if(i<0)break;
			// both i and j reach at the last char of the line
			int j = i;
			
			//now i reach till the end of first word
			while(i>=0 && s.charAt(i) != ' '){
				i--;
			}
			
			//this will combine the last word of the line to first word of the ans string
		//	ans.concat(s.substring(i+1, j+1));
			//+1 is used to reach  at the excat char
			
			if(ans.isEmpty()){
				ans = ans.concat(s.substring(i+1, j+1)); // this is for just first word
			}else{
				ans = ans.concat(" " + s.substring(i+1, j+1)); //this will sepaerate the words by sinngle spaces
			}
			
				
		}
		
		
		return ans;
	}

}
