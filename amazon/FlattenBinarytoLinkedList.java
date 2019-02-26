package amazon;

import Trees.BST;
import amazon.Node;


public class FlattenBinarytoLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlattenBinarytoLinkedList FBL=new FlattenBinarytoLinkedList();
		Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
       Node ret= FBL.flatten(root);
       while(ret!=null){
    	   System.out.println(ret.data);
    	   ret=ret.right;    	   
       }      
	}
	Node Prev=null;
	private Node flatten(Node root) {	
		if(root==null){
			return null;
		}
		flatten(root.right);
		flatten(root.left);
		root.right=Prev;
		root.left=null;
		Prev=root;
		return root;
	}

}
