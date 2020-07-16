package Collections.Stack;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
		
		Stack<Integer> a = new Stack<>();
		
		a.push(12); // adding
		a.push(25);
		a.push(35);
		
		System.out.println(a);
		System.out.println("Peak = " + a.peek()); // first elemt from  top
		
		int x =a.pop(); // removing or taking out
		System.out.println(x);
		
		System.out.println("Peak = " + a.peek());
		
		
		MyStack_With_LinkedList<Integer> ms = new MyStack_With_LinkedList<>();
		
		ms.push(3);
		//ms.push(6);
		System.out.println("Peak = " + ms.peek());
		
		ms.pop();// after removing
	//	System.out.println(" after popping Peak = " + ms.peek());

	}

}
