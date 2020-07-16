package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,4,3,5,8,7,8};
		Arrays.sort(a);
		int b[]= a;
		
		for( int x : b){
			System.out.print(x + " ");
		}
		
	}

}
