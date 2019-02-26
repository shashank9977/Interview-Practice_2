package Sorting;

public class MergeSort {
	public static int [] array =   new int[]{3,5,7,1,0,4};
	public static int [] tempmergr=new int[array.length];
	public static void main(String[] args) 
	{
		
		MergeSort ms=new MergeSort();
		
		int low=0;
		int high=array.length-1;
		
		ms.sort(array,low,high);
		
		for(int x=0;x<array.length;x++)
		{
			
			System.out.println(array[x]);
			
		}

	}

	private  void sort(int[] array, int low, int high) 
	{
		if(low<high)
		{
			int mid=low+(high-low)/2;			
			sort(array,low,mid);			
			sort(array,mid+1,high);			
			mergeparts(low,mid,high);			
		}
	}

	private void mergeparts(int low, int mid, int high) 
	{
		for(int i=low;i<=high;i++)
		{
			tempmergr[i]=array[i];				
		}
		
		int i=low;
		int j=mid+1;
		int k=low;
		
		while(i<=mid && j<=high)
		{
			if(tempmergr[i]<=tempmergr[j])
			{
				array[k]=tempmergr[i];
				i++;
			}
			else
			{
				array[k]=tempmergr[j];
				j++;
			}
				k++;
		}
		
		while(i<=mid)
		{
			array[k]=tempmergr[i];
			k++;
			i++;
			
		}
	
	}

}
