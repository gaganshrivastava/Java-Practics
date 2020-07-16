package Collections.Stack;

import java.util.Iterator;
import java.util.Stack;

import looping.Palindrom;

public class CheckForPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Character> palindrom = new Stack<>();
		
		String s = "bla alb";
		
		String revs= "";
		
		for(int i = 0 ; i<s.length(); i++){
			char a = s.charAt(i);
			palindrom.push(a);
		}
		
		Iterator itr = palindrom.iterator();
		while(itr.hasNext()){
			revs += itr.next();
		}
		//System.out.println(s);
	
		if(s.equals(revs)){
			System.out.println("Palindrom");
		}else{
			System.out.println("Not a palindrom");
		}

	}

}
