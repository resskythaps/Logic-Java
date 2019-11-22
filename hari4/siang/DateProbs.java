package logic_1.hari4.siang;

import java.lang.invoke.SwitchPoint;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DateProbs {
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		DateProbs dp = new DateProbs();
		Scanner in = new Scanner(System.in);

		System.out.println("Masukkan total buku baca:");
		int rb = in.nextInt();
		System.out.println("Masukkan total novel:");
		int nv = in.nextInt();
		System.out.println("Masukkan total Skripsi: ");
		int th = in.nextInt();
		in.nextLine();
		System.out.println("Masukkan tanggal jatuh tempo pengembalian: ");
		String dayB = in.nextLine();
		System.out.println("Masukkan tanggal pengembalian: ");
		String dayR = in.nextLine();
		System.out.println(dayB);
		System.out.println(dayR);
		long diff = dp.getDiff(dayB, dayR);
		//System.out.println(diff);
		System.out.println(calDenda(rb,nv,th,(int) diff));
		
		//dp.calDenda(rb, nv, th,dayB, dayR);
	}

	public long getDiff(String dayB, String dayR) throws ParseException {
		long diff = 0;
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		Date dayP = (Date) f.parse(dayB);
		Date dayT = (Date) f.parse(dayR);
		diff = dayT.getTime() - dayP.getTime();
		diff = TimeUnit.MILLISECONDS.toDays(diff);
		return diff;
	}
	
	public static int calDenda(int rb, int nv, int th, int diff) {
		int arb = 0,anv=0,ath=0;
		int denda=0;
		int day = diff-10;
		if(day>0) {
			if (rb>0) {
				arb = 2000*rb*day;
			} else if(nv>0) {
				anv = 5000*nv*day;
			} else if(th>0) {
				ath = 10000*th*day;
			}
		}
		denda = arb+anv+ath;
		return denda;
	}
	

	/*
	public long calDenda(int rb, int nv, int th, String dayB, String dayR) throws ParseException {
		DateProbs dp = new DateProbs();
//		String dayB = "", dayR = "";
		long diff = dp.getDiff(dayB, dayR);
		String brg = "";
		long dendabk = 0, dendanv = 0, dendath = 0;
		long denda = 0;
		
		switch (brg) {
		case "buku":
			dendabk = 2000;
			break;
		case "novel":
			dendanv = 5000;
			break;
		case "skripsi":
			dendath = 10000;
			break;
		default:
			break;
		}
		
		long day = diff-10;
		
		if (day>0) {
			if (rb!= 0) {
				denda = day * dendabk;
			}else if(nv!=0) {
				denda = day * dendanv;
			}else if(th!=0) {
				denda = day*dendath;
			}
		}

		denda = denda *diff;
		System.out.println("Total Denda: " + denda);
		return denda;
	}*/
	
	

	

}
