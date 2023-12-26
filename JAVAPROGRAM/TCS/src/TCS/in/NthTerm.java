package TCS.in;
import java.util.Scanner;
public class NthTerm {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number_");
		int n = s.nextInt();
		int res;
		if(n%2==0) {
			res = (int) Math.pow(3,(n-1)/2);
			System.out.println(res);
		}
		else {
			res =(int) Math.pow(2,n/2);
			System.out.println(res);
		}
	}

}
