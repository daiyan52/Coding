package TCS.in;
import java.util.Scanner;
public class Nth_Term {
	public static void fib(int n) {
		int a=0,b=1;
		for(int i=1;i<=n;i++) {
			int next = a+b;
			a=b;
			b=next;
		}
		System.out.println(a);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num");
		int n = s.nextInt();
		fib(n);
	}
}
