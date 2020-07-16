package arrays.geeksforgeeks.basicLevel;

public class FindtheOddOccurence {
//question
//Given an array of positive integers where all numbers occur 
	//even number of times except one number which occurs odd number of times. Find the number.	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {8 ,4 ,4 ,8 ,23,2,23,8,7,8};
		
		int n = a.length;
		int check[] = new int[n];

		for(int i = 0; i< n-1;i++){
			int occur = 1;
			for(int j = i+1 ; j< n ; j++){
				if(a[i] == a[j] && check[j] != -1){
					check[j] = -1;
					occur++;
				}
			}
			if(check[i] != -1)
			check[i] = occur;
		}
		
		for(int i = 0; i< n;i++){
			if(check[i]  == 0 ){
				System.out.print(a[i] + " ");
			}else if(check[i] != -1 && check[i] % 2 != 0  ){
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
	
	}

}
