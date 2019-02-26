package amazon;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsPhonenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LetterCombinationsPhonenumber phne=new LetterCombinationsPhonenumber();		
		phne.Combinations();
	}

	private void Combinations() {
		String digitletter[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		List<String> result=new ArrayList<String>();
		String digit="234";
		for(int i=0;i<digit.length();i++){
			String chars= digitletter[digit.charAt(i)-'0'];
			result=	combine(chars,result);	
		}	
	}

	private List<String> combine(String chars, List<String> result) {
		for(int i=0;i<chars.length();i++){
			for(String x:result){
				result.add(x+chars.charAt(i));
			}
		}
		return result;
	}
}
