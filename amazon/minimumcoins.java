package amazon;

public class minimumcoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minimumcoins coin=new minimumcoins();
		int[] coins=new int[]{1,2,5};
		int amt=11;
	int count=	coin.findminimumnumber(coins,amt);
	int[] countarray=new int[amt];
	
	for(int i=0;i<countarray.length;i++){
		countarray[i]=0;
	}
	System.out.println(count);
	
	}

	private int findminimumnumber(int[] coins, int amt, int[] countarray) {
		// TODO Auto-generated method stub
		if(amt==0) return 0;
		if(amt<0) return -1;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<coins.length;i++){
			int res= findminimumnumber(coins,amt-coins[i], countarray);
			if(res>=0){
				min=res+1;
			}
		}		
		countarray[amt-1]=Math.min(countarray[amt-1], min);
		return countarray[amt-1];		
	}

}
