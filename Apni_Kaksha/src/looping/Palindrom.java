package looping;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int ori= n;
		int rev  = 0;
		while(n>0){
			rev = rev*10 + (n%10);
			n /= 10;
		}
		if(ori == rev){
			System.out.println("Enter Number is Palindrom numebr");
		} else {
			System.out.println("Enter Number is not Palindrom numebr");
		}

	}

}
