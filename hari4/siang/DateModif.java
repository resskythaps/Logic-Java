package logic_1.hari4.siang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DateModif {

	public long differ(String day1, String day2) throws ParseException {
		long diff = 0;
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date dayA = (Date)format.parse(day1);
		Date dayB = (Date)format.parse(day2);
		diff = dayB.getTime() - dayA.getTime();
		diff = TimeUnit.MILLISECONDS.toDays(diff);
		System.out.println(diff+" days");
		
		return diff;
	}
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		DateModif dm = new DateModif();
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Mau ngapain ? (1.Cek tgl/bulan, 2.Selisih)");
		int menu = in.nextInt();
		if (menu == 1) {
			String ry = "23-03-1993";
			//tentukan formatnya
			SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
			
			//convert dari string ke bentuk date
			Date dt = format.parse(ry);	
			
			//catch the day
			String day = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(dt);
			
			//catch the month
			String month = new SimpleDateFormat("MMMM", Locale.ENGLISH).format(dt);
			
			System.out.println(day+","+month);
			System.out.println(month);
		}else if(menu == 2) {
			System.out.println("Enter day 1: (dd/mm/yyyy)");
			String day1 = in.nextLine();
			System.out.println();
			in.nextLine();
			System.out.println("Enter day 2: (dd/mm/8yyyy)");
			String day2 = in.nextLine();
			System.out.println();
			dm.differ(day1, day2);
			
		}
		
		
	
	}

}
