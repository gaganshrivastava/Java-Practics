package string;

public class MaxMinChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ggagan lives in ha aaarions";
		
		int freq[] = new int[a.length()];
		
		  //Converts given string into character array    
	      char mystr[] = a.toCharArray(); 
		
		for(int i=0;i< a.length();i++){
			freq[i]= 1;
			for(int j = i+1 ; j<a.length();j++){
				if(a.charAt(i) == a.charAt(j) && mystr[j] !=0 && mystr[j] != ' '){
					freq[i]++;
					mystr[j]=0;
				}
			}
			
			
		}
		int min=0,max = 0;
		int maxindex = 0, minindex = 0;
		for(int k = 0; k<freq.length;k++){
			
			if(k != 0 && max< freq[k]){
				max = freq[k];
				maxindex = k;
			
			}
		}
		System.out.println("maxing =" + max +" at " + mystr[maxindex]);
		
	/*for(int k = 0; k<freq.length;k++){
			//System.out.println(freq[k]);
			if(freq[k] !=0 && min > freq[k]){
				min = freq[k];
				minindex = k;
			
			}
		}
		System.out.println("mining  =" + min +" at " + mystr[minindex]);*/

	}

}
