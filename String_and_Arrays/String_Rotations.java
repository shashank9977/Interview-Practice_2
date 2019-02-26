package String_and_Arrays;

public class String_Rotations {

	public static void main(String[] args) 
	{
		String_Rotations Rotations=new String_Rotations();		
		String str1="erbottlewat";
		String str2="waterbottle";				
		Rotations.check(str1,str2);	

	}

	private void check(String str1, String str2) 
	{		
		int n=str1.length();		
		String concat=str1+str1;
		boolean check=issubstring(concat,str2);				
		System.out.println(check);
	
	}	
	public boolean issubstring(String concat, String str2)
	{				
			int begin=0;
			int end=concat.length()-1;
			String ex="";
			int	begin_2=0;
			int end_2=str2.length()-1;		
			while(begin<end)
			{				
				if(concat.charAt(begin)!=str2.charAt(0)) 
				{
					begin++;			
				}	
				else if( concat.charAt(end)!=str2.charAt(str2.length()-1))
				{
					end--;					
				}
				else
				{
					 System.out.println(begin+""+end);
				     ex=find(concat,begin,end);
				     break;	
				}
			}
						
			System.out.println(ex);
			
			if(str2.equals(ex))
			{
				return true;
				
			}
			return false;
							
			
		}

	private String  find(String concat, int begin, int end) {
		String ex="";
		for(int i=begin;i<=end;i++)
		{
			 ex=ex+concat.charAt(i);
			
			
		}
		return ex;
		
	}
}
