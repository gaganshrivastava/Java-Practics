package Collections;

import java.util.*;

public class ZeroSumSubArray {
// check wheather the subset of the array has sum  zero ?
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,1,3,-4,-2};
		//int a[] = {1 ,2, 3, 7, 5};
		boolean found = false;
		
		//this will solve in o n^2
		for(int i = 0 ; i < a.length ; i++){
			int sum = 0;
			for(int j = i ; j< a.length ; j++){
				sum += a[j] ;
				if(sum == 0){
					found = true;
					break;
				}
				
			}
			if(found)
				break;
		}
		
		
		// link  : https://www.youtube.com/watch?v=PSpuM9cimxA&list=PLKKfKV1b9e8ps6dD3QA5KFfHdiWj9cB1s&index=49
		System.out.println(found + " found");
		found = false;
		//solving with O of N with the help sets
		// x + 0 = y
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for(int element : a){
			set.add(sum);
			sum += element;
			if(set.contains(sum)){
				found = true;
				break;
			}
		}
		
		System.out.println();
		System.out.println(set);
		
		System.out.println(found + " found");
		
		
		found = false;
		// when the sum of subarray is K
		
		//solving with O of N with the help sets
		//x + k = y >>>
		Set<Integer> set1 = new HashSet<>();
		int k = 12;
		int summ = 0;
		for(int element : a){
			set1.add(summ);
			summ += element;
			if(set1.contains(summ - k)){  // y - k = x(alredy presnt or not)
				found = true;
				break;
			}
		}
		
		System.out.println(set1);
		System.out.println();
		System.out.println(found + " found");
		
		
	}

}
