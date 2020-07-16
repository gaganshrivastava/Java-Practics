package arrays.geeksforgeeks.basicLevel;

public class Replace0to5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1004;
		
		//convert it into string
		String as = Integer.toString(a);
		char b[] = as.toCharArray();
		//System.out.println(as.length());
		String e = "";
		
		for(int i = 0 ; i<as.length();i++){
			if(as.charAt(i) == '0'){
				e = e + '5';
			}else{
				e = e + as.charAt(i);
			}
		}
		int x = Integer.parseInt(e);
		System.out.println(x);
		
		
		
		
		
	}

}
