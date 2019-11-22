package logic_1.hari4.pagi;

import java.util.Scanner;

public class CharManipulation {

	public void fbWard(char[] za, int a) {
		CharManipulation cm = new CharManipulation();
		
		
		char ch = 'a';
		String res = "";
		int aa = 0;
		za = res.toCharArray();
		while (aa<a) {
			res = ch+"";
			ch++;
			aa++;
			System.out.print(res+" ");
			
		}
		System.out.println();
		for (int i = 0; i < a; i++) {
			ch--;
			System.out.print(ch+" ");
		}	
	}
	
	public void print(int n, String word) {
		char ch = 'a';
		String[] arrword = word.split("");
		for (int i = 0; i < n; i++) {
			System.out.println("["+arrword[i].toUpperCase()+"]"+ch+" ");
			ch++;
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			ch--;
			System.out.println("["+arrword[i].toUpperCase()+"]"+ch+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharManipulation cm = new CharManipulation();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Mau ngerjain apa? (ForBack Alphabet(1)/Cetak Index Kata(2))");
		int menu = in.nextInt();
		if (menu == 1) {
			System.out.print("Masukkan berapa huruf: ");
			int hrf = in.nextInt();
			cm.fbWard(null,hrf);
		}else if(menu == 2) {
			System.out.println("Masukkan kata: ");
			String word = in.nextLine();
			int n = word.length();
			cm.print(n,word);
		}
		

	}

}
