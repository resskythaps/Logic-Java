package logic_1.hari2.pagi;

import java.util.Scanner;

public class LatihanSoal {

	public String aDay(int day) {
		String nameDay = "";
		switch (day) {
		case 1:
			nameDay = "Senin";
			break;
		case 2:
			nameDay = "Selasa";
			break;
		case 3:
			nameDay = "Rabu";
			break;
		case 4:
			nameDay = "Kamis";
			break;
		case 5:
			nameDay = "Jumat";
			break;
		case 6:
			nameDay = "Sabtu";
			break;
		case 7:
			nameDay = "Minggu";
			break;
		default:
			break;
		}
		return nameDay;
	}
	
	public void printoutDay(int day, String hasil) {
		System.out.println("Hari ke- " + day + " adalah hari " + hasil);
	}
	
	public int tunjangan(int tjg) {
		tjg = 1;
		tjg = (tjg ==1 )? 35000:20000;
		return tjg;
	}
	
	public void cetakGaji(int tjg, int bonus, int gaji, int total) {
		LatihanSoal ls = new LatihanSoal();
		System.out.println("Tunjangan : " + ls.tunjangan(tjg));
		System.out.println("Bonus : " + ls.bonus(bonus));
		System.out.println("Gaji Pokok: " + ls.gaji(gaji));
		System.out.println("Total Gaji: " + ls.totalGaji(tjg, bonus, gaji) );
	}
	
	public int bonus(int bns) {
		int bonus = 0;
		if (bns == 1) {
			bonus = 150000;
		} else if(bns == 2) {
			bonus = 175000;
		} else if(bns == 3) {
			bonus = 200000;
		}
		return bonus;
	}
	
	public int gaji(int gj) {
		int gaji = 0;
		String gol = "";
		if (gj == 1) {
			gaji = 1000000;
			gol = "Gol 1";
		} else if(gj == 2) {
			gaji = 1500000;
			gol = "Gol 2";
		} else if (gj == 3) {
			gaji = 2000000;
			gol = "Gol 3";
		}
		return gaji;
	}
	
	public static int totalGaji(int tjg, int bonus, int gj) {
		LatihanSoal ls = new LatihanSoal();
		int total = 0;
		total = ls.tunjangan(tjg) + ls.bonus(bonus) + ls.gaji(gj);
		return total;
	}
	
	public String musimhari(String msm, String hari) {
		String jadi = "";
		if (msm.equalsIgnoreCase("hujan") && hari.equalsIgnoreCase("libur")) {
			jadi = "rehat di rumah";
		} else if(msm.equalsIgnoreCase("hujan") && hari.equalsIgnoreCase("kerja")) {
			jadi = "pasrah saja.";
		} else if(msm.equalsIgnoreCase("panas") && hari.equalsIgnoreCase("libur")) {
			jadi = "hangout bareng temen.";
		} else if(msm.equalsIgnoreCase("panas") && hari.equalsIgnoreCase("kerja")) {
			jadi = "semangat45.";
		} else {
			jadi = "oops mau ngapain ?";
		}
		return jadi;
	}
	
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
		/*switch (uang) {
		case 750000:
			beli = "Jas";
			break;
		case 350000:
			beli = "Celana Panjang";
			break;
		case 225000:
			beli = "Kemeja";
			break;
		case 100000:
			beli = "Kaos Bola";
			break;
		case 50000:
			beli = "Kaos Biasa";
			break;
		default:
			beli = "Ga ada";
			break;
		}*/
		return beli;
	}
	public void cetakBeBa(int uang) {
		LatihanSoal ls = new LatihanSoal();
		System.out.println(ls.beliBaju(uang));
	}
	
	public String gage(int angka) {
		String res = "";
		if (angka >=1 && angka <=100) {
			if (angka % 2 != 0) {
				res = "Normal";
			} else if(angka % 2 == 0){
				if (angka >= 2 && angka <= 5) {
					res = "Tidak Normal";
				} else if(angka >= 6 && angka <= 20) {
					res = "Normal";
				} else if(angka > 20) {
					res = "Tidak Normal";
				}
			}
		} else {
			res = "Hanya angka diantara 1 sampai 100";
		}
		return res;
	}
	public void cetakGage(int angka, String hasil) {
		LatihanSoal ls = new LatihanSoal();
		System.out.println(hasil);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		LatihanSoal ls = new LatihanSoal();
		
		System.out.print("Pilih Soal: ");
		int soal = in.nextInt();

		if (soal == 1) {
			System.out.println("-----------------------------");
			System.out.println("Soal 1 - Nama Hari");
			System.out.print("Masukkan urutan hari: ");
			int day = in.nextInt();
			
			String hasil = ls.aDay(day);
			ls.printoutDay(day, hasil);
		} else if(soal == 2) {
			System.out.println("-----------------------------");
			System.out.println("Soal 2- Hitung Gaji");
			System.out.println();
			System.out.println("Masukkan Tunjangan: ");
			System.out.println("1. Nikah");
			System.out.println("2. Single");
			System.out.print("-> ");int tjg = in.nextInt();
			System.out.println(ls.tunjangan(tjg));
			System.out.println("Masukkan Bonus: ");
			System.out.println("1.Gol1 : 150.000");
			System.out.println("2.Gol2 : 175.000");
			System.out.println("3.Gol3 : 200.000");
			System.out.print("-> ");int bns = in.nextInt();
			System.out.println(ls.bonus(bns));
			System.out.println("Masukkan Gaji Pokok: ");
			System.out.println("1.Gol1 : 1.000.000");
			System.out.println("2.Gol2 : 1.500.000");
			System.out.println("3.Gol3 : 2.000.000");
			System.out.print("-> ");int gp = in.nextInt();
			System.out.println(ls.gaji(gp));
			System.out.println("Rincian: ");
			int total = totalGaji(tjg, bns, gp);
			ls.cetakGaji(tjg, bns, gp, total);
		} else if(soal == 3) {
			System.out.println("Tentukan hari ini kamu ingin lakukan apa menurut Musim dan Hari!");
			System.out.println("Musim (Hujan/Panas) :");
			String msm = in.next();
			System.out.println("Hari (Libur/Kerja) :");
			String hari = in.next();
			String jadi = ls.musimhari(msm, hari);
			System.out.println("Jadi saya akan: " + jadi);
		} else if(soal == 4) {
			System.out.println("Kamu ada uang berapa ?");
			int uang = in.nextInt();
			String beli = ls.beliBaju(uang);
			System.out.println("Kamu bisa beli "+beli);
			
		} else if(soal == 5) {
			System.out.println("Ganjil Genap (Normal/Tidak) ?");
			System.out.print("Masukkan angka :");
			int angka = in.nextInt();
			String hasil = ls.gage(angka);
			ls.cetakGage(angka, hasil);
		} else {
			System.out.println("Baru ada soal 1-5");
		}
		
		
	}

}
