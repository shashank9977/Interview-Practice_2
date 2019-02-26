package Stack_and_Queues;

import java.util.ArrayList;

public class StackPlates
{
	ArrayList<Stack> Plates=new ArrayList<Stack>();
	int i=0;
	int j=1;
	int limit=4;
	
	int[] array=new int[limit];
	Stack temp=new Stack();
	
	public void push(int data)
	{
		if(i==0)
		{		   
			temp=new Stack();
			temp.push(data);			
			Plates.add(temp);
			i++;	
		}
		
		else
		{			
			if(i<4)
			{				
				Stack previous=this.Plates.get(this.Plates.size()-1);				
				previous.push(data);
				Plates.set(this.Plates.size()-1,previous);
				i++;									
			}			
			if(i==4)
			{
				i=0;
				
			}			
		}		
	}
		
	public int pop()
	{		
		Stack recent=new Stack();	
		
		recent=this.Plates.get(this.Plates.size()-1);
		
		
		if(recent.Top==null)
		{	
			this.Plates.remove(this.Plates.size()-1);
			
			recent=this.Plates.get(this.Plates.size()-1);
			
		}		
					
		return (int)recent.pop();				
	
	}
	
		public int size()
		{			
			return this.Plates.size();			
		}
	
	
}