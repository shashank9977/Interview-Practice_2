package String_and_Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



	public class String_Compression {

	public static void main(String[] args)
	{
		    String_Compression Compression=new String_Compression();
			//	String str="aabccccaaa";
		    String str="abcdd";
			String str2=Compression.Compress_string(str);			
			System.out.println(str2);
	}

	private String Compress_string(String str) 
	{
		int len=str.length();		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				Integer cnt=map.get(str.charAt(i));				
				cnt=cnt+1;			
				map.put(str.charAt(i), cnt);								
			}
			else
			{
				map.put(str.charAt(i), 1);
				
			}
		}		
		Iterator it=map.entrySet().iterator();	
		StringBuilder sb=new StringBuilder();
		while(it.hasNext())
		{
			Map.Entry pair=(Map.Entry)it.next();
						
			sb.append(pair.getKey());
			sb.append(pair.getValue());
	        //System.out.print(pair.getKey()+""+pair.getValue());
			
		}
		
		String new_string=sb.toString();
		
		if(new_string.length()<str.length())
		{
			return new_string;
		}

		return str;
	}
	

}
