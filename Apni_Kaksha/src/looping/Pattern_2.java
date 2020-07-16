package looping;

import java.util.Scanner;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		//pattern
		/***********
		**********
		**********
		***********/
		for(int i=1;i<=n;i++){
			for(int j = 1; j<=n ; j++){
				System.out.print("* " );
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("From Java t Point");
		System.out.println();
		for(int i=1;i<=n;i++){
			for(int j = n; j>=1 ; j--){
				if(i==j){
					System.out.print("* ");
				}else
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
