package arrays.geeksforgeeks.basicLevel;

public class MaxHeight {

	//question::
	//Given a struct array of type Height, having two elements feet and inches. Find the maximum height, where height is calculated sum of feet and inches after converting feet into inches.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totalsample = 2;
		
		//2* totalsamples = length of sample given
		//first sample is 1,2 == 1 feet , 2 inch
		//		secodd = 2,1 == 2 feet and 1 inch 
		int data[] = {1,2,2,1};
		
		int height ;
		int maxHeight = 0;
		for(int ft =0,inch = 1; inch<= data.length-1 ; ft+=2,inch+=2){
			height = 0;
			height = data[ft]*12 + data[inch]; //converting into inches
			if(height > maxHeight){
				maxHeight = height;
			}
			
		}
		
		System.out.println("MaxHeight = " + maxHeight);

	}

}
