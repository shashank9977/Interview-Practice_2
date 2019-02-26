package amazon;

import java.util.ArrayList;
import java.util.List;

public class Rotatematrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// clockwise rotation
		int[][] matrix=new int[][]{ {1,2,3},
						 			{3,4,5},
						 			{6,7,8}};						
			int n=matrix.length;				 	// code to reverse rows in matrix.		
			for(int i=0;i<n/2;i++){                         //678
													        //345
													        //123
			for(int j=0;j<n;j++){
				int temp=matrix[i][j];
			    matrix[i][j]=matrix[n-i-1][j];
			    matrix[n-i-1][j]=temp;
			}
			}
			for(int i=0;i<n;i++) // reverse row and column
			{								//631
				//742
				//853
				for(int j=i+1;j<n;j++)	
				{
					int temp=matrix[i][j];
					matrix[i][j]=matrix[j][i];
					matrix[j][i]=temp;
				}	
			}
			
		
		print(matrix);
	}
	

	private static void print(int[][] matrix) {
		// TODO Auto-generated method stub		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]);				
			}
			System.out.println();
		}
	}

}
