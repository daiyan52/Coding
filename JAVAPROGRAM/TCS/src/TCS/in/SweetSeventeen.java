package TCS.in;
import java.util.Scanner;
import java.util.HashMap;
public class SweetSeventeen {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String str = s.nextLine();
		long num =0;
		int k=0;
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		map.put('A',10);
		map.put('B',11);
		map.put('C',12);
		map.put('D',13);
		map.put('E',14);
		map.put('F',15);
		map.put('G',16);
		map.put('a',10);
		map.put('b',11);
		map.put('c',12);
		map.put('d',13);
		map.put('e',14);
		map.put('f',15);
		map.put('g',16);
		System.out.println(map.get('A'));
		for(int i=str.length()-1;i>=0;i--) {
			char ch = str.charAt(i);
			if((ch>='A'&&ch<='Z') || (ch>='a'&&ch<='z')) {		 
				System.out.print(k+"  ");
				num = num + map.get(ch)*(int)Math.pow(17,k++);
			}
			else {
				System.out.print(k+"  ");
				num = num + (ch-'0')*(int)Math.pow(17,k++);
			}
		}
		System.out.println(num);
	}
}
