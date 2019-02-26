package LinkedList;

public class Delete_Middle_Node {

	static LinkedNode head=null;
	public static void main(String[] args) 
	{
		  Link_From_K_To_Last link=new Link_From_K_To_Last();	
		  LinkedList list=new LinkedList();			
		 
		  int[] array=new int[]{1,2,3,2,4,5,6};
		
	      for(int i=0;i<array.length;i++)
	      {	    	  
	    	  list.add(array[i]);       	      	      
	      }	      
	  
	      link.delete_middle_node(head);
	      
	      
	}

}
