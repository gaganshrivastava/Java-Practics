package arrays.geeksforgeeks.basicLevel;

//question
//Given a sorted array A of size N. The function remove_duplicate takes two arguments . The first argument is the sorted array A[ ] and the second argument is 'N' the size of the array and 
//returns the size of the new converted array A[ ] with no duplicate element.
public class RemoveduplicateelementsfromsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1 ,2 ,2,4,2,5,1,2,1,7,9};
		
		int check[] = new int[a.length];
		
		for(int i = 0;i< a.length-1;i++){
			for(int j = i+1 ; j<a.length ; j++){
				if(a[i] == a[j] & check[j] != -1){
					check[j] = -1;
					
				}
			}
		}
		
		for(int x = 0; x< a.length ; x++){
			if(check[x] != -1){
				System.out.print(a[x] + " ");
			}
		}

	}

}
