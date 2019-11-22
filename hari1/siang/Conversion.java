package logic_1.hari1.siang;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		System.out.println("Masukkan kata: ");
		String text = read.next();
		
		//dari string ke integer
		int nilai = Integer.parseInt(text);
		
		System.out.println("Nilai "+ nilai);
		
	}

}
