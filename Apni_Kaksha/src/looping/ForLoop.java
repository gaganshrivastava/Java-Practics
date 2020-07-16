package looping;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of numebr");
		int n = sc.nextInt();
		
		//summ of n numbers
		int sum = 0;
		for(int a = 1; a <=n ; a= a+1){
			sum = sum +a;
		}
		System.out.println("total of n number is = " + sum );
		
		//reverse a number
		for(int i = 10;i>0 ; i--){
			System.out.println(i);
		}
		sc.close();
	}

}
