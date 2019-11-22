package logic_1.hari2.pagi;

import java.util.Scanner;

public class Bilangan {
	
	public String bilgage(int bil) {
		String hasil = "";
		if (bil % 2 == 0) {
			hasil = "Bilangan Genap";
			//System.out.println(bil + " adalah Bilangan Genap");
		}else if(bil % 2 != 0) {
			hasil = "Bilangan Ganjil";
			//System.out.println(bil + " adalah Bilangan Ganjil");
		} else {
			System.out.println("Oops");
		}
		return hasil;
	}
	
	public void print(int angka, String result) {
		System.out.println(angka + " adalah " + result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Bilangan b = new Bilangan();
		
		System.out.print("Masukkan bilangan :");
		int bil1 = in.nextInt();
		System.out.println();
		String result = b.bilgage(bil1);
		b.print(bil1, result);
		
		/*
		if (bil1 % 2 != 0) {
			System.out.println(bil1 + " adalah Bilangan ganjil");
		} else {
			System.out.println(bil1 + " Bukan Bilangan ganjil");
		}
		
		if (bil1 % 2 == 0) {
			System.out.println(bil1 + " adalah Bilangan genap");
		} else {
			System.out.println(bil1 + " Bukan Bilangan genap");
		}*/

	}

}
