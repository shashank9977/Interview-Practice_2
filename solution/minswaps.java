package solution;

public class minswaps {
	static int[] arr=new int[]{1,3,5,2,4,6,8};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    int c=0;
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==i+1){
	            continue;
	        }
	        else{
	        	if(arr[i]-1 <arr.length){	        		
	        		 swap(i, arr[i]-1);  
	        		 c++;
	    	         i--; 
	        	}
	         
	        	
	        
	         
	        }

	    }
	   System.out.println(c);    
		
	}
	
	public static void swap(int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
