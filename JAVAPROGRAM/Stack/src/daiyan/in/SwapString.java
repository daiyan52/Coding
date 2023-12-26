package daiyan.in;

import java.util.Scanner;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Daiyan";
		String s2="Alam";
		System.out.println("s1 :: "+s1+"\ns2 :: "+s2);
		s1 = s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("After swaping");
		System.out.println("s1 :: "+s1+"\ns2 :: "+s2);
	}
}
