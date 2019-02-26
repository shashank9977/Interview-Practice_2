package Stack_and_Queues;

import java.util.EmptyStackException;

class StackNode
{
	public Object data;
	public StackNode next;
	
	public StackNode(Object data)
	{
		this.data=data;
		this.next=null;
				
	}
	
}
	public class Stack 
	{
		StackNode Top=null;		
		public void push(int data)
		{
			if(Top==null)
			{
				//System.out.println((int)Top.data);
				Top=new StackNode(data);				
			}
			else
			{
				StackNode temp=new StackNode(data);				
				temp.next=Top;
				Top=temp;
			//	System.out.println(Top.data);
			}		
		}
		
		public int pop()
		{
			if(Top==null)
			{			
				throw new EmptyStackException();				
			}
			else
			{
				StackNode item=Top;
				Top=Top.next;				
				return (int) item.data;
			}		
		}

		public int peek()
		{
			if(Top==null)
			{			
				throw new EmptyStackException();			
			}
			else
			{	
				System.out.println((int)Top.data);
				return (int)Top.data;
			}				
		}

		public boolean isempty()
		{
			if(Top==null)
			{
				return true;
			}
			return false;
		}
		
		public int MinElem()
		{
			Stack s1=new Stack();
			
			int min=Integer.MAX_VALUE;
			while(!isempty())
			{				
				int poppedelement=pop();			
				if(poppedelement<min)
				{					
					min=poppedelement;
				}				
				s1.push((int)pop());					
			}			
			while(!s1.isempty())
			{
				push(s1.pop());						
			}						
		return min;	
						
		}
	}
