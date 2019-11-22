package logic_1.hari1.siang;

import java.util.Scanner;

public class Kubus {

	
	public void volumeKubus(int sisi) {
		int result = sisi * sisi * sisi;
		Kubus kb = new Kubus();
		kb.cetakHasilVol(result);
	}
	public void cetakHasilVol(int result) {
		System.out.println(result);
	}
	
	
	public void luasKubus(int sisi) {
		int result = 6 * sisi * sisi;
		Kubus kb = new Kubus();
		kb.cetakHasilLuas(result);
	}
	public void cetakHasilLuas(int result) {
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Kubus kb = new Kubus();
		
		System.out.println("Mau hitung apa?");
		System.out.println("1. Volume Kubus");
		System.out.println("2. Luas Kubus");
		int input = in.nextInt();
		
		if (input == 1) {
			System.out.print("Masukkan sisi kubus: ");
			int vs = in.nextInt();
			kb.volumeKubus(vs);
		} else if(input == 2) {
			System.out.println("Masukkan sisi kubus: ");
			int ls = in.nextInt();
			kb.luasKubus(ls);
			System.out.println();
		}else {
			System.exit(0);
		}
	}
	
	

}
