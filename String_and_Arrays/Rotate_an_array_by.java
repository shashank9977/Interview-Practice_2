package String_and_Arrays;

	public class Rotate_an_array_by 
	{	
		public static void main(String[] args)
		{
			
			Rotate_an_array_by rotate= new Rotate_an_array_by();
		
			
			
			int[][] matrix=new int[][]{{1,2,3,4},
										{5,6,7,8},
										{9,10,11,12},
										{13,14,15,16}};												
										rotate.rotate_by_90(matrix);							
		
		}

		private void rotate_by_90(int[][] mat) 
		{
			
			int N=mat.length;
			for(int x=0;x<N/2;x++)
			{
				for(int y=x;y<N-1-x;y++)
				{
					int temp=mat[x][y];
					
					mat[x][y]=mat[y][N-1-x];
					
					mat[y][N-1-x]=mat[N-1-x][N-1-y];
					
					mat[N-1-x][N-1-y]=mat[N-1-y][x];
					
					mat[N-1-y][x]=temp;
										
					
				}
				
			}
			
			for(int x=0;x<N;x++)
			{
				for(int y=0;y<N;y++)
				{
				System.out.print("  "+mat[x][y]);
				}
			System.out.println();	
			}
			
			
		}
		
	}
