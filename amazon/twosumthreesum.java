package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class twosumthreesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twosumthreesum obj=new twosumthreesum();
		int[] arr=new int[]{-1,0,1,2,-1,-4};
		//obj.getlist(arr);
		obj.gettriplets(arr);
	}
//two sum
//	private void getlist(int[] arr) {
//		Arrays.sort(arr);
//		List<Integer> list=new ArrayList<Integer>();
//		List<List<Integer>> res=new ArrayList<List<Integer>>();
//		int lo=0;
//		int hi=arr.length-1;
//		while(lo<hi){
//			if(arr[lo]+arr[hi]==0){
//				list.add(arr[lo]);
//				list.add(arr[hi]);
//				res.add(list);
//				lo++;
//				hi--;
//			}
//			else if(arr[lo]+arr[hi]>0){
//				hi--;
//			}
//			else{
//				lo++;
//			}
//		}
//	}
	//three sum
	private void gettriplets(int[] arr){
		Arrays.sort(arr);
		List<Integer> list=new ArrayList<Integer>();
		List<List<Integer>> res=new ArrayList<List<Integer>>();
		for(int i=0;i<arr.length-2;i++){
			if(i==0||i>0 && arr[i]!=arr[i-1]){
			int lo=i+1;
			int hi=arr.length-1;
			while(lo<hi){
				if(arr[lo]+arr[hi]==0){
					list.add(arr[i]);
					list.add(arr[lo]);
					list.add(arr[hi]);					
					res.add(list);
					lo++;
					hi--;
				}
				else if(arr[lo]+arr[hi]>0){
					hi--;
				}
				else{
					lo++;
				}
                while (lo < hi && arr[lo] == arr[lo+1]) lo++;
                while (lo < hi && arr[hi] == arr[hi-1]) hi--;
                lo++;
                hi--;
			}
		}		
	}
	

}
