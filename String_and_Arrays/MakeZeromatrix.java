package String_and_Arrays;

public class MakeZeromatrix 
{

	public static void main(String[] args) 
	{
		MakeZeromatrix zeromatrix=new MakeZeromatrix();
		
		
		int[][] matrix=new int[][]{{1,2,3,4},
			{5,0,7,8},
			{9,10,0,12},
			{13,14,15,0}};												
		
			zeromatrix.operate(matrix);
	}

	private void operate(int[][] matrix) 	
	{		
		
		boolean[] Row=new boolean[matrix.length];
		
		boolean[] Col=new boolean[matrix[0].length];
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{				
				if(matrix[i][j]==0)
				{
					Row[i]=true;
					Col[j]=true;					
				}					
			}
			System.out.println();	
		}

		
		for(int i=0;i<matrix.length;i++)
		{
			if(Row[i]==true)
			{				
				for(int Col_index=0;Col_index< matrix[0].length;Col_index++)
				{
					matrix[i][Col_index]=0;
					
				}				
			}			
		}
		
		for(int i=0;i<matrix[0].length;i++)
		{
			if(Col[i]==true)
			{
				for(int Row_index=0;Row_index<matrix.length;Row_index++)
				{
					matrix[Row_index][i]=0;
					
				}	
				
				
			}			
		}
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{	
				
				System.out.print(matrix[i][j]);
				
				
			}
		
			System.out.println();
		}
		
		
		
	}

}
