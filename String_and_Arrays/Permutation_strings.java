package String_and_Arrays;

public class Permutation_strings {

	public static void main(String[] args) 
	{
		Permutation_strings permute=new Permutation_strings();
		
		String str1="abcd";
		String str2="acbd";
		boolean found=false;
		
		permute.findpermutations("",str1,str2);
	//	permute.check_if_permutation_of_another(str1,str2);
	}

	private void findpermutations(String prefix,String str1,String str2) 
	{
		///System.out.println(prefix+"/ "+str1);
		
		 int n=str1.length();
				
					if(n==0)
					{
						if(prefix.equals(str2))
						{
							System.out.println("strings matched"+prefix);
							
						}
						
					}
					else
					{						
						for(int i=0;i<n;i++)
							{
								findpermutations(prefix+str1.charAt(i),str1.substring(0,i)+str1.substring(i+1,n),str2); 	
							}												
					}
					
					
	}

	private void check_if_permutation_of_another(String str1)
	{
		
				
	}

}
