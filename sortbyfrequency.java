import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class ValueComparator implements Comparator<Map.Entry<Integer,Integer>>
{
	Map<Integer,Integer> base;
	
	@Override
	public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) 
	{		
		return o2.getValue().compareTo(o1.getValue());						
	}
}

 public class sortbyfrequency 
	{
	public static void main(String[] args) 
	{
		int[] matrix=new int[]{1,1,1,4,4,4,2,3,7,8,3};		
		HashMap<Integer, Integer> mp=new HashMap<Integer, Integer>();
		for(int i=0;i<matrix.length;i++)
			{
				if(mp.containsKey(matrix[i]))
				{
					int tmp=mp.get(matrix[i]);
					mp.put(matrix[i],tmp+1);					
				}
				else
				{
					mp.put(matrix[i],1);					
				}			
			}
		
			ArrayList<Entry<Integer, Integer>> entries=new ArrayList<Entry<Integer, Integer>>(mp.entrySet());						
			Collections.sort(entries,new ValueComparator());			
			for(Map.Entry<Integer, Integer>x : mp.entrySet())
			{
				
			}
			 int[] arr=new int[matrix.length];
						int index=0;
						
			  for (Map.Entry<Integer,Integer> entry : entries) 
			 	{
		            for (int i = 0; i < entry.getValue(); i++) 
		            {
		                arr[index++] = entry.getKey();
		            }
		        }
			 
			 for (int i = 0; i < arr.length; i++) 
	            {				 
				 	System.out.print(arr[i]);
	            }
						
		}
	}
