package Trees;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.io.*;

//http://practice.geeksforgeeks.org/problems/largest-number-formed-from-an-array/0

class Stringnumbers implements Comparator<Integer>
{	
	@Override
	public int compare(Integer a,Integer b){
		
		String first=String.valueOf(a)+String.valueOf(b);
		String second=String.valueOf(b)+String.valueOf(a);
		return first.compareTo(second)>0 ?1:0;
	}

}


public class largestnumberformedfromarray {

	public static void main(String[] args){		
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(3);
		list.add(30);
		list.add(34);
		list.add(5);
		list.add(9);
		Collections.sort(list,new Stringnumbers());
		
		
		for(Integer i : list){
			
			System.out.println(i);
			
		}
	
	}

}
