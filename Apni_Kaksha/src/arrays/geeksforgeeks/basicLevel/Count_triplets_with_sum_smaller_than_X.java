package arrays.geeksforgeeks.basicLevel;

import java.util.Arrays;

public class Count_triplets_with_sum_smaller_than_X {
//question
	//Given an array A of distinct integers and a sum value X. Find count of triplets with sum smaller than given sum value X
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a[] = {-2, 0 ,1 ,3};
		int a[] = {5 ,1 ,4 ,3 ,7};
		int x =12;
		
		Arrays.sort(a);
		int ans = 0;
		//fixng the first element and chek the two pointer algo
		for(int i = 0 ; i<a.length - 2 ; i++){
			int j = i+1, k = a.length-1;
			while(j<k){
				if(a[i]+ a[j] + a[k] >= x){
					k--; //decremnt the big values
				}else{
					ans +=k-j;
					j++;
				}
			}
			
		}
		
		System.out.println(ans);

	}

}
