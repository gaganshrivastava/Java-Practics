package arrays.geeksforgeeks.easy;

public class CountPairsWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Given an array of integers, and an integer  ‘K’ , find the count of pairs of elements in the array whose sum is equal to 'K'.
		
		int a[] = {1, 1,1,1};
		int target = 2;
		int count = 0;
		for(int i = 0; i <a.length-1 ; i++){
			for(int j= i+1; j<a.length ; j++ ){
				int k = a[i] + a[j];
				if(k== target){
					count++;
				}
			}
		}
		System.out.println("count = " + count );

	}

}
