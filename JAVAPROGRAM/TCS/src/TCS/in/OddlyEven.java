package TCS.in;
import java.util.Scanner;
public class OddlyEven {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		String str = s.nextLine();
		int s1=0,s2=0;
		for(int i=0;i<str.length();i++) {
			char ele =  str.charAt(i);
			int num = ele -'0';
			if((i+1)%2==0) {
				s1 = s1 + num;
			}
			else if((i+1)%2==1){
				s2 = s2 + num;
			}
		}
		System.out.println(Math.abs(s2-s1));
	}
}
