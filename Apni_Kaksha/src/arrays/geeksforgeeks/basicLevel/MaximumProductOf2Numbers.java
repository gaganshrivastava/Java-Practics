package arrays.geeksforgeeks.basicLevel;

import java.util.Arrays;
import java.util.Scanner;
//questio
//Given an array with all elements greater than or equal to zero. Return the maximum product of two numbers possible.
public class MaximumProductOf2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		while (n > 0) {
			int total = sc.nextInt();
		
			int a[] = new int[total];

			for (int i = 0; i < total; i++) {
				a[i] = sc.nextInt();
			}	
				
			Arrays.sort(a)	;
			int p = 1;
			
			for(int i=0,j=a.length-1; i<j;i++){
			    int pr = a[i] * a[j];
			    if(pr> p){
			       p = pr;
			    }
			}
			
			System.out.println(p);
				
				n--;
			}

	}

}
