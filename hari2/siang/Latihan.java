package logic_1.hari2.siang;

import java.util.Scanner;

import logic_1.hari2.pagi.LatihanSoal;

public class Latihan {
	
	public String beliBaju(int uang) {
		String beli = "";
		if (uang >= 750000) {
			beli = "Jas";
		} else if(uang >= 350000) {
			beli = "Celana Panjang";
		} else if(uang >= 225000) {
			beli = "Kemeja";
		} else if(uang >= 100000) {
			beli = "Kaos";
		} else if(uang >= 50000) {
			beli = "Celana Pendek";
		} else if(uang < 50000) {
			beli = "Ga ada";
		}
		return beli;
	}

	
	public void print(String hasil) {
		System.out.println("Barang : "+hasil);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Latihan lt = new Latihan();
		
		int totbar = 0;
		System.out.println("Masukkan dana: ");
		int dana = in.nextInt();
		while(dana >= 50000) {
			String barang = lt.beliBaju(dana);
			lt.print(barang);
			if (barang.equalsIgnoreCase("jas")){
				dana = dana - 750000;
			}else if(barang.equalsIgnoreCase("Celana panjang")) {
				dana = dana - 350000;
			}else if(barang.equalsIgnoreCase("kemeja")) {
				dana = dana - 225000;
			}else if(barang.equalsIgnoreCase("kaos")) {
				dana = dana - 100000;
			}else if(barang.equalsIgnoreCase("celana pendek")) {
				dana = dana - 50000;
			}
			totbar = totbar +1;			
		}
		System.out.println("Sisa uang: "+dana);
		System.out.println("Total barang : "+totbar );

	}

}
