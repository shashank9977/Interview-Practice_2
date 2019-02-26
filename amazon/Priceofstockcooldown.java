package amazon;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/discuss/76005/
public class Priceofstockcooldown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Priceofstockcooldown cooldown=new Priceofstockcooldown();
		int[] prices=new int[]{1, 2, 3, 0, 2};
		cooldown.findmax(prices);
		
	}

	private void findmax(int[] prices) {
		// TODO Auto-generated method stub
		 int b0 = -prices[0], b1 = b0;
		    int s0 = 0, s1 = 0, s2 = 0;
		 
		    for(int i = 1; i < prices.length; i++) {
		    	b0 = Math.max(b1, s2 - prices[i]);
		    	s0 = Math.max(s1, b1 + prices[i]);
		    	b1 = b0; s2 = s1; s1 = s0; 
		    }
		    System.out.println("Selling with cooldown"+s0);
		    
		    for(int i = 1; i < prices.length; i++) {
		    	
		    	
		    }
		    
		    
		    
	}

}
