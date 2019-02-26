package Stack_and_Queues;


public class stack_of_plates 
{
	public static void main(String[] args) 
	{		
			//stack_of_plates plates=new stack_of_plates();				
			StackPlates platees=new StackPlates();
			
			platees.push(1);
			platees.push(2);
			platees.push(3);
			platees.push(4);
			
			platees.push(5);			
			platees.push(21);
			platees.push(31);
			platees.push(41);
			
			platees.push(51);		
			platees.push(20);
			platees.push(30);
			platees.push(40);
			
			platees.push(50);

		// System.out.println(platees.Plates.size());
			

		 
		int x=	platees.pop();
		
		System.out.println(x);
		 
		
		System.out.println(platees.pop());
		
		System.out.println(platees.pop());
		// System.out.println(platees.pop());
			
	}

}
