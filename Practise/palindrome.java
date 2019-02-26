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
       
            
        if(index!=len)
            {

             if(ispalindrome(firstpart+secondpart))
                {
                 return index;  
                            
                }
            else
                {
                
                    index=index+1;                
                    String first=realstring.substring(0,index);
                    String second=realstring.substring(index+1,len);
                 return   Confirm(realstring,first,index,second,len);
                
                
                }
            
            
            }
        else
            {
            
            
            return -1;
        }
        
       }
    
    
    public static boolean ispalindrome(String tmp)
        {
        char[] arr=tmp.toCharArray();
        int low=0;
        int high=arr.length;
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
