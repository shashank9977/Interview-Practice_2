package Microsoft;
class BinaryTreeNode{
	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	public BinaryTreeNode(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

public class bottomleftvalue {

	static int ans=-1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode root=new BinaryTreeNode(1);
		root.left=new BinaryTreeNode(2);
		root.right=new BinaryTreeNode(3);
		root.left.left=new BinaryTreeNode(4);
		//root.left.left=new BinaryTreeNode(7);
		root.right.left=new BinaryTreeNode(5);
		root.right.right=new BinaryTreeNode(6);
		root.right.left.left=new BinaryTreeNode(7);
		
		int height= FindHeight(root);
		System.out.println(height);
		int leftmostnode=LeftNode(root, 1, height);
		System.out.println(leftmostnode);
	}

	private static int LeftNode(BinaryTreeNode root, int currheight, int height) {		
		if(root==null){
			return -1;
		}
		if(currheight==height){
			ans= root.data;
		}
		else{
			LeftNode(root.left,currheight+1,height);
			LeftNode(root.right,currheight+1,height);
		}
		return ans;
	}

	private static int FindHeight(BinaryTreeNode root) {
		// TODO Auto-generated method stub
		if(root==null){
			return 0;
		} 
		return 1+Math.max(FindHeight(root.left), FindHeight(root.right));
		
	}

}
