package logic_1.hari3.siang;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String word = "abcdEfG";
		String word2 = "hahahaha dasar";
		String res = "";
		System.out.println("------------------------");
		System.out.println("Substring");
		//fetch index 1
		res = word.substring(1);
		System.out.println(res);
		//fetch based on index range
		System.out.println(word.substring(1, 4));
		System.out.println("------------------------");
		System.out.println("Replace");
		//replace character/word
		System.out.println(word.replace("ab", "bca"));
		System.out.println("------------------------");
		System.out.println("Length");
		//too get the number of string
		System.out.println(word.length());
		System.out.println("------------------------");
		System.out.println("Chat At");
		// get the character based on index
		System.out.println(word.charAt(3));
		System.out.println("------------------------");
		//split
		String[] SKata = word2.split(" ");
		System.out.println(Arrays.toString(SKata));
		
	}

}
