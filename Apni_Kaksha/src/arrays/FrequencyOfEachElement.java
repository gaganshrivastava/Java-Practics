package arrays;

public class FrequencyOfEachElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, -1 , -1,1,-1,1};
		int frequency[] = new int[a.length];
		int visited = -1;

		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {

				if ((a[i] == a[j]) && frequency[j] != visited) {
					count++;
					//mark the position as visited so that it can't be counted again
					frequency[j] = visited;
				}
			}
			
			//check for the number which occured first time 
			//OR it check that the i-th position number is already visited beforre or not
			// if it = visited then it occurs before that position
			if(frequency[i] != visited){
				frequency[i] = count;
			}
		}
		
		
		//for displaying
		
		for(int i = 0;i<a.length ; i++){
		if(frequency[i] != visited){
			System.out.println(a[i] + " occurs " + frequency[i]);
		}
			
		}

	}

}
