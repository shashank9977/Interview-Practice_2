package Oracle;

public class Knapsack_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int[] val=new int[]{60,100,120};
		int[] wt=new int[]{10,20,30};
		int W=50;
		int n=val.length;
		
		System.out.println(Knapsack(W,wt,val,n));
	}

	private static int Knapsack(int W, int[] wt, int[] val, int n) {
		// TODO Auto-generated method stub	
		if(n==0||W==0){
			return 0;
		}
		if(wt[n-1]>W)
			return Knapsack(wt[n-1],wt,val,n-1);		
		else 
			return Math.max(val[n-1]+Knapsack(W-wt[n-1],wt,val,n-1),Knapsack(wt[n-1],wt,val,n-1));
	}

}
