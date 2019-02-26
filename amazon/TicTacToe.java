package amazon;

public class TicTacToe {

	int[][] board=new int[3][3];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToe toe=new TicTacToe();
		toe.play();	
	}

	private void play() {		
		int i=(int)((Math.random()*10)%3);
		int j=(int)(Math.random()*10)%3;
		if(move(i,j,1)==0)
			play();		
	}

	private int move(int i, int j, int player) {
		// TODO Auto-generated method stub
		int size=board.length;
		int rowc=0;
		int colc=0;
		int diag=0;
		int antidiag=0;
		
		int[] row=new int[]{0,0,0};
		int[] col=new int[]{0,0,0};
		
		row[i]=row[i]+player;
		col[i]=col[i]+player;
		
		if(i==j){			
			diag+=1;
		}
		else if(j==(board[0].length)-i-1){
			antidiag+=1;
		}
		
		if(row[i]==size||col[j]==size||diag==size||antidiag==size){
			return player;
		}
		
		if(player==1){
			player=-1;
		}
		else{
			player=1;
		}
		
		
		return 0;
	}
}
