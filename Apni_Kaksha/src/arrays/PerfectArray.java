package arrays;

public class PerfectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
///An array is said to be perfect if it's reverse array matches the original array
		
		int a[] = {1,2,2,1};
		int b[] = new int [a.length];
		
		for(int i = a.length -1, j = 0; i >=0  ;i --,j++){
			b[j] = a[i];
			
		}
		boolean flag = false;
		for(int i=0;i<a.length;i++){
			flag = false;
			if(a[i]==b[i]){
				flag = true;
			}
		}
		
		if(flag){
			System.out.println("Perfect Array");
		}else
			System.out.println("  NOt Perfect Array");
	}

}
