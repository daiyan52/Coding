package daiyan.in;

public class QueueUsingArrayUse {
	public static void main(String[] args) {
		QueueUsingArray q = new QueueUsingArray(10);
		int arr[] = {3,4,5,6,7,8};
		for(int i=0;i<arr.length;i++)
		{
			q.enQueue(arr[i]);
		}
		System.out.println(q.isEmpty());
		System.out.println("Size :: "+q.size());
		System.out.println("Front Element :: "+q.front());
		System.out.println(q.deQueue()+" is delete Successfully");
		System.out.println("Size :: "+q.size());
		
	}
}
