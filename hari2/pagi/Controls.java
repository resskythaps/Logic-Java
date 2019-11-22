package logic_1.hari2.pagi;

public class Controls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("===========================================");
		System.out.println("If Statement");
		int n = 10; //(=) mengisi variable
		String a = "aaa";
		
		if (n == 10) { //(==) membandingkan nilai
			System.out.println("Checked");
		}
		
		if (n >= 1 && n <= 9) { // && itu operator "AND" apabila salah satu kondisinya salah. maka hasilnya salah.
			System.out.println("Checked");
		}
		
		if (a == "aaa") { //tidak dianjurkan
			System.out.println("Checked");
		}
		
		if (a.equals("aaa")) { //lebih baik pakai ini.
			System.out.println("Checked");
		}
		
		System.out.println("===========================================");
		System.out.println("If else");
		
		int aa = 3;
		if (aa <= 5) {
			System.out.println("Checked");
		} else if(aa >= 5) {
			System.out.println("Checked");
		} else {
			System.out.println("Unchecked");
		}
		
		System.out.println("===========================================");
		System.out.println("Ternary Operator");
		
		String gender = "true";
		String jk = (gender.equals("true")? "Perempuan" : "Laki-laki");
		
		System.out.println("Jenis Kelamin: "+jk);
		
		System.out.println("===========================================");
		System.out.println("Switch Statement");
		int month = 3;
		
		switch (month) {
		case 1:
			System.out.println("Januari");
			break;
		case 2:
			System.out.println("Februari");
			break;
		case 3:
			System.out.println("Maret");
			break;
		case 4:
			System.out.println("April");
			break;
		default:
			break;
		}
	}

}