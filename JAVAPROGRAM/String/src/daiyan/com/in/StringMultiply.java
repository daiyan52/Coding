package daiyan.com.in;

import java.util.Scanner;

public class StringMultiply {
	public static String multiply(String s1,String s2) {
		long  n1 = Long.parseLong(s1);
		long n2 = Long.parseLong(s2);
		long m = n1*n2;
		String res = Long.toString(m);
		return res;
	}
	public static void main(String[] args) {
		System.out.println("Enter two String");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		String res = multiply(s1,s2);
		System.out.println(res);
	}

}
