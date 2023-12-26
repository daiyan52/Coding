package TCS.in;
import java.util.Scanner;
public class WordIsKey {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter keyword");
		String[] str = {"break", "case", "continue", "default", "defer", 
				"else", "for", "func", "goto", "if", "map", "range",
				"return", "struct", "type", "var"};
		String input = s.nextLine();
		int flag=0;
		for(int i=0;i<str.length;i++) {
			if(str[i].equals(input)) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println(input+" is a ketword");
		}
		else {
			System.out.println(input+" is not a keyword");
		}
	}
}
