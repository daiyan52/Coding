package daiyan.in;
import java.util.Stack;

public class StackCollection {
	public static void reverseStack(Stack<Integer> s,Stack<Integer> temp) {
		if(s.size()<=1)
		{
			return;
		}
		int lastElement = s.pop();
		reverseStack(s,temp);
		while(!s.isEmpty()) {
			int top = s.pop();
			temp.push(top);
		}
		s.push(lastElement);
		while(!temp.isEmpty()) {
			int top = temp.pop();
			s.push(top);
		}
	}
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		Stack<Integer> temp = new Stack<Integer>();
		int arr[] = {12,3,45,6,2,6,2};
		for(int i : arr) {
			s.push(i);
		}
		reverseStack(s,temp);
		System.out.println();
		while(!s.isEmpty()) {
			System.out.print(s.pop()+" ");
		}
	}
}
