package TCS.in;

import java.util.Scanner;

public class DecimalToOctal {
	public static void dtob(int n) {
		if(n==0)
			return; 
		else {
			dtob(n/2);
			System.out.print(n%2);
		}
	}
	public static void DtoO(int n) {
		if(n==0)
			return;
		else {
			DtoO(n/8);
			System.out.print(n%8);
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter decimal Number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		dtob(n);
		System.out.println();
		DtoO(n);
	}
}
