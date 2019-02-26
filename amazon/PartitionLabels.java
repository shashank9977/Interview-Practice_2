package amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PartitionLabels {
//https://leetcode.com/problems/partition-labels/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String S="ababcbacadefegdehijhklij";
		int[] Map=new int[26];
		List<Integer> list=new ArrayList<Integer>();
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<S.length();i++){
			Map[S.charAt(i)-'a']=i;
		}
		int start=0;
		int last=0;
		for(int i=0;i<S.length();i++){			
			last=Math.max(last,Map[S.charAt(i)-'a']);
			if(last==i){
				list.add(last-start+1);
				start=last+1;
			}
		}		
	}

}
