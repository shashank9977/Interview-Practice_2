package Practise;

import java.util.ArrayList;

public class magicmatrix {

	public static void main(String[] args) 
	{
		int[][] matrix=new int[][]{{4,9,2},
									{3,5,7},
								    {8,1,6}};
			
								    
								    boolean result=confirm(matrix);
								    
								   
			
				System.out.println(result);				    	
							
					
					
								    	
								    }

	private static boolean confirm(int[][] matrix) {
		 int columnsum1=0;
		 int columnsum2=0;
		 int columnsum3=0;
		 
		 int columnsum=0;
		 
		 int rowsum1=0;
		 int rowsum2=0;
		 int rowsum3=0;		 
		 int rowsum=0;
		 
		    int diag1=0;
		    int diag2=0;	
		    
		    int[] sums=new int[4];

		    int j=0;
		    for(int i=0;i<3;i++)
		    {	
		    	if(i==0)
		    	{
		    		while(j<3)
			    	{	
			    		
			    	columnsum1+=matrix[i][j];
			    	j++;				    	
			    	}
		    		//System.out.println(columnsum1);
		    	}
		    	
		    	j=0;
		    	if(i==1)
		    	{
		    		while(j<3)
			    	{	
			    		
			    	columnsum2+=matrix[i][j];
			    	j++;	
			    	
			    	}
		    		//System.out.println(columnsum1);
		    	}
		    	j=0;
		    	if(i==2)
		    	{
		    		while(j<3)
			    	{				    		
			    	columnsum3+=matrix[i][j];
			    	j++;	
			    	
			    	}
		    		//System.out.println(columnsum1);
		    		
		    	}
		    	
		    			    			    	
		    }
		    
		    if((columnsum1==columnsum2) && (columnsum2==columnsum3))
		    {		    	
		    	columnsum=columnsum1;
		    	//System.out.println(columnsum);		    	
		    }		    
		    else
		    {		    	
		    	return false;
		    
		    }
		    		    
		   // System.out.println(columnsum);
		    sums[0]=columnsum;
		    j=0;
		    for(int i=0;i<3;i++)
		    {	
		    	if(i==0)
		    	{
		    		while(j<3)
			    	{								    		
			    	rowsum1+=matrix[j][i];								    	
			    	j++;
			    	}
		    		//System.out.println(rowsum1);
		    		
		    	}
		    	j=0;
		    	if(i==1)
		    	{
		    		while(j<3)
			    	{								    		
			    	rowsum2+=matrix[j][i];								    	
			    	j++;
			    	}
		    		//System.out.println(rowsum2);
		    		
		    	}
		    	j=0;
		    	
		    	if(i==2)
		    	{
		    		while(j<3)
			    	{								    		
			    	rowsum3+=matrix[j][i];								    	
			    	j++;
			    	}
		    		//System.out.println(rowsum3);
		    		
		    	}
		    		    									    		  
		    }
		    
		    if(rowsum1==rowsum2 && rowsum2==rowsum3)
		    {
		    	
		    	rowsum=rowsum1;		    	
		    
		    	//System.out.println(rowsum);
		    }
		    
		    else
		    {
		    	return false;
		    	
		    }
		    
		    sums[1]=rowsum;
		    j=0;		    
				for(int i=0;i<matrix[0].length;i++)
				{						
				diag1+=matrix[i][j];							
				j++;
				}
				sums[2]=diag1;

				j=0;		    
				for(int i=2;i>=0;i--)
				{						
				diag2+=matrix[i][j];
					
				j++;
				}			    										
sums[3]=diag2;


int count=0;
for(int i=1;i<sums.length;i++)
{
if(columnsum==sums[i])
{
	count++;
								
}


}

if(count==3)
{
return  true;

}
else
{
return false;

}
	}
								    	
								    
								    
	}


