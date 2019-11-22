package logic_1.hari2.siang;

import java.util.Scanner;

public class LatLoop {
	
	public int dgenap(int deret) {
		for (int i = 1; i <= deret; i++) {
			System.out.println(i*2);
		}
		return deret;
	}
	public int dganjil(int deret) {
		int a = 1, b = 3;
		while (a <= deret ) {
			System.out.println(b);
			b=b+2;
			a++;
		}
		return deret;
		/*
		 * for(int i = 1; i<= deret; i++){
		 * System.out.println(i*2-1); */
	}
	
	public int deretiga(int deret) {
		int d = 1, c=0;
		while (c < deret) {
			System.out.println(d);
			d=d+3;
			c++;
		}
		return deret;
	}
	
	//1 5 * 9 13 * 17 21 *
	public int deretC1(int deret) {
		int d =1, c=0;
		while (c < deret) {
			System.out.print(" "+d);
			d=d+4;
			if (c >= 1 && c%2 == 1) {
				System.out.print(" *");
			}
			c++;
		}
		return deret;
	}
	//1 5 * 13 17 * 25 29 *
	public int deretC2(int deret) {
		int d=1, c=0,i=1;
		while (i <= deret) {
			if (c==2) {
				System.out.print(" *");
				c=0;
				d=d+4;
			} else {
				System.out.print(" "+d);
				d=d+4;
				c++;
			}
			i++;
		}
		return deret;
	}
	
	public int deretback(int deret) {
		int i=1, b=0;
		while (i < deret) {
			System.out.println(b);
			b=b-1;
			i++;
		}
		/* cara 2
		 * while (i < deret) {
			System.out.println(i*-1);
			i++;
		}
		*cara 3
		while (i > -deret) {
			System.out.println(i);
			i--;
		} 
		 * */
		return deret;
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LatLoop ll = new LatLoop();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Mau operasi deret apa ? (Genap/Ganjil/Tiga/Custom1/Custom2/Mundur)");
		String menu = in.next();
		if (menu.equalsIgnoreCase("genap")) {
			System.out.println("Deret Genap");
			int i = in.nextInt();
			ll.dgenap(i);
		} else if(menu.equalsIgnoreCase("ganjil")) {
			System.out.println("Deret Ganjil");
			int j = in.nextInt();
			ll.dganjil(j);
		} else if(menu.equalsIgnoreCase("Tiga")) {
			System.out.println("Deret 3");
			int k= in.nextInt();
			ll.deretiga(k);
		} else if(menu.equalsIgnoreCase("c1")) {
			System.out.println("Deret Custom 1");
			int l = in.nextInt();
			ll.deretC1(l);
		} else if(menu.equalsIgnoreCase("c2")) {
			System.out.println("Deret Custom 2");
			int m = in.nextInt();
			ll.deretC2(m);
		}else if(menu.equalsIgnoreCase("b") || (menu.equalsIgnoreCase("mundur"))) {
			System.out.println("Deret Mundur");
			int n = in.nextInt();
			ll.deretback(n);
		}
		
		
		
		
		
		
		
		

	}

}
