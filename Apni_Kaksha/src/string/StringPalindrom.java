package string;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String a = "araa";
		boolean flag = false;
		//System.out.println(a.indexOf("g"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String a  = sc.nextLine();
		
		for(int i = 0 ; i< a.length()/2;i++){
			flag = false;
			if(a.charAt(i) != a.charAt(a.length()-1-i))
			break;
			else
				flag = true;
		}
		
		if(flag){
			System.out.println("Given string is palindrom ");
		}else
			System.out.println("Given string is not palindrom ");
	}

}
