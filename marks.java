import java.util.Scanner;

public class marks {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        int[] array_a=new int[3];
        int[] array_b=new int[3];
        
         array_a[0]=a0;
         array_a[1]=a1;
         array_a[2]=a2;
        
         array_b[0]=b0;
         array_b[1]=b1;
         array_b[2]=b2;
        
        int count_a=0;
        int count_b=0;
        
        for(int i=0;i<3;i++)
            {
           if(array_a[i]>array_b[i])
               {
               count_a++;
               
               }
             if(array_a[i]<array_b[i])
                {
                 count_b++;  
                
                }         
           }
        
    
                System.out.print(count_a+" "+count_b);
            
            }

        Hashmap<Integer, Integer> map=new HashMap<Integer, Integer>(); 
    

	}


