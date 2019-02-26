import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {      
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String[] strings=new String[num];
        for(int i=0;i<num;i++)
            {
               strings[i]=sc.next();
                        
            }
                
        for(int i=0;i<strings.length;i++)
            {
            int strlen=strings[i].length();                                                   
            int index= Confirm(strings[i],"",0,strings[i].substring(1,strlen),strlen);                         
            System.out.println(index);      
            }        
    }
    
    public static int Confirm(String realstring,String firstpart,int index,String secondpart, int len)
        {
       
        int found=-1;
            
        if(index!=len)
            {
               // System.out.println(firstpart+secondpart);
             if(ispalindrome(firstpart+secondpart))
                {
                 found=index;
                 return found;  
                 
                }
            else
                {                
                    index=index+1; 
                //System.out.print(index);
                    String first=realstring.substring(0,index);
                    String second=realstring.substring(index+1,len);
                    found= Confirm(realstring,first,index,second,len);                                              
                }                       
        }
            return found;   
       
       }
    
    
    public static boolean ispalindrome(String tmp)
        {
        char[] arr=tmp.toCharArray();
        int low=0;
        int high=arr.length-1;
        while(low<high)
            {
                  if(arr[low]!=arr[high])
                      {
                           return false;  
                    
                      }
            
            low++;
            high--;
            }
        
        return true;
        }
        
    
}
