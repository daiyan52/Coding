package daiyan.in;

import java.util.Stack;

public class StackUsingLLUSE {

	public static void main(String[] args) throws StackEmptyException {
		StackUsingLL s = new StackUsingLL();
		System.out.println(s.isEmpty());
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println("Numberof Element :: "+s.count());
		System.out.println("Top element is :: "+s.top());
//		System.out.println("Top element "+s.pop()+" is deleted");
//		System.out.println("Numberof Element :: "+s.count());
		
		//print
		while(!s.isEmpty()) {
			System.out.print(s.pop()+" ");
		}
		s.Rprint();
	}
}
