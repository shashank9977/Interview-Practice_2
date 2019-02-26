package Oracle;

public class searchinmatrix {
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix=new int[][]{{1,2,3},{4,5,6},{6,8,9},{7,11,12}};
		int searchnum=7;
		search(matrix,7);
	}

	private static void search(int[][] matrix, int searchnum ) {
		// TODO Auto-generated method stub
		int m=matrix[0].length-1;
		int n=0;
		
		while(m>=0 && n<matrix.length)
		{			
			if(matrix[n][m]<searchnum){
			     n++;
			}
			else if(matrix[n][m]>searchnum){					
				m--;
			}
			else{
				System.out.println("number found "+matrix[n][m]+"at "+n+" "+m);
				break;
			}
		}		
	}

}
