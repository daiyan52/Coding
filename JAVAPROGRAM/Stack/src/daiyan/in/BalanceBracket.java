package daiyan.in;

import java.util.Stack;

public class BalanceBracket {
	private static String isBalanced(String exp) {
		Stack<Character> s = new Stack<Character>();
		for(int i=0;i<exp.length();i++) {
			if(exp.charAt(i)=='[' || exp.charAt(i)=='{'|| exp.charAt(i)=='(') {
				s.push(exp.charAt(i));
			}
			else if(exp.charAt(i)==']' || exp.charAt(i)=='}'||exp.charAt(i)==')') {
				if(s.isEmpty())
					return "NO";
			}
			char ch = s.pop();
			if((exp.charAt(i)==']' && ch=='[') || (exp.charAt(i)=='}' && ch=='{') || (exp.charAt(i)==')' && ch=='(')) {
				continue;
			}
			else {
				return "YES";
			}
		
		}
		if(s.isEmpty()==true)
			return "YES";
		else
			return "NO";
}
	public static void main(String[] args) {
		String s = "([{}])]";
//		String s ="{([])[]}";
		String b = isBalanced(s);
		System.out.print(b);
	}
}
