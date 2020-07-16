package string;

public class ChangetheCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//question
		//Given a string S, the task is to change the string according to the condition; If the first letter in a string is capital letter then change the full string to capital letters, else change the full string to small letters.
		 String s = "For";

		 if((int)s.charAt(0)<=90 && (int)s.charAt(0)>=65 ){
			s =  s.toUpperCase();
		 }else{
			s =  s.toLowerCase();
		 }

		 System.out.println(s);
	}

}
