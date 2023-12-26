package daiyan.in;

import java.util.Scanner;

public class ReverseWord {
	public static String reverseSentence(String input) {
		if(input==null || input.isEmpty()) {
			return input;
		}
		String word[] = input.trim().split("\\s+");
		StringBuilder Rsentence = new StringBuilder();
		for(int i=word.length-1;i>=0;i--) {
			Rsentence.append(word[i]);
			if(i>0) {
				Rsentence.append(" ");
			}
		}
		return Rsentence.toString();
	}
	public static void main(String[] args) {
		System.out.println("Enter sentence");
		Scanner s = new Scanner(System.in);
		String sentence = s.nextLine();
		String word = reverseSentence(sentence);
		System.out.println(word);
	}

}
