package Trees;

public class MyTree {

	private TreeNode root;
	
	public void insert(int data){
		if(root== null){
			root = new TreeNode(data);
		}else{
			root.insert(data);
		}
	}
	
	
	public TreeNode getvalue(int value){
		if(root != null){
			 return root.getvalue(value);
		}
		return null; // tree is empty
	}
	
	
    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        else {
            return root.min();
        }
    }

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        else {
            return root.max();
        }
    }
    
    
    public void delete(int value){
    	root = delete(root, value);
    }
	
    
    private TreeNode delete(TreeNode subtree, int value){
    	if(subtree == null){
    		return subtree;
    	}
    	
    	if(value < subtree.getData()){
    		subtree.setLeftChild(delete(subtree.getLeftChild(), value));;
    	}else if(value > subtree.getData()){
    		subtree.setRightChild(delete(subtree.getRightChild(), value));
    	}else{
    		// case 1 n 2 ... delete node has 1 or 0 child
    		if(subtree.getLeftChild()==null){
    			return subtree.getRightChild();
    		}else if(subtree.getRightChild() == null){
    			return subtree.getLeftChild();  	
    			}
    		
    		//case 3 
    		// when a node has two child then alwys go the righht and get the min value . if we want to delete the parent node and if th next chile node doesn't have the left child then the parent node will be replae
    		//https://tcsglobal.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/learn/lecture/8460144#overview
    		// replace witht e min valeue from right part if  we want to delete from the right portion
    		subtree.setData(subtree.getRightChild().min());
    		
    		// delete the node that has the smallest vvalue
    		subtree.setRightChild(delete(subtree.getRightChild(), subtree.getData()));
    		
    	}
    	
    	return subtree;
    }
    
	public void traversalInOrder(){
		if(root!=null){
			root.traverslInOrder();
		}
	}
	
	public void traversaePreOrder(){
		if(root!=null){
			root.traverslPreOrder();
		}
	}
}
