package Sorting;

public class SparseSearch {

	public static void main(String[] args) 
	{
		String[] array=new String[]{"at","","","","ball","","","car","","","dad","",""};	
		
		int low=0;
		int high=array.length-1;
		
		Search("car",array,low, high);
		
	}

	private static void Search(String val, String[] array, int low, int high)
	{
		if(low>high) return;
		
			int mid=(low+high)/2;			
			
			if(array[mid]!="")
			{
				if(array[mid]==val)
				{
					System.out.println(mid);
					return;					
				}
				else
				{
					if((int)array[mid].charAt(0)>(int)val.charAt(0))
					{
						int tmph=mid-1;					
						 Search(val,array,low,tmph);					
					}				
					if((int)array[mid].charAt(0)<(int)val.charAt(0))
					{
						int tmph=mid+1;					
						Search(val,array,tmph,high);					
					}							
				}					
			}
						
		 if(array[mid]=="")
			{
				int tmphigh=mid-1;			
			    Search(val,array,low,tmphigh);
			    
				int tmplow=mid+1;			
				Search(val,array,tmplow,high);
				
			}
				
	
		
		
		
		
		
	}

}
