package String_and_Arrays;

public class One_Away {

	public static void main(String[] args) 
	{
		One_Away away=new One_Away();
		
		String[][] array=new String[][]{{"pale","ple"},
										{"pales","pale"},
										{"pale","bale"},
										{"pale","bake"}};
		
		boolean result=	away.is_it_one_edit_away(array);

		System.out.println(result);
	}

	private boolean is_it_one_edit_away(String[][] array) 
	{	
	
		//System.out.println(array[0].length);
		
		for(int i=0;i<array.length;i++)
		{
			String str1=array[i][0];
			String str2=array[i][1];
						
			if(str1.length()==str2.length())
			{
				System.out.println(str1+" "+str2+" "+oneeditreplace(str1,str2));
								
			}			
			if(str1.length()>str2.length())
			{
				if(str1.length()-str2.length()==1)
				{
					System.out.println(str1+" "+str2+" "+oneeditinsert(str1,str2));
					
				}							
			}			
			if(str1.length()<=str2.length())
			{
				if(str2.length()-str1.length()==1)
				{
					System.out.println(str1+" "+str2+" "+oneeditinsert(str2,str1));
					
				}								
			}										
			}
		return false;		
		}
	
	private boolean oneeditinsert(String str1, String str2) 
	{
		int no_of_edits=0;
		int index1=0;
		int index2=0;
	
		while(index2<str2.length() && index1<str1.length()  )
		{			
			if(str1.charAt(index1)!=str2.charAt(index2))
			{
				if(index1!=index2)
				{
					return false;
					
				}
				index1++;
				
			}
			else
			{
				index1++;
				index2++;					
			}			
		}
					
		return true;
		}		
	

	private boolean oneeditreplace(String str1, String str2) {
		
		int index=0;
		int no_of_edits=0;
		while(index<str1.length())
		{	
		if(str1.charAt(index)!=str2.charAt(index))
		{
			no_of_edits++;
			
		}
		index++;
		}
		if(no_of_edits==1)
		{
		   return true;
				
		}
		return false;
		
	}
						
	}

