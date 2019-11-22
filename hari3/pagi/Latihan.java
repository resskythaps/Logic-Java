package logic_1.hari3.pagi;

import java.util.Scanner;

public class Latihan {

	public int kaloriMkn(String mkn) {
		int kal_mk = 0;
		
		if (mkn.equalsIgnoreCase("mie")) {
			kal_mk = 200;
		} else if(mkn.equalsIgnoreCase("pizza")) {
			kal_mk = 300;
		} else if(mkn.equalsIgnoreCase("siomay")) {
			kal_mk = 400;
		} else if(mkn.equalsIgnoreCase("nasi")) {
			kal_mk = 500;
		}
		return kal_mk;
	}
	
	public int kaloriMnm(String mnm) {
		int kal_mnm = 0;
		
		if(mnm.equalsIgnoreCase("aqua")) {
			kal_mnm = 10;
		} else if(mnm.equalsIgnoreCase("softdrink")||(mnm.equalsIgnoreCase("soft"))) {
			kal_mnm = 150;
		} else if(mnm.equalsIgnoreCase("jus")) {
			kal_mnm = 250;
		}
		return kal_mnm;
	}
	
	public int totalKal(int mkn, int mnm) {
		int total=0;
		total = mkn + mnm;
		return total;
	}
	
	public String olhrg(int kal) {
		String or = "";
		if (kal<500) {
			or = "Renang";
		} else if(kal>=500 && kal<670) {
			or = "Tennis";
		} else if(kal >670 ) {
			or = "Lari";
		}
		return or;
	}
	
	public int waktuOr(int totalKal) {
		int time=0;
		time = totalKal/10;
		return time;
	}
	
	//1 2 2 3 3 3 4 4 4 5 5 5 5 5
	public void deret1(int a) {
		
		for (int i = 1; i <= a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" "+i);
			}
		}
		
	}
	//1 3 3 3 5 5 5 5 5
	public void deret2(int deret) {
		for(int i = 1;i<=deret;i++) {
			for(int j = 0; j<i;j++) {
				if (i % 2 != 0) {
					System.out.print(i+" ");
				}	
			}
		}
	}
	
	public void deret3(int deret) {
		for(int i = 1; i<= deret; i++) {
			for(int j = 0; j < i; j++) {
				if (i % 2 == 0) {
					System.out.print(i+" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Latihan lt = new Latihan();
		Scanner in = new Scanner(System.in);
		System.out.println("Mau kerjain yg mana ? (1.Sehat/2.Deret)");
		int menu = in.nextInt();
		if (menu == 1) {
			System.out.println("Masukkan Makanan:");
			String mkn = in.next();
			String mnm = in.next();
			System.out.println("Jumlah Kalori:");
			int kalmkn = lt.kaloriMkn(mkn);
			System.out.println("Makanan: " + kalmkn);
			int kalmnm = lt.kaloriMnm(mnm);
			System.out.println("Minuman: " + kalmnm);
			int total = kalmkn + kalmnm;
			System.out.println("Total Kalori: " + total);
			String or = lt.olhrg(total);
			System.out.println("Olahraga: " + or);
			System.out.println("Waktu :" + lt.waktuOr(total) + " menit");
		} else {
			System.out.println("Soal Nomor berapa? (1/2/3)");
			int soalD = in.nextInt();
			if (soalD == 1) {
				System.out.println("Masukkan banyak deret: ");
				int d1 = in.nextInt();
				lt.deret1(d1);
			} else if(soalD == 2) {
				System.out.println("Masukkan banyak deret: ");
				int d2 = in.nextInt();
				lt.deret2(d2);
			} else if(soalD == 3) {
				System.out.println("Masukkan banyak deret: ");
				int d3 = in.nextInt();
				lt.deret3(d3);
			}
		}
		
	}

}
