package LinkedList;

import org.w3c.dom.Node;

public class LinkedList 
{
  public LinkedNode head=null;
  
  public LinkedList()
  {
	  
	  LinkedNode head=new LinkedNode(null);
	  
  }
  
	public void add(int data)
	{
		if(head==null)
		{
			head=new LinkedNode(data);			
		}
		else
		{
			LinkedNode current=head;		
			while(current.next!=null)
			{
				
				current=current.next;
				
			}			
			current.next=new LinkedNode(data);
			current=current.next;
			current.next=null;
		}		
	}
	
	public void display()
	{
		LinkedNode current=head;
		
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;		
		}	
		
	}
	
	public int listcount()
	{
		    int count=0;
		    		  
			LinkedNode current=head;		
			while(current.next!=null)
			{		
				current=current.next;
				count++;				
			}		
			
			return count+1;				
	}

	
	
	
}
