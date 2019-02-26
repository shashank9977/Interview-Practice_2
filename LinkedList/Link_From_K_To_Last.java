package LinkedList;
public class Link_From_K_To_Last 
{
	static LinkedNode head=null;
	public static void main(String[] args) 
	{		
		  Link_From_K_To_Last link=new Link_From_K_To_Last();	
		  LinkedList list=new LinkedList();			
		  int k=2;
		  int[] array=new int[]{1,2,3,2,4,5,6};
		
	      for(int i=0;i<array.length;i++)
	      {	    	  
	    	  list.add(array[i]);       	      	      
	      }	      
		      
		link.print_linkedlist(list, k);		

	}
		
	public static void print_linkedlist(LinkedList list, int k)
	{
		LinkedNode current=list.head;
		
		for(int i=0;i<k;i++)
		{			
			current=current.next;			
		}
		
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;					
		}
			
	}

	public void delete_middle_node(LinkedNode head2) 
	{
		
		
		
		
	}

}
