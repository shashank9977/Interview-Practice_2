package Microsoft;

import java.util.Arrays;

public class minimumarrows {
//https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] points=new int[][]{{7,10},{1,5},{3,6},{2,4},{1,4}};
	int num=countbaloons(points);
	System.out.println(num);
	}

private static int countbaloons(int[][] points) {
	// TODO Auto-generated method stub
	if(points.length==0){
		return 0;
	}
	int currpos=points[0][1];
	int currarrow=1;
	Arrays.sort(points,(a,b) -> a[1]-b[1]);
	for(int i=1;i<points.length;i++){
			if(currpos>points[i][0]){
				continue;
			}
		currarrow++;
		currpos=points[i][1];
	}
	return currarrow;
}

}
