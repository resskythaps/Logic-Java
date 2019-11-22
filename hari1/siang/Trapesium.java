package logic_1.hari1.siang;

import java.util.Scanner;

public class Trapesium {
	
	public double hitungLuas(double a, double b, double t) {
		double luas = ((a+b) *t)/2;
		return luas;
	}
	
	public void cetakLuas(double luas) {
		System.out.println("Luas Trapesium: "+ luas);
	}
	
	public double hitungTinggi(double a, double b, double l) {
		double tinggi = (2*l)/(a+b);
		return tinggi;
	}
	public void cetakTinggi(double tinggi) {
		System.out.println("Tinggi Trapesium: "+tinggi);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		Trapesium tp = new Trapesium();
		System.out.println("Trap e siuum hoho");
		System.out.println("Masukkan nilai A: ");
		double a = in.nextDouble();
		System.out.println("Masukkan nilai B: ");
		double b = in.nextDouble();
		
		System.out.println("Mau hitung apa?");
		System.out.println("1. Luas Trapesium");
		System.out.println("2. Tinggi Trapesium");
		int proc = in.nextInt();
		
		if (proc == 1) {
			System.out.println("Masukkan nilai T(Tinggi): ");
			double t = in.nextDouble();
			double luas =  tp.hitungLuas(a,b,t);
			tp.cetakLuas(luas);
		} else if(proc == 2) {
			System.out.println("Masukkan Luas: ");
			double l = in.nextDouble();
			double tinggi = tp.hitungTinggi(a, b, l);
			tp.cetakTinggi(tinggi);
		}else {
			System.exit(0);
		}
		
		
	}

}
