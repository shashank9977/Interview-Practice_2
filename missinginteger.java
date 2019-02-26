import java.util.ArrayList;
import java.util.Collections;

public class missinginteger {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();	
//39, 39, 760, 575, 327, 889, 579, 840, 734, 254, 934, 532, 29, 622, 780, 73, 479, 322, 2, 599, 227, 685, 65, 510, 716, 289, 912, 574, 262, 916, 924, 304, 57, 353, 40, 341, 521, 131, 307, 526, 398, 225, 63, 776
		
		a.add(3);
		a.add(4);
		a.add(-1);
		a.add(1);
		a.add(1);
		//a.add(4);
		//a.add(1);		
		//Collections.sort(a);		
		for(int i=0;i<a.size();i++)
	    {					
			if(a.get(i)>0 && a.get(i)<=a.size())
			{
				int pos=a.get(i)-1;				
				if(a.get(pos)!=a.get(i))
				{	
					int x=a.get(i);
					a.set(i, a.get(pos));
					a.set(pos, x);					
					i--;
				}					
			}					
	    }
		
//		for(int i=0;i<a.size();i++)
//	    {
//			System.out.println(a.get(i));
//						
//	    }					
			for(int i=0;i<a.size();i++)
			{				
				if(a.get(i)!=i+1)
				{
						System.out.println(i+1);
						break;
				}				
			}
			
			//System.out.println (a.size()+1);

	}

}
