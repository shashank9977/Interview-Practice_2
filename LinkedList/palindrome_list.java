package LinkedList;

import javax.xml.soap.Node;

public class palindrome_list {

	public static void main(String[] args) 
	{
		palindrome_list pal_list=new palindrome_list(); 
		LinkedList list=new LinkedList();			
		 
		  int[] array=new int[]{0,1,2,1,5,4,0};		
	      for(int i=0;i<array.length;i++)
	      {	    	  
	    	  list.add(array[i]);       	      	      
	      }
	      
	     // System.out.println(list.head.next.next.data);
	  
	    LinkedNode new_head= pal_list.reverselist(list);
	   
	   boolean check= pal_list.compare_lists(new_head,list.head,list);	   
	   System.out.println(check);
	    
	}

	private boolean compare_lists(LinkedNode new_head, LinkedNode head,LinkedList list) 
	{
		int list_len=list.listcount();
		
		int count=0;
		
		
		while(head!=null && new_head!=null && count<=list_len/2)
		{		
			if(head.data==new_head.data)
			{
				head=head.next;
				new_head=new_head.next;							
			}
			else
			{
				return false;
				
			}
			count++;
		}
		
		return true;
	}

	public LinkedNode reverselist(LinkedList list) 
	{

		LinkedNode node=list.head;
		LinkedNode new_head=null;
		while(node!=null)
		{
			LinkedNode n=new LinkedNode(node.data);
			//System.out.println(n.data);
			n.next=new_head;			
			new_head=n;
			if(node.next!=null)
			{
				node=node.next;				
			}
			else
			{
				break;
				
			}
			
			//System.out.println(node.data);			
		}			
		System.out.println(new_head.data);
		return new_head;		
		
	}


}
