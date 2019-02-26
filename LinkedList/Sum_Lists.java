package LinkedList;

public class Sum_Lists {

	public static void main(String[] args) 
	{
		Sum_Lists sum_of_list=new Sum_Lists();
		LinkedList list1=new LinkedList();	
		LinkedList list2=new LinkedList();	
		int k=2;
	    int[] array=new int[]{7,1,6};
	    int[] array2=new int[]{5,9,2};
		
	      for(int i=0;i<array.length;i++)
	      {	    	  
	    	  list1.add(array[i]);       	      	      
	      }	  
	      for(int i=0;i<array2.length;i++)
	      {	    	  
	    	  list2.add(array[i]);       	      	      
	      } 
	      
	      if(list1.listcount()>list2.listcount())
	      {
	    	int zero_append_count=list1.listcount()-list2.listcount();  	    	
	    	append_zeroes(list2,zero_append_count);	    	
	      }
	      
	      else if(list1.listcount()<list2.listcount())
	      {
	    	int zero_append_count=list2.listcount()-list1.listcount();      	
	    	append_zeroes(list1,zero_append_count);
	    	
	      }		      	     
	    	  sum_of_list.add_lists(list1,list2);    			    	  	     		
	}
		private static void append_zeroes(LinkedList any_list, int zero_append_count) 
		{
			int i=0;
			while(i<zero_append_count)
			{
				LinkedNode temp=new LinkedNode(0);
				temp.next=any_list.head;
				any_list.head=temp;								
			}		
		}

		private void add_lists(LinkedList list1, LinkedList list2) 
		{
			
			
			
			
		}

}
