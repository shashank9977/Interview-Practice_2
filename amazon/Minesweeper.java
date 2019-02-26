package amazon;

import java.util.LinkedList;
import java.util.Queue;

public class Minesweeper {
//minesweeper game
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Character[][] matrix=new Character[][]{{'E','E','E','E','E'},
								   {'E','E','M','E','E'},
								   {'E','E','E','E','E'},
								   {'E','E','E','E','E'}};
		int[] click=new int[]{3,0};						       
		FindnumberofminesDFS(matrix,click);						   						
		 for(int i=0;i<matrix.length;i++){ //count number of mines.
	        	for(int j=0;j<matrix[0].length;j++)
	        	{
	        		System.out.print(matrix[i][j]+" ");
	        	}
	        	System.out.println();   	
		 }
	Character[][] matrix2=new Character[][]{{'E','E','E','E','E'},
		   {'E','E','M','E','E'},
		   {'E','E','E','E','E'},
		   {'E','E','E','E','E'}};
		   
		   Integer[] click2=new Integer[]{3,0};
			Queue<Integer[]> queue=new LinkedList<Integer[]>();
			queue.add(click2);
			FindnumberofminesBFS(matrix2,queue,click2);
			System.out.println();   
			 for(int i=0;i<matrix2.length;i++){ //count number of mines.
		        	for(int j=0;j<matrix2[0].length;j++)
		        	{
		        		System.out.print(matrix2[i][j]+" ");
		        	}
		        	System.out.println();   	
			 }   	 
	}
private static void FindnumberofminesBFS(Character[][] matrix2, Queue<Integer[]> queue, Integer[] click) {
		// TODO Auto-generated method stub

	int m=matrix2.length;
	int n=matrix2[0].length;
	int count=0;
	//findsurroundingmines
	while(!queue.isEmpty()){
		 click=queue.poll();		 
		int row=click[0];
		int col=click[1];
		if(matrix2[row][col]=='M'){
			matrix2[row][col]='X';
		}
		else {
	        for(int i=-1;i<2;i++){ //count number of mines.
	        	for(int j=-1;j<2;j++){
	        		if(i==0 &&j==0) continue;
	        		int r=row+i;
	        		int c=col+j;
	        		if (r < 0 || r >= m || c < 0 || c < 0 || c >= n) continue;
	        		if(matrix2[r][c]=='M'||matrix2[r][c]=='X'){
	        			count++;       			        			
	        		}
	        	}	   
			}				
		}		
	
	   if(count>0){
		   matrix2[row][col]=(char)(count+'0');	   		   
	   }
	   else {
		   matrix2[row][col]='B';
	        for(int i=-1;i<2;i++){
	        	for(int j=-1;j<2;j++){
	        		if(i==0 &&j==0) continue;
	        		int r=row+i;
	        		int c=col+j;
	        		if (r < 0 || r >= m || c < 0 || c < 0 || c >= n) continue;
	        		if(matrix2[r][c]=='E'){
	        			matrix2[r][c]='B';	        			
	        			queue.add(new Integer[]{r,c});
	        			FindnumberofminesBFS(matrix2,queue,click);	        			
	        		}
	        	}	   
			}		   
	   }
	}
	}
	// dfs
	private static void FindnumberofminesDFS(Character[][] matrix, int[] click) {
		// TODO Auto-generated method stub
		int row=click[0];
		int col=click[1];
		int m=matrix.length;
		int n=matrix[0].length;
		int count=0;
		//findsurroundingmines
		if(matrix[row][col]=='M'){
			matrix[row][col]='X';
		}
		else {
	        for(int i=-1;i<2;i++){ //count number of mines.
	        	for(int j=-1;j<2;j++){
	        		if(i==0 &&j==0) continue;
	        		int r=row+i;
	        		int c=col+j;
	        		if (r < 0 || r >= m || c < 0 || c < 0 || c >= n) continue;
	        		if(matrix[r][c]=='M'||matrix[r][c]=='X'){
	        			count++;       			        			
	        		}
	        	}	   
			}				
		}
		
		   if(count>0){
			   matrix[row][col]=(char)(count+'0');	   		   
		   }
		   else {
			   matrix[row][col]='B';
		        for(int i=-1;i<2;i++){
		        	for(int j=-1;j<2;j++){
		        		if(i==0 &&j==0) continue;
		        		int r=row+i;
		        		int c=col+j;
		        		 if (r < 0 || r >= m || c < 0 || c < 0 || c >= n) continue;
		        		if(matrix[r][c]=='E'){
		        			matrix[r][c]='B';
		        			FindnumberofminesDFS(matrix,new int[]{r,c});	        			
		        		}
		        	}	   
				}		   
		   }
		

		
		
	}

}
