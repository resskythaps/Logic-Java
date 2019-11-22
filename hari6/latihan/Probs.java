package logic_1.hari6.latihan;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Probs {

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("1/2");
		int menu = in.nextInt();
		if (menu == 1) {
			float hm = 0;
			float l =  3700;
			float kf = 24800;
			float kfl_b = kf+5000;
			float lhm = l+2000+hm;
			double kvl = 3.7;
			double lkf = 24.8;
			double kfl = lkf + 5.0;
			double lkv = kvl+2.0;
			double total_km = kvl+lkf+kfl+lkv;
			float travel = hm + l + kf + (kfl_b+lhm); 
			int km = 1000;
			int liter = 3500;
			System.out.println(kfl);
			System.out.println(lkv);
			//System.out.println(total_km + "Km");
			String tkvl_d = "06:00:00";
			String tkvl_a = "07:10:00";
			String tlkf_d = "07:25:00";
			String tlkf_a = "08:25:00"; 
			String tkfl_d = "15:25:00";
			String tkfl_a = "17:50:00";
			String tlkv_d = "18:00:00";
			String tlkv_a = "19:17:00";
			
			SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
			Date time1_kvl = format.parse(tkvl_d);
			Date time2_kvl = format.parse(tkvl_a);
			long diff = time2_kvl.getTime() - time1_kvl.getTime();
			int diff_h = (int) Math.floor(diff / 3600000);
			int diff_m = (int) Math.floor((diff - diff_h * 3600000) / 60000);
			diff = TimeUnit.MILLISECONDS.toMinutes(diff);
			System.out.println("Difference Kemang Village to Langsat : \t "+ diff+" minutes");
			System.out.format("Difference Kemang Village to Langsat : \t %d hours, %d minutes", diff_h, diff_m);
			System.out.println();
			
			Date time1_lkf = format.parse(tlkf_d);
			Date time2_lkf = format.parse(tlkf_a);
			long diff2 = time2_lkf.getTime() - time1_lkf.getTime();
			int diff2_h = (int) Math.floor(diff2 / 3600000);
			int diff2_m = (int) Math.floor((diff2 - diff2_h * 3600000) / 60000);
			diff2 = TimeUnit.MILLISECONDS.toMinutes(diff2);
			System.out.println("Difference Langsat to Kalbe Farma : \t "+ diff2+" minutes");
			System.out.format("Difference Langsat to Kalbe Farma : \t %d hours, %d minutes", diff2_h, diff2_m);
			System.out.println();
			
			Date time1_kfl = format.parse(tkfl_d);
			Date time2_kfl = format.parse(tkfl_a);
			long diff3 = time2_kfl.getTime() - time1_kfl.getTime();
			int diff3_h = (int) Math.floor(diff3 / 3600000);
			int diff3_m = (int) Math.floor((diff3 - diff3_h * 3600000) / 60000);
			diff3 = TimeUnit.MILLISECONDS.toMinutes(diff3);
			System.out.println("Difference Kalbe Farma to Langsat: \t "+ diff3+ " minutes");
			System.out.format("Difference Kalbe Farma to Langsat : \t %d hours, %d minutes", diff3_h, diff3_m);
			System.out.println();
			
			Date time1_lkv = format.parse(tlkv_d);
			Date time2_lkv = format.parse(tlkv_a);
			long diff4 = time2_lkv.getTime() - time1_lkv.getTime();
			int diff4_h = (int) Math.floor(diff4 / 3600000);
			int diff4_m = (int) Math.floor((diff4 - diff4_h * 3600000) / 60000);
			diff4 = TimeUnit.MILLISECONDS.toMinutes(diff4);
			System.out.println("Difference Langsat to Kemang Village: \t "+ diff4 + " minutes");
			System.out.format("Difference Langsat to Kemang Village: \t %d hours, %d minutes", diff4_h, diff4_m);
			System.out.println();
			
			int totaltime_h = diff_h + diff2_h + diff3_h + diff4_h;
			int totaltime_m = diff_m + diff2_m + diff3_m + diff4_m;
			System.out.format("Total time 1 day: %d hours %d minutes and The Distances are %.2f Km ", totaltime_h, totaltime_m, total_km );
			System.out.println();
			System.out.println("Total Distance: " + travel/km + "km");
			float toLiter = travel / liter;
			System.out.printf("Liter needed: %.2f liter", toLiter );
			
		}else {
			System.out.print("Masukkan harga Baju \t:");
			int hbaju = in.nextInt();
			System.out.print("Masukkan harga Celana \t:");
			int hcelana = in.nextInt();
			System.out.println("Masukkan % diskon masing-masing pembayaran:");
			System.out.print("Pembayaran via GO\t: ");
			int godisc = in.nextInt();
			System.out.print("Pembayaran via OVO\t: ");
			int ovodisc = in.nextInt();
			System.out.println("Discount Pembayaran via  GO: " + godisc);
			System.out.println("Discount Pembayaran via OVO: "+ ovodisc);
			System.out.println("Barang beli:");
			System.out.println("Baju \t Rp. "+hbaju);
			System.out.println("Celana \t Rp. "+hcelana);
			int totalxd = hbaju + hcelana;
			System.out.println("Total Harga (exc.Disc): \t Rp."+ totalxd);
			int totalid_go = totalxd - (totalxd * godisc)/100;
			int totalid_ovo = totalxd - (totalxd * ovodisc)/100;
			System.out.println("Harga After Discount via Go: \t Rp. "+totalid_go);
			System.out.println("Harga After Discount via OVO: \t Rp. "+totalid_ovo);
		}

	}

}
