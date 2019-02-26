package Trees;
class Node{
	int data;
	Node left, right;
	public Node(int item){		
		this.data=item;
		left=right=null;
	}
}

public class BST {
	Node root;
	
	public static void main(String[] args) 
	{
		BST tree=new BST();
		tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
 
        if (tree.isBST())
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
	}

	private boolean isBST() 
	{
		return isBSTUtil(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isBSTUtil(Node node, int min, int max) {
		
		if(node==null)
			return true;
		
		if(node.data<min || node.data>max)
			return false;
		
		return (isBSTUtil(node.left,min,node.data-1) &&
				 isBSTUtil(node.right,node.data+1,max));
	}		
		// TODO Auto-generated method stub	
	}
