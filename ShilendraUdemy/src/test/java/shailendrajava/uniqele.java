package shailendrajava;

import java.util.Stack;

public class uniqele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * balance paranthesis
		 */

		String str = "[][]";
		uniqele a=new uniqele();
		boolean ty=a.balance(str);
		System.out.println(ty);
		

	}
	
	
	public boolean balance(String str) {
		
		Stack<Character> l = new Stack<Character>();

		for (int i = 0; i <= str.length() - 1; i++) {
			
			if(str.charAt(i)=='[') {
				
				l.push(str.charAt(i));
			}
			
			else {
				
			   if(!l.isEmpty() && l.peek()=='['  ) {
			    	  
			    	 l.pop(); 
			      }
			   
			   else {
				   
				   return false;
			   }
			   
			   
			}
			

		}
		
		if(l.isEmpty()) {
			
			return true;
		}
		else {
			return false;
		}
	
		
		
	}

}
