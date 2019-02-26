package amazon;

public class SurroundedRegions {
//https://leetcode.com/problems/surrounded-regions/discuss/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SurroundedRegions regions=new SurroundedRegions();
		String[][] matrix=new String[][]{{"X","X","X","X"},
										 {"X","X","0","X"},
										 {"X","0","X","X"},
										 {"X","0","X","X"}};
		regions.Convert(matrix);		
	}

private void Convert(String[][] matrix) {
	// TODO Auto-generated method stub
	// check columns for boundary O's
	int m=matrix.length;
	int n=matrix[0].length;	
	for(int i=0;i<m;i++){
		if(matrix[i][m-1]=="0"){
			matrix[i][m-1]="*";
			findboundaryzeroes(matrix,i,m-1,m,n);
		}
		if(matrix[i][n-1]=="0"){
			matrix[i][n-1]="*";
			findboundaryzeroes(matrix,n-1,i,m,n);
		}
	}
	// check rows for boundary O's
	for(int i=0;i<n;i++){
		if(matrix[0][i]=="0"){
			matrix[0][i]="*";
		    findboundaryzeroes(matrix,0,i,m,n);
		}
		if(matrix[n-1][i]=="0"){
			matrix[n-1][i]="*";
			findboundaryzeroes(matrix,n-1,i,m,n);
		}
	}
	
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			if(matrix[i][j]!="*"){
				matrix[i][j]="X";
			}
			if(matrix[i][j]=="*"){
				matrix[i][j]="0";
			}		
		}
	}
	
	
	
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			System.out.print(matrix[i][j]);		
		}
		System.out.println();
	}
}

private void findboundaryzeroes(String[][] matrix, int i, int j, int m, int n) {
	// TODO Auto-generated method stub
	 if(i<0||i>m||j<0||j>n)
		 return;
	 if(j<n-1)	 
		if(matrix[i][j+1]=="0"){
			matrix[i][j+1]="*";
			findboundaryzeroes(matrix,i,j+1,m,n);
	 }
	 if(j>0)
		if(matrix[i][j-1]=="0"){
			matrix[i][j-1]="*";
			findboundaryzeroes(matrix,i,j-1,m,n);
		}
	if(i>0)
		if(matrix[i-1][j]=="0"){
			matrix[i-1][j]="*";
			findboundaryzeroes(matrix,i-1,j,m,n);
		}
	if(i<m-1)
		if(matrix[i+1][j]=="0"){
			matrix[i+1][j]="*";
			findboundaryzeroes(matrix,i+1,j,m,n);
		}	
}
}
