package string;

public class Count_type_of_Characters {
//question
	//Given a string S, write a program to count the occurrence of Lowercase characters, Uppercase characters, Special characters and Numeric values in the string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
		if(str[i] >= 65 and str[i] <=90), then it is uppercase letter,
		if(str[i] >= 97 and str[i] <=122), then it is lowercase letter,
		if(str[i] >= 48 and str[i] <=57), then it is number,*/

		String c = "#GeeKs01fOr@gEEks07";
		int upper = 0, lower = 0, number = 0, spcial = 0;
		for(int i = 0 ; i < c.length();i++){
			if((int)c.charAt(i) >=65 && (int)c.charAt(i) <=90 ){
				upper ++;
				
			}else if((int)c.charAt(i) >=97 && (int)c.charAt(i) <=122 ){
				lower ++;
			}else if((int)c.charAt(i) >=48 && (int)c.charAt(i) <=57){
				number ++;
			}else{
				spcial++;
			}
		}
		
		System.out.println("Uppar = " + upper);
		System.out.println("lower = " + lower);
		System.out.println("number = " + number);
		System.out.println("spcial = " + spcial);
	}

}
