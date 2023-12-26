package TCS.in;

import java.util.Scanner;

public class HCFof3Num {
	public static int hcf(int a,int b) {
		if(b==0) {
			return a;
		}
		return hcf(b,a%b);
	}
	public static int hcf(int a,int b,int c) {
		return hcf(hcf(a,b),c);
		
	}
	public static void main(String[] args) {
		System.out.println("Enter three Num");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int res = hcf(a,b,c);
		System.out.println(res);
	}

}
