package daiyan.com.in;

import java.util.Scanner;

/*
import java.util.HashMap;
import java.util.Map;

public class CharCount {
	public static void main(String[] args) {
		String s ="check whether the hashmap contains the";
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch==' ') {
				continue;
			}
			else if(map.containsKey(ch)) {
				int count = map.get(ch);
				map.put(ch,count+1);
			}
			else {
				map.put(ch,1);
			}
		}
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
	}
}
*/

public class CharCount{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string");
		String str = s.nextLine();
		int[] freq = new int[str.length()];
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++){
			freq[i] = 1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					freq[i]++;
					ch[j]='0';
				}
			}
		}
		for(int i=0;i<freq.length;i++)
		{
			if(ch[i]!=' ' && ch[i]!='0') {
				System.out.println(ch[i]+"  "+freq[i]);
			}
		}
	}
}
