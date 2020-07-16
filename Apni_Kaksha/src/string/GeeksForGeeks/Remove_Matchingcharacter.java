package string.GeeksForGeeks;

import java.util.ArrayList;

public class Remove_Matchingcharacter {
	// question
	// Given two strings s1 and s2, remove those characters from first string
	// which are present in second string.
	// Both the strings are different and contain only lowercase characters.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "geeksforgeeks";
		String b = " mask ";

		String c = "";
		boolean flag ;
		
		

		for (int i = 0; i < a.length(); i++) {
			flag = false;
			for (int j = 0; j < b.length(); j++) {
				if (a.charAt(i) == b.charAt(j)) {
					//not add th char
					flag = false;
					break;
				}else{
					flag = true;
				}

			}
			if(flag){
				c = c.concat(Character.toString(a.charAt(i)));
			}
		}

		System.out.println(c);
	}

}
