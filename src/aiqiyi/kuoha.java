package aiqiyi;

import java.util.Scanner;
import java.util.Stack;

public class kuoha {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine().trim();
		char[] c = s.toCharArray();
	    Stack<Character> stack = new Stack<>();
	    int max = 0;
	    for(int i=0;i<c.length;i++)
	    {
	    	if(c[i]=='(')
	    		stack.push(c[i]);
	    	if(stack.size()<=0)
	    		stack.push(c[i]);
	    	else if(c[i]==')' && stack.peek()=='(')
	    		stack.pop();
	    	max = Math.max(max, stack.size());
	    }
	    System.out.println(max);
	}

}
