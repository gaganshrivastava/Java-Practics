package string.GeeksForGeeks;

public class Sum_of_numbers_in_string {

//question
	//Given a string str containing alphanumeric characters, calculate sum of all numbers present in the string.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a  = "1abc236";

		System.out.println(Character.isDigit(a.charAt(0)));
		String temp = "";
		int sum = 0;
		for(int i=0 ;i<a.length();i++){
			char current =a.charAt(i); 
			//check weath the current char is interger or not
			if(Character.isDigit(current)){
				temp = temp+current;
			}else{
				//reset the string
				sum += Integer.parseInt(temp);
				temp = "0";
			}	
		}
		sum+= Integer.parseInt(temp);
		
		System.out.println("Sum = " + sum);
	}

}
