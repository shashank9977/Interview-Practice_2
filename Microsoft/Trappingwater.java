package Microsoft;

public class Trappingwater {

	public static void main(String[] args) {		
		int[] blocks=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};		
		int watercontent=findwatercontent(blocks);
		System.out.println(watercontent);
	}

	private static int findwatercontent(int[] blocks) {
		int ans=0;
		int left=0;
		int right=blocks.length-1;
		int maxleft=0;
		int maxright=0;
		while(left<right){
			if(blocks[left]<=blocks[right]){
				if(blocks[++left]>maxleft){
					maxleft=blocks[left];					
				}
				else{					
					ans=ans+(maxleft-blocks[left]);
				}
				}
				else{
					if(blocks[--right]>maxright){						
						maxright=blocks[right];
					}
					else{						
						ans=ans+(maxright-blocks[right]);
					}
				}
			}
		//System.out.println(ans);
		
		return ans;
	}

}
