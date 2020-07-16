package arrays.geeksforgeeks.easy;

public class SortArray012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0, 2 ,1 ,2 ,0};
		
		for(int x: basicbubbleSort(a)){
			System.out.print(x + " ");
		}

	}
	
	public static int[] basicbubbleSort(int a[]){
		for(int i = 0 ; i < a.length ; i++){
			for(int  j = 0 ; j< a.length -1-i; j++  ){
				if(a[j]> a[j+1]){
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j]= temp;
				}
			}
		}
		
		return a;
	}

	
	
}
