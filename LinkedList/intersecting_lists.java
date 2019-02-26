package LinkedList;

public class intersecting_lists {

	public static void main(String[] args) 
	{
		intersecting_lists intersecting=new intersecting_lists();
		
		 LinkedList l1=new LinkedList();
		 LinkedList l2=new LinkedList();
		 LinkedList l3=new LinkedList();
		 
		 int[] array=new int[]{3,1,5,9};
		 int[] array2=new int[]{4,6};
		 int[] array3=new int[]{7,2,1};
		 
	      for(int i=0;i<array.length;i++)
	      {	    	  
	    	  l1.add(array[i]);       	      	      
	      
	      }	 
	      
	      for(int i=0;i<array2.length;i++)
	      {	    	  
	    	  l2.add(array2[i]);       	      	      	      
	      }	
	      
	      for(int i=0;i<array3.length;i++)
	      {	    	  
	    	  l3.add(array3[i]);       	      	      
	      }
	      
	      LinkedNode temp1=l1.head;
	      while(temp1!=null)
	      {
	    	  temp1=temp1.next;	    	  
	    	  if(temp1.next==null)
	    	  {
	    		//  System.out.println(temp1.data);
	    		  temp1.next=l3.head;
	    		  break;
	    	  }	    	  
	      }
	      	      
	      LinkedNode temp2=l2.head;
	      while(temp2!=null)
	      {
	    	  temp2=temp2.next;	    	  
	    	  if(temp2.next==null)
	    	  {
	    		  temp2.next=l3.head;	
	    		  break;
	    	  }	    	  
	      }
	      
	      int i=0;	      
	      if(l1.listcount()>l2.listcount())
			{
				int diff=l1.listcount()-l2.listcount();						
				while(i<diff)
				{					
					l1.head=l1.head.next;
					i++;
				}						
			}
			else				
			{				
				int diff=l2.listcount()-l1.listcount();
				while(i<diff)
				{
					l2.head=l2.head.next;										
				
				}
				i++;			
				}
	      
	      intersecting.findintersection(l1,l2);   	
		}

		private void findintersection(LinkedList l1, LinkedList l2) 
		{		
			
			LinkedNode head1=l1.head;
			LinkedNode head2=l2.head;
			
			System.out.println(head1.data);
			System.out.println(head2.data);
			
			while(head1.next!=null && head2.next!=null)
			{
				head1=head1.next;
				head2=head2.next;
				
			}			
			if(head1.data==head2.data)
			{	
				 head1=l1.head;
				 head2=l2.head;
				while(head1!=null && head2!=null)
				{
					if(head1==head2)
					{
						System.out.println("Intersection point is"+head1.data);
						break;
					}
					
					head1=head1.next;
					head2=head2.next;
				
				}			
			}
			else
			{
				System.out.println("not intersecting");
				
				
			}											
		}

}
