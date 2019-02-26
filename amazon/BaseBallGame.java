package amazon;

import java.util.Stack;

//https://leetcode.com/problems/baseball-game/description/
public class BaseBallGame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<Integer>();
		String[] str=new String[]{"5","-2","4","C","D","9","+","+"};
		int sum=0;
		int tot=0;
		for(int i=0;i<str.length;i++){
			sum=0;
				if(str[i]=="C"){
					tot=tot-stack.pop();
				}
				else if(str[i]=="D"){					
					sum=2*stack.peek();
					stack.push(sum);
					tot=tot+sum;
				}
				else if(str[i]=="+"){
					int second=stack.pop();
					int first=stack.pop();
					sum=first+second;
					stack.push(first);
					stack.push(second);				
					stack.push(sum);					
					tot=tot+sum;
				}
				else{
					int num=Integer.parseInt(str[i]);								
					stack.push(num);					
					tot=tot+stack.peek();
				}				
			}
		System.out.println(tot);
	}
}
