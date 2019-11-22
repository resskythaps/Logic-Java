package logic_1.hari1.siang;

import java.util.Scanner;

public class Calculator2 {

	public double add(double a, int b) {
		return a+b;
	}
	public double kurang(int a, int b) {
		return a-b;
	}
	public double multi(int a,int b) {
		return a*b;
	}
	public double div(int a, int b) {
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		Calculator2 cal2 = new Calculator2();
		System.out.println("Masukkan angka 1: ");
		int a1 = in.nextInt();
		System.out.println("Masukkan angka 2: ");
		int a2 = in.nextInt();
		System.out.println();
		System.out.println("Hasil tambah: "+ cal2.add(a1,a2));
		System.out.println("Hasil kurang: "+ cal2.kurang(a1,a2));
		System.out.println("Hasil kali: "+ cal2.multi(a1, a2));
		System.out.println("Hasil bagi: "+ cal2.div(a1,a2));
		
		
		
	}

}
