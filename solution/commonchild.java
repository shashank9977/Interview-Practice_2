package solution;

public class commonchild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="HARRY";
		String s2="SALLY";
		
		commonChild(s1,s2);
	}
	
	static int commonChild(String s1, String s2) {
        
        int m=s1.length();
        int n=s2.length();
        
        return lcs2(s1,s2, m,n);

    }
	
	
	static int lcs2(String s1, String s2, int m,int n){
        
        int[][] count=new int[m+1][n+1];
        
      for(int i=1;i<=m;i++){
          for(int j=1;j<=n;j++){
                  if(s1.charAt(i-1)==s2.charAt(j-1)){
                      count[i][j]=count[i-1][j-1]+1;  
                  }
              else{
                  count[i][j]=Math.max(count[i-1][j], count[i][j-1]);
              }    
          }
      }
        return count[m][n];
        
  }

}
