package daiyan.in;

import java.util.Scanner;

public class LengthCount {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int length=0;
		for(char ch : str.toCharArray()) {
			length++;
		}
		System.out.println("Length :: "+length);
	}
}
