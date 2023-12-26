package TCS.in;

import java.util.Scanner;

public class SUBSTRING {
	public static void sString(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		sString(str);
	}
}
