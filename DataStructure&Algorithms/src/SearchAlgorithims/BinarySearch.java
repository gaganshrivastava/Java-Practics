package SearchAlgorithims;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {-22,-15,1,7,22,52,65};
		
		System.out.println(iterativeBinarrySearch(a, 22));
		
		System.out.println(recusrsiveBInarySearch(a, 1, 0, a.length));

	}

	public static int iterativeBinarrySearch(int a[], int k ){
		
		int start = 0;
		int end = a.length;
		
		while(start < end){
			int mid = (start + end) / 2;
			if(a[mid]== k){
				return mid;
			}else if(a[mid] < k) {
				// then search in the right side array part
				start = mid+1;
			}else{
				// search in the left side array part
				end = mid;
			}
				
		}
		
		return -1;
	}
	
/*	public static int recusrsiveBInarySearch(int a[], int k){
		return recusrsiveBInarySearch(a, k,0, a.length);
	}*/
	
	public static int recusrsiveBInarySearch(int a[], int k, int start, int end){
		if(start >= end){
			return -1;
		}
		
		int mid = (start + end )/ 2;
		if(a[mid] == k){
			return mid;
		}else if(a[mid] < k){
			return recusrsiveBInarySearch(a, k, mid+1, end);
		}else{
			return recusrsiveBInarySearch(a, k, start, mid);
		}
		
		//return -1;
	}
}
