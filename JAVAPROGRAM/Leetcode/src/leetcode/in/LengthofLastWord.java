package leetcode.in;

import java.util.Scanner;

public class LengthofLastWord {
	public static int wordlen(String str)
	{
		String temp = str.trim();
		char[] ch = temp.toCharArray();
		int c=0;
		for(int i=ch.length-1;i>=0;i--)
		{
			if(ch[i]==' ')
			{
				break;
			}
			c++;
		}
		return c;
	}
	public static void main(String[] args) {
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(str.length());
		int len = wordlen(str);
		System.out.println(len);
	}
}
