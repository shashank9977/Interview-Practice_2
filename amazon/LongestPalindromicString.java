package amazon;

public class LongestPalindromicString {
int maxlen=0;
int lo=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindromicString lps=new LongestPalindromicString();
		String str="babad";
		lps.find(str);
	}

	private void find(String str) {
		// TODO Auto-generated method stub
		for(int  i=0;i<str.length()-1;i++){	
			extendpalindrome(str, i,i);// odd
		}
		System.out.println(str.substring(lo,lo+maxlen));
	}

	private int extendpalindrome(String str, int j, int k) {
		while(j>=0 && k<str.length() && str.charAt(j)==str.charAt(k)){
			j--;
			k++;
		}
		if(maxlen<k-j-1){
			lo=j+1;
			maxlen=k-j-1;		
		}
		
		return lo;
	}

}
