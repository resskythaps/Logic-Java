package logic_1.hari3.siang;

import java.util.Scanner;

public class LatSManipulation {

	public void noWhite(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != ' ')count++;
		}
		System.out.println("The length without White Spaces(for): " +count);
	}
	
	public void vocCon(String word) {
		int countvoc=0;
		int countcon=0;
		word = word.replace(" ", "").toLowerCase();
		for (int i = 0; i < word.length(); i++) {
			if ((word.charAt(i) == 'a') || (word.charAt(i) == 'i') || (word.charAt(i) == 'u') || (word.charAt(i) == 'e') || (word.charAt(i) == 'o')) {
				countvoc++;
			}else {
				countcon++;
			}
		}
		System.out.println("Vocal: " + countvoc);
		System.out.println("Consonant: "+ countcon);
		}
	
	public void reverse(String word) {
		char[] a = word.toCharArray();
		
		System.out.println(a);
		for (int i = a.length-1; i >=0; i--) {
			System.out.print(a[i]);
		}
		/*
		 * for(int i = a.length()-1; i>=0; i--){
		 * System.out.print(word.charAt(i));
		 * }
		 */
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LatSManipulation ls = new LatSManipulation();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Masukkan Kata: ");
		String word = in.nextLine();
		System.out.println("Length of words: "+word.length());
		System.out.println("Number of character without White Spaces(replace): " + word.replace(" ", "").length());
		ls.noWhite(word);
		ls.vocCon(word);
		ls.reverse(word);
	}

}
