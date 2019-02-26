package Microsoft;

public class nqueens {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board=new int[][]{{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		if(placequeens(board, 0)){
			printboard(board,4,4);			
		}
	}

	private static void printboard(int[][] board, int row, int col) {
		// TODO Auto-generated method stub		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){				
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	private static boolean placequeens(int[][] board, int col) {
		// TODO Auto-generated method stub
		int N=board[0].length;		
		
		if (col >= N)
	        return true;
		
		for(int i=0;i<N;i++){
			if(issafe(board, i,col)){					
				board[i][col]=1;
				if((placequeens(board, col+1)))
				{
					return true;
				}
				board[i][col]=0;				
			}
		}
		return false; 
	}

	private static boolean issafe(int[][] board, int row, int col) {		
		
		int N=board.length;
		for(int i=0;i<col;i++){
			if(board[row][i]==1){
				return false;
			}			
		}
		// upper diagnol
		for(int i=row ,j=col;i>=0 && j>=0;i--,j--){
			if(board[i][j]==1){
				return false;
			}			
		}
		//lower diagnol
		for(int i=row,j=col;i<N && j>=0;i++,j--){
			if(board[i][j]==1){
				return false;
			}			
		}		
		return true;
	}

}
