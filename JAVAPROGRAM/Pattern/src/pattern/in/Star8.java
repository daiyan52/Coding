package pattern.in;

import java.util.Scanner;

/*
 			**********
 			****  ****
 			***    ***
 			**      **
 			*        *		
 */
public class Star8 {
	public static void main(String[] args) {
		int n=15;
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
//			/System.out.println();
			for(int k=1;k<=2*(n-i);k++) {
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
