package SearchAlgorithims;

public class LinearSearchAlgo {

	// to find a value in the array
	public static void main(String[] args) {	
		// TODO Auto-generated method stub

		int a[] = {12,55,23,69,41,10};
		int k = 69;
		// uts o(n^2)
		// task find k
	
		
		System.out.println(linearsearch(a,k));
		
	}

	public static int linearsearch(int a[], int k){
		for(int i = 0 ; i < a.length;i++){
			if(a[i] == k ){
				return i;
			}
		}
		return -1;
	}
	
}
