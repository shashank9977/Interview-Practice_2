import java.util.ArrayList;
import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		String str=sc.next();
		
		ArrayList<Character> list=new ArrayList<Character>();
		ArrayList<String> finallist=new ArrayList<String>();
		for(int i=0;i<len;i++)
		{
			if(!list.contains(str.charAt(i)))
			{
				list.add(str.charAt(i));
				//System.out.println(str.charAt(i));			
			}		
		}
		
		for(int i=0;i<len-1;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(str.charAt(i)!=str.charAt(j))
				{					
					System.out.print(str.charAt(i)+"     "+str.charAt(j));
					finallist=getstrings(finallist,str,str.charAt(i),str.charAt(j));
				}												
				System.out.println();			
			}				
		}
		
		int max=Integer.MIN_VALUE;
		for(String x :finallist)
		{
			if(x.length()>max)
			{
				max=x.length();
				
			}						
		}		
		System.out.println(max);		
	}

	private static ArrayList<String> getstrings(ArrayList<String> templist,String str,char charAt, char charAt2) 
	{
		//ArrayList<String> templist=new ArrayList<String>();
		char comparechar=charAt;
		String temp="";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==comparechar)
			{
				temp+=String.valueOf(str.charAt(i));
				comparechar=charAt2;
			}			
		}
		
		templist.add(temp);		
		return templist;
	}

}
