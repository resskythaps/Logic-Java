package logic_1.hari1.siang;

import java.util.Scanner;

public class Lingkaran {
	public static double phi = 3.14;
	
	public double hitungKel(double phi, double r) {
		double kel = 2 * phi * r;
		return kel;
	}
	
	public void cetakHasil(double result) {
		System.out.println("Keliling Lingkaran: " + result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Lingkaran lk = new Lingkaran();
		
		System.out.println("Masukkan jari-jari");
		double r = in.nextDouble();
		double kel = lk.hitungKel(phi, r);
		lk.cetakHasil(kel);
	}

}
