package Microsoft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CuttOfftreesgolf {
   //https://leetcode.com/problems/cut-off-trees-for-golf-event/description/
	int[] dr={-1,1,0,0};
	int[] dc=new int[]{0,0,-1,1};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuttOfftreesgolf golf=new CuttOfftreesgolf();
		int[][] board=new int[][]{{1,2,3},
								  {0,0,4},
								  {7,6,5}};
		
		List<Integer> list=new ArrayList<Integer>();
		List<List<Integer>> forest=new ArrayList<List<Integer>>();
		for(int i=0;i<board.length;i++){
			list=new ArrayList<Integer>();	
			for(int j=0;j<board[0].length;j++){				
				list.add(board[i][j]);
			}
			forest.add(list);
		}
			System.out.println(golf.getminimumsteps(forest));
	}

	private int  getminimumsteps(List<List<Integer>> forest) {
			List<Integer[]> trees=new ArrayList<Integer[]>();
			for(int i=0;i<forest.size();++i){
				for(int j=0;j<forest.get(0).size();++j){
					int v=forest.get(i).get(j);				
					if(v>1)trees.add(new Integer[]{v,i,j});					
				}
			}			
			Collections.sort(trees, (a,b) -> Integer.compare(a[0],b[0]));
			int sr=0;int sc=0;int ans=0;
			for(Integer[] tree: trees){	
				int d=dist(forest, sr,sc,tree[1],tree[2]);
				if(d<0) return -1;
				ans+=d;
				sr=tree[1];
				sc=tree[2];
			}			
			return(ans);
	}

	private int dist(List<List<Integer>> forest,int sr, int sc, Integer tr, Integer tc) {
		// TODO Auto-generated method stub
		int R=forest.size();
		int C=forest.get(0).size();
		Queue<Integer[]> queue=new LinkedList<Integer[]>();
		queue.add(new Integer[]{sr,sc,0});
		boolean[][] seen=new boolean[R][C];
		seen[sr][sc]=true;
		while(!queue.isEmpty()){
			Integer[] curr=queue.poll();
			if(curr[0]==tr && curr[1]==tc){				
				return curr[2];
			}
			for(int i=0;i<4;++i){
				int r=curr[0]+dr[i];
				int c=curr[1]+dc[i];
				if(r>=0 &&r<R &&c>=0&&c<C && forest.get(r).get(c)>0 && !seen[r][c]){
					seen[r][c]=true;
					queue.add(new Integer[]{r,c,curr[2]+1});
				}
			}		
		}
		return -1;
	}

}
