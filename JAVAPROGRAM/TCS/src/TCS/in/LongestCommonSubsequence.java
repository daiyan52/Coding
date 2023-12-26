package TCS.in;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestCommonSubsequence {
	public static void main(String[] args) {
		System.out.println("Enter the same size of two string");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		ArrayList<Character> a1 = new ArrayList<Character>();
		ArrayList<Character> a2 = new ArrayList<Character>();
		for(int i=0;i<s1.length();i++) {
			a1.add(s1.charAt(i));
		}
		for(int i=0;i<s2.length();i++) {
			a2.add(s2.charAt(i));
		}
		for(int i=0;i<a1.size();i++) {
			for(int j=0;j<a2.size();j++) {
				if(a1.get(i)==a2.get(j)) {
					System.out.print(a1.get(i));
				}
			}
		}
	}
}
