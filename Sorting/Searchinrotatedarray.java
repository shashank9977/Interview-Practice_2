package Sorting;

public class Searchinrotatedarray {

	public static void main(String[] args)
	{		
		Searchinrotatedarray search=new Searchinrotatedarray();
	//	int[] array=new int[]{3,4,5,6,7,8,9,1,2,3};		
		int[] array=new int[]{2,2,2,3,4,2};	
		 int mid=search.find(2,array,0,array.length-1);
		System.out.println(mid);
	}

	private int find(int num, int[] array, int low, int high) 
	{
		if(low>high) return -1;		
		int mid=(low+high)/2;	
			if(array[mid]==num)
			{
				return mid;
			}			
			if(array[low]<array[mid])
			{
				 if(num >=array[low] && num <=array[mid])
				{
					find(num,array,low,mid-1);				
				}				
			}						
			if(array[mid]>array[high])
			{			
				if (num<=array[mid] && num<=array[high])
				{
					find(num,array,mid+1,high);								
				}				
			}		
			if(array[low]==array[mid])
			{
			int tmp=find(num,array,low,mid-1);			
			
			if(tmp!=-1)
			{
				return tmp;
				
			}		
			else
			{
				if(tmp==-1)
				{
					find(num,array,mid+1,high);
					
				}				
			}			
			}
			
			if(array[mid]==array[high])
			{
			int tmp=find(num,array,mid+1,high);			
			
			if(tmp!=-1)
			{
				return tmp;		
			}		
			else
			{
				if(tmp==-1)
				{
					find(num,array,low,mid-1);
					
				}				
			}
			
			}
			
			
			else
			{
				
				
			}
			
return -1;
		}
}
