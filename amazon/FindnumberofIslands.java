package amazon;

import java.util.Scanner;

public class FindnumberofIslands {

	static final int ROW=5, COL=5;
	public static void main(String[] args) 
	{
		//http://www.geeksforgeeks.org/find-number-of-islands/
		FindnumberofIslands islands =new FindnumberofIslands();
		Scanner sc=new Scanner(System.in);
		int M[][]=  new int[][] {{1, 1, 0, 0, 0},
            {0, 1, 0, 0, 1},
            {1, 0, 0, 1, 1},
            {0, 0, 0, 0, 0},
            {1, 0, 1, 0, 1}
           };
           FindnumberofIslands I = new FindnumberofIslands();
           System.out.println("Number of islands is: "+ I.countIslands(M));
		

	}

	private int countIslands(int[][] M) 
	{
		boolean visited[][]=new boolean[ROW][COL];
		
		int count=0;
		for(int i=0;i<ROW;i++){
			for(int j=0;j<COL;j++){
				if(M[i][j]==1& !visited[i][j]){
					
					DFS(M,i,j,visited);
					++count;
				}
				
			}
			
		}
		return count;		
	}

	private void DFS(int[][] M, int row, int col, boolean[][] visited) {
		// TODO Auto-generated method stub
		 int rowNbr[] = new int[] {-1, -1, -1,  0, 0,  1, 1, 1};
	        int colNbr[] = new int[] {-1,  0,  1, -1, 1, -1, 0, 1};
	 
	        // Mark this cell as visited
	        visited[row][col] = true;
	 
	        // Recur for all connected neighbours
	        for (int k = 0; k < 8; ++k)
	            if (isSafe(M, row + rowNbr[k], col + colNbr[k], visited) )
	                DFS(M, row + rowNbr[k], col + colNbr[k], visited);		
	}

	private boolean isSafe(int[][] M, int row, int col, boolean[][] visited) {
		// TODO Auto-generated method stub
		  return (row >= 0) && (row < ROW) &&
	               (col >= 0) && (col < COL) &&
	               (M[row][col]==1 && !visited[row][col]);
		
	}

}
