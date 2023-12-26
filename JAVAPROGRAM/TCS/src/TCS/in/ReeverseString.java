package TCS.in;

import java.util.Scanner;

public class ReeverseString {

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length/2;i++) {
			ch[i]=(char) (ch[i]^ch[ch.length-1-i]);
			ch[ch.length-1-i]=(char) (ch[i]^ch[ch.length-1-i]);
			ch[i]=(char) (ch[i]^ch[ch.length-1-i]);
		}
		System.out.println(ch);
	}
}
