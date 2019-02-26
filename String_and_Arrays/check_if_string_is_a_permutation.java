package String_and_Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class check_if_string_is_a_permutation {

	public static void main(String[] args) 
	{		
		check_if_string_is_a_permutation check_string=new check_if_string_is_a_permutation();
		
	//	String str="Tact Coa";
		
		String str="tactcoapappaa";
		str=str.toLowerCase();
		check_string.find_if_permutation(str);
			
	}

	private void find_if_permutation(String str) 
	{
		int Evencount=0;
		int OddCount=0;
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();	
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				if(map.containsKey(str.charAt(i)))
				{
				int count=map.get(str.charAt(i));
				
				count=count+1;
				
				map.put(str.charAt(i), count);					
				
				}
				else
				{
					map.put(str.charAt(i),1);
					
				}
						
			}			
		}
		
		
		Iterator it=map.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry pair=(Map.Entry)it.next();
			
			System.out.println(pair.getKey()+"  "+pair.getValue());
			
			if((Integer)pair.getValue()%2==0)
			{
				Evencount++;				
			}
			else
			{
				OddCount++;
				
			}			
		}
		
		if(OddCount>1)
		{
			
			System.out.println("Not Palindromes");
			
		}
		else
		{
			System.out.println("Palindromes");
			
			
		}
		
	}

}
