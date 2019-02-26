import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class example 
{	
	public static void main(String args[])
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(3);
		a.add(4);
		a.add(1);
		//a.add(3);
		a.add(4);
		a.add(1);
		HashMap<Integer, Integer>map =new HashMap<Integer, Integer>();
	    for(int i=0;i<a.size();i++)
	    {
	        if(map.containsKey(a.get(i)))
	        {
	            int tmp= map.get(a.get(i)); 
	            tmp=tmp+1;
	            map.put(a.get(i),tmp);	            
	        }
	        else
	        {
	            map.put(a.get(i),1);	            
	        }	       
	    }
	    
	    Iterator it= map.entrySet().iterator(); 
	    while (it.hasNext()) {
	    Map.Entry pair = (Map.Entry)it.next();
	    
	    			if((int)pair.getValue()>1)
	    		{
	    				System.out.println(pair.getKey());
	    				break;
	    		}
	   
		
		
	}
}
    
}
