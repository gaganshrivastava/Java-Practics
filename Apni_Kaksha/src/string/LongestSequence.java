package string;

public class LongestSequence {
//not solved
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abccck";
		int count =1;
		
		for(int i=0; i<a.length()-1;i++){
			int startindex = 0;
			int endindex = 0;
			//count =1;
			for(int j=1;j<a.length();j++){
				if(a.charAt(i) == a.charAt(j)){
					count++;
					startindex = i;
					endindex = j;
					
				}else
					break;
			}
			System.out.println(endindex);
			if(count>1){
				String s = a.substring(i, endindex);
				System.out.println(s);
			}
		}
		

	}

}
