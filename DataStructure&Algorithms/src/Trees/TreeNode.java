package Trees;

public class TreeNode {
	
	private int data;
	private TreeNode leftChild, rightChild;
	
	public void insert(int value){
		if(value == data){
			return ;
		}
		
		if(value<data){
			//left part of the tree
			if(leftChild == null){
				leftChild = new TreeNode(value);
			}else{
				
				leftChild.insert(value);
			}
		}else{
			// right portion
			if(rightChild == null){
				rightChild = new TreeNode(value);
			}else{
				
				rightChild.insert(value);
			}
		}
	}
	
	public TreeNode getvalue(int value){
		if(value == data){
			return this; // this will returning this current node if the value is equal 
		}
		
		if(value < data){
			// search in the left position
			if(leftChild != null){
				return leftChild.getvalue(value);
			}
		}else{
			if(rightChild != null){
				return rightChild.getvalue(value);
			}
		}
		
		// if no vlue matche then return null
		return null;
	}
	
	
	// first element from the left is min
	  public int min() {
	        if (leftChild == null) {
	            return data;
	        }
	        else {
	            return leftChild.min();
	        }
	    }

	  // first elelemt form the right is max
	    public int max() {
	        if (rightChild == null) {
	            return data;
	        }
	        else {
	            return rightChild.max();
	        }
	    }
	
	public void traverslInOrder(){
		if(leftChild != null){ // it will go till the end of left child
			leftChild.traverslInOrder();
		}
		System.out.print(  data + " ");
		if(rightChild != null){
			rightChild.traverslInOrder();
		}
	}
	
	
	
	public void traverslPreOrder(){
		System.out.print(  data + " ");
		
		if(leftChild != null){
			leftChild.traverslInOrder();
		}
		
		if(rightChild != null){
			rightChild.traverslInOrder();
		}
	}
	public TreeNode(int data) {
		super();
		this.data = data;
	
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	@Override
	public String toString() {
		return "TreeNode [data=" + data + "]";
	}
	

}
