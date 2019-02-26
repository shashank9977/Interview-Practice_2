package LinkedList;

public class Rem_dups_without_buff {

	static LinkedNode root=null;
	public static void main(String[] args) 
	{
		Rem_dups_without_buff rem_dups=new Rem_dups_without_buff();			
		LinkedList list=new LinkedList();
		int[] array=new int[]{1,2,3,2,4,5,6};
		
	      for(int i=0;i<array.length;i++)
	      {	    	  
	    	  list.add(array[i]);       	      
	      
	      }	      
	      rem_dups.remove_duplicates(list);      
	}
	
	private void remove_duplicates(LinkedList list) 
	{
		LinkedNode Current=list.head;
		
		while(Current!=null)
		{
		    LinkedNode Runner=Current;			
			while(Runner!=null)
			{
				if(Runner.next!=null)
				{					
					if(Current.data==Runner.next.data)
					{
						Runner.next=Runner.next.next;					
					}
					
				}
				Runner=Runner.next;				
			}
			Current=Current.next;
		}		
			list.display();	
	}
	
	
	
	

}
