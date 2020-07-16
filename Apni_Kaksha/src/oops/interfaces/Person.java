package oops.interfaces;

public class Person implements Student, Youtuber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.study();
		p.makevedio();

	}

	@Override
	public void makevedio() {
		// TODO Auto-generated method stub
		System.out.println("makee vedio");
		
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("First study");
		
	}

}
