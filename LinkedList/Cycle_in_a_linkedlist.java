package LinkedList;

public class Cycle_in_a_linkedlist 
{
	public void findcycle(LinkedList list)
	{		
		LinkedNode fast=list.head;
		LinkedNode slow=list.head;
		
		while(fast!=null && slow!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;	
			
			if(fast==slow)
			{
				System.out.println("loop found at "+fast.data);
				break;
			}
		}				
	}
	
	public static void main(String[] args)
	{
		Cycle_in_a_linkedlist cycle=new Cycle_in_a_linkedlist();
	
		
		LinkedList list=new LinkedList();			
		 
		  int[] array=new int[]{0,1,2,1,5,4};		
	      for(int i=0;i<array.length;i++)
	      {	    	  
	    	  list.add(array[i]);       	      	      
	      }
	      
	      list.head.next.next.next.next.next.next=list.head;
	      
	    
	      
	     // System.out.println(list.head.next.next.data);
	  	
		cycle.findcycle(list);
		

	}

}
