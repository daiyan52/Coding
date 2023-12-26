package Dynamic_Programming.in;

public class MinStep {
	public static void main(String[] args) {
		int c=0;
		int n =10;
		while(n>=1) {
			if(n%3==0) {
				n=n/2;
				c++;
			}
			if(n%2==0) {
				n=n/2;
				c++;
			}
			else {
				n--;
			}
		}
		System.out.println(c);
	}
}
