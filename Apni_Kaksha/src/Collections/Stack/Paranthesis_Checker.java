package Collections.Stack;

import java.util.Stack;

public class Paranthesis_Checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "{[]}]";
		boolean flag = true;
		
		//logic is to insert the opening bracters into the Stack and for the closing brackets if its found then check the peek element of the stack.
		// if same then pop the topest elemtn and continue with the next char.
		// if not found then break.
		
		Stack<Character> s = new Stack<>();
		for(int i = 0 ; i< a.length();i++){
			char current = a.charAt(i);
			if(current == '[' || current == '(' || current == '{' ){
				s.push(current);
				continue;
			}
			
			//tis i if in the starting closing brackts is there
			if(s.isEmpty()){
				flag = false;
				break;
			}
			
			if(current == ')'){
				if(!s.isEmpty() && s.peek() == '('  ){ // or isempty check we can add befre
					s.pop();
				}else{
					flag = false;
					break;
				}
			}
			if(current == ']'){
				if(s.peek() == '['){
					s.pop();
				}else{
					flag = false;
					break;
				}
			}
			if(current == '}'){
				if(s.peek() == '{'){
					s.pop();
				}else{
					flag = false;
					break;
				}
			}
		}
		
		if(!s.isEmpty()){
			
			flag = false;
		}

		if(flag){
			System.out.println("String is balanced");
		}else{
			System.out.println("String is not balanced");
		}
	}

}
