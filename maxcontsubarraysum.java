
public class maxcontsubarraysum 
{

	public static void main(String[] args) 
	{
		int [] array=new int[]{-500,-200,-300};		 
		int newsum=0;
		int max=0;
		
		for(int i=0;i<array.length;i++)
		{
			newsum=Math.max(newsum+array[i], array[i]);
			max=Math.max(max, newsum);				
		}
		System.out.println(max);
	}

}
