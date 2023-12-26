package daiyan.in;

import java.util.Scanner;

/*
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class CharCount {
	public static void main(String[] args) {
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		System.out.println("Enter a String");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		for(int i=0;i<str.length();i++) {
			char ch =  str.charAt(i);
			if(map.containsKey(ch)) {
				int count = map.get(ch);
				map.put(ch,count+1);
			}
			else {
				map.put(ch,1);
			}
		}
		for(Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
		
	}
}
*/

/*
public class CharCount{
	public static void main(String[] args) {
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int count[] = new int[26];
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			int ch = (int)str.charAt(i);
			count[ch-'a']= count[ch-'a']+1;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]>0) {
				
				System.out.println((char)(i+'a')+" "+count[i]);
			}
		}
	}
}
*/