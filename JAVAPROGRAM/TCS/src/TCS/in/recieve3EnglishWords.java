package TCS.in;
import java.util.Scanner;
public class recieve3EnglishWords {
	public static void main(String[] args) {
		System.out.println("Enter three word");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		String s3 = s.nextLine();
		s3 = s3.toUpperCase();
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();
		for(int i=0;i<str1.length;i++) {
			if(str1[i]=='A'||str1[i]=='E'||str1[i]=='I'||str1[i]=='O'||str1[i]=='U'
					||str1[i]=='a'||str1[i]=='e'||str1[i]=='i'||str1[i]=='o'
					||str1[i]=='u') {
				str1[i]='*';
			}
		}
		for(int i=0;i<str2.length;i++) {
			if((str2[i]>='A' && str2[i]<='Z') || (str2[i]>='a' && str2[i]<='z')) {
				if(str2[i]=='A'||str2[i]=='E'||str2[i]=='I'||str2[i]=='O'||str2[i]=='U'
						||str2[i]=='a'||str2[i]=='e'||str2[i]=='i'||str2[i]=='o'
						||str2[i]=='u') {
					continue;
				}
				else {
					str2[i]='@';
				}
			}
		}
		System.out.print(str1);
		System.out.print(str2);
		System.out.print(s3);

	}
}
