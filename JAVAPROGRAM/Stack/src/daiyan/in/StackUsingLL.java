package daiyan.in;

public class StackUsingLL {
	private Node head;
	private int size;
	
	public StackUsingLL()
	{
		head=null;
		size=0;
	}
	public void push(int element) {
		Node newNode = new Node(element);
		newNode.next=head;
		head=newNode;
		size++;
	}
	public int count() {
		return size;
	}
	public int top() throws StackEmptyException {
		if(head==null) {
			throw new StackEmptyException();
		}
		return head.data;
	}
	public int pop() throws StackEmptyException {
		if(head == null) {
			throw new StackEmptyException();
		}
		int temp = head.data;
		head =  head.next;
		size--;
		return temp;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void Rprint() {
		
	}
}
