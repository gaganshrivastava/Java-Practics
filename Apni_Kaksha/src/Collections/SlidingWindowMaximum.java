package Collections;
import java.awt.Window;
import java.util.*;
public class SlidingWindowMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b[] ={4,3,1,2,5,3,4,7,1,9};
		int f[] = maxSlidingWindow(b, 4);
		
		//to find the maximum number in the given Window. Window can be any size, in this its 4.
		
		for(int x: f){
			System.out.print( x +" " );
		}
		
		

	}
	
	public static int[] maxSlidingWindow(int a[], int k ){
		int n = a.length -1;
		if(n<=k) return a;
		Deque<Integer> dq = new LinkedList<>();
		int ans[] = new int[n-k+1];
		//int b[] ={4,3,1,2,5,3,4,7,1,9};
		
		//storing the  element of max three number in first k numbers
		int i = 0;
		for(; i < k ;i++){
			while(!dq.isEmpty() && a[dq.peekLast()] <= a[i]){
				dq.removeLast();
			}
			dq.addLast(i);
		}	
		
		System.out.println(dq);
		
			for(;i<n ; i++){
				ans[i-k] = a[dq.peekFirst()];
				
				while(!dq.isEmpty() && dq.peekFirst() <= (i-k)){
					dq.removeFirst();
				}
				
				while(!dq.isEmpty() && a[dq.peekLast()] <= a[i]){
					dq.removeLast();
				}
				dq.addLast(i);
			}
			ans[i-k] = a[dq.peekFirst()];
		
		
		return ans;
	}
	
}
