package logic_1.hari4.siang;

import java.util.Scanner;

public class Latihan {

	/**
	 * Resskytha Permata Sari
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Latihan l4 = new Latihan();
		Scanner in = new Scanner(System.in);
		System.out.println("Mau kerjain yg mana? (1.Keranjang/2.Bensin)");
		int menu = in.nextInt();
		if (menu == 1) {
			l4.krjg();
		} else {
			System.out.println("Mau yg biasa atau pakai array? (1/2)");
			int m = in.nextInt();
			if (m == 1) {
				l4.distance1();
				
			} else {
				String path = "toko tempat1 tempat2";
			}

		}

	}
	
	public int krjg() {
		
		int k1 = 5;
		int k2 = 6;
		int k3 = 0;
		int total = 0;

		String ambil = "k3";

		if (ambil.equals("k1")) {
			total = k2 + k3;
		} else if (ambil.equals("k2")) {
			total = k1 + k3;
		} else if (ambil.equals("k3")) {
			total = k1 + k2;
		}
		System.out.println("Jumlah buah:" +total);
		
		return total;
	}
	
	public double distance1() {
		int t1 = 2000;
		int t2 = 500;
		int t3 = 1500;
		int t4 = 2500;

		int liter = 2500;
		int km = 1000;
		// kasus di contoh soal
		int toTravel = t1 + t2 + (t2 + t1);
		System.out.println("Jumlah Jarak: " + toTravel / km + "km");
		float toLiter = toTravel / liter;
		System.out.println("Liter yang dihabiskan untuk jarak " + toTravel / km + "km: " + toLiter + " liter");
		return toLiter;
	}
	
	public double distance2(String path) {
		int t0 = 0;
		int t1 = 2000;
		int t2 = 500;
		int t3 = 1500;
		int t4 = 2500;
		double dist=0;
		String[] pPath = path.split(" ");
		switch (pPath[pPath.length-1]) {
		case "toko":
			dist = 0;
			break;
		case "tempat1":
			dist = t0+t1;
			break;
		case "tempat2":
			dist = t0+t1+t2;
			break;
		case "tempat3":
			dist = t0+t1+t2+t3;
			break;
		case "tempat4":
			dist = t0+t1+t2+t3+t4;
			break;
		default:
			break;
		}
		dist = dist*2;
		return 0;
	}
}
