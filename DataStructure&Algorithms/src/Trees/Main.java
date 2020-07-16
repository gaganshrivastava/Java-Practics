package Trees;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTree intTree = new MyTree();
		intTree.insert(25);
		intTree.insert(20);
		intTree.insert(15);
		intTree.insert(27);
		intTree.insert(30);
		intTree.insert(29);
		intTree.insert(26);
		
		intTree.traversalInOrder();
		
		System.out.println();
		System.out.println(intTree.getvalue(15));
	
		System.out.println();
		System.out.println(intTree.min());
		
		System.out.println();
		System.out.println(intTree.max());
		
		intTree.delete(26);
		System.out.println();
		intTree.traversalInOrder();
	}

}
