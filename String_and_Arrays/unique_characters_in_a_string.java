package String_and_Arrays;

public class unique_characters_in_a_string {

	public static void main(String[] args) 
	{
	
		unique_characters_in_a_string unique=new unique_characters_in_a_string();		
		String str="abcdefgghi";
		boolean check=unique.check(str);
		
		if(check==true)
		{
			
			System.out.println("Perfect");
		}
		else
		{
			
			System.out.println("no");
		}
				
	}

	private boolean check(String str) 
	{
		Integer[] count=new Integer[1000];
				
		for(int i=0;i<count.length;i++)
		{
			
			count[i]=0;
			
		}
		
		for(int i=0;i<str.length();i++)
		{			
						
		   count[Character.getNumericValue(str.charAt(i))]++;
						
		}
		
		for(int i=0;i<count.length;i++)
		{			
			if(count[i]>1)
			{
				return false;
				
			}
						
		}	
		
	return true;		
	}

}
