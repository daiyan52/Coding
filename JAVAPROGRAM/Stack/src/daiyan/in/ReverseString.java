package daiyan.in;
import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Enter string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] str = s.toCharArray();
		for(int i=0;i<str.length/2;i++)
		{
			str[i]=(char) (str[i]^str[str.length-1-i]);
			str[str.length-1-i]=(char) (str[i]^str[str.length-1-i]);
			str[i]=(char) (str[i]^str[str.length-1-i]);
		}
		System.out.println(str);
	}
}
