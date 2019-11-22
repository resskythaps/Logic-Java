package logic_1.hari3.siang;

import java.util.Scanner;

public class LatihanMS {

	public String palindrome(String word) {
		String result="";
		
		for (int i = word.length()-1;i>=0; i--) {
			result += word.charAt(i);
		}
		if (word.equals(result)) {
			System.out.println(word+ " Palindromme");
		}else {
			System.out.println(word+ " Not Palindromme");
		}
		return result;
	}
	
	
	public String splitkata(String word) {
		LatihanMS ms = new LatihanMS();
		String[] a = word.split("\\s+");
		String result3="", result1="", result2="";
		for (int i = 0; i < a.length; i++) {
				result1= a[i].substring(0,1);
				result2= a[i].substring(a[i].length()-1, a[i].length());
				System.out.print(result1);
				for (int j = 0; j < a.length; j++) {
					System.out.print("*");
				}
				System.out.println(result2);
		}
		return result2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		LatihanMS ms = new LatihanMS();
		
		System.out.println("Mau kerjain soal apa? (Palindrome(p)/Pecah Kata(pk)");
		String menu = in.next();
		in.nextLine();
		if(menu.equalsIgnoreCase("p")) {
			System.out.print("Masukkan kata:");
			String word = in.next();
			ms.palindrome(word);
		}else if(menu.equalsIgnoreCase("pk")) {
			System.out.print("Masukkan kalimat: ");
			String word2 = in.nextLine();
			ms.splitkata(word2);
		}
	}

}
