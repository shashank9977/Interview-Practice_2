package LinkedList;

public class partition_linked_list {

	public static void main(String[] args) 
	{
		partition_linked_list partition =new partition_linked_list();
		
		LinkedList list=new LinkedList();
		int[] array=new int[]{3,5,8,5,10,2,1};
		
	      for(int i=0;i<array.length;i++)
	      {	    	  
	    	  list.add(array[i]);       	      
	      
	      }	      
		
		partition.create_partition(list);
	}

	private void create_partition(LinkedList list)
	{
			
			LinkedNode Current1= list.head;
			
			LinkedList smaller_elem=new LinkedList();
			LinkedList bigger_elem=new LinkedList();
			while(Current1!=null)
			{
				if(((Integer)Current1.data)<5)
				{
					smaller_elem.add((Integer)Current1.data);					
				}
				else
				{
					bigger_elem.add((Integer)Current1.data);									
				}
				
				Current1=Current1.next;								
			}
			
		LinkedNode Current2=smaller_elem.head;	
		LinkedNode Current3=bigger_elem.head;
		while(Current2.next!=null)
		{
			Current2=Current2.next;
							
		}
		Current2.next=Current3;
		
		smaller_elem.display();
		
		

		
	}

}
