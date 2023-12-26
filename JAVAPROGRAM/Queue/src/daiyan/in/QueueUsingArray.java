package daiyan.in;

public class QueueUsingArray {
	private int data[];
	private int front;
	private int rear;
	private int size;
	public QueueUsingArray(int capacity) {
		data = new int[capacity];
		front = -1;
		rear = -1;
		size=0;
	}
	public void enQueue(int element) {
		if(front==-1 && rear == -1)
		{
			front =0;
			rear =0;
			data[front] = element;
			size++;
		}
		else {
			data[rear] = element;
			rear++;
			size++;
		}
	}
	public boolean isEmpty() {
		return size==0;
	}
	public int size() {
		return size;
	}
	public int front() {
		return data[front];
	}
	public int deQueue() {
		int temp = data[front];
		front++;
		size--;
		return temp;
	}
}
