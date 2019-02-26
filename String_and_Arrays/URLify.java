package String_and_Arrays;

public class URLify {

	public static void main(String[] args) 
	{
		URLify urlify=new URLify();
		
		String str="Mr John Smith      ";
				
		//System.out.println(str.length());
		
		urlify.url_of(str);
				
	}

	private void url_of(String str) 
	{
		int spaces_count=0;
		String true_length=str.trim();
		
		 // creating a true_length_array
		
		for(int i=0;i<true_length.length();i++)
		{
			if(true_length.charAt(i)==' ')
			{				
				spaces_count++;
				
			}					
		}		
		int index=true_length.length()+(spaces_count*3);
			
		char[] true_length_array=new char[index];
		
		for(int i=true_length.length()-1;i>=0;i--)
		{
			if(true_length.charAt(i)==' ')
			{
				true_length_array[index-1]='0';
				true_length_array[index-2]='2';
				true_length_array[index-3]='%';
				index=index-3;				
			}
			else
			{
				System.out.print(true_length.charAt(i));
				true_length_array[index-1]=true_length.charAt(i);			
				//System.out.println(true_length_array[index-1]);
				index--;				
			}				
		}
		
		
		for(int i=0;i<true_length_array.length;i++)
		{
			System.out.print(true_length_array[i]);
					
		}
		
		
	}

}
