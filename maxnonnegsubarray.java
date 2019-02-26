import java.util.Arrays;
import java.util.Comparator;


 class stringcomparator implements Comparator<String>
{
	public int compare(String a, String b) 
	{		
		return (b+a).compareTo(a+b);
	}
}

public class maxnonnegsubarray {

	public static void main(String[] args)
	{
		int[] array=new int[]{3,30,34,5,9};
		
		String[] arr=new String[array.length];
		
		for(int i=0;i<array.length;i++)
		{
			arr[i]=String.valueOf(array[i]);						
		}		
		Arrays.sort(arr,new stringcomparator());		
		StringBuilder sb=new StringBuilder();
		
		for(String s:arr)
		{
			System.out.println(s+"  ");
			sb.append(s);			
		}
		
		System.out.println(sb.toString());		
	}

}
