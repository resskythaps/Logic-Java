package logic_1.hari3.pagi;

import java.util.Scanner;

public class Belajar {

	/*
	 * cari faktorial pakai rekursif
	 */
	public int factorialR(int a) {
		//base casenya dulu
		if(a==0) {
			return 1;
		}
		return a*factorialR(a-1);
	}
	public int factorialI(int a) {
		int res = 1;
		while (a != 0) {
			res = res*a;
			a--;
		}
		return res;
	}
	//forloop
	public void fibo(int a) {
		int x = 1;
		int b = 1;
		System.out.printf("%nFibonacci series of %d numbers are: ",a);
		System.out.printf(" %s ", x);
		System.out.printf(" %s ", b);
		
		for (int i = 2; i < a; i++) {
			int fibo = x+b;
			System.out.printf(" %s ", fibo);
			b=x;
			x=fibo;
		}
	}
	
	public static void fiboSeries(int a) {
		System.out.printf("\nFibonnaci series in Java of number %s using recursion %n", a);
		for (int i = 1; i <= a; i++) {
			System.out.printf(" %s ",getFibo(i));
		}
	}
	//recursive
	public static int getFibo(int n) {
		if (n==1) {
			return 1;
		}
		if (n==2) {
			return 1;
		}
		return getFibo(n-1) + getFibo(n-2);
	}
	
	public String evenOdd(int a) {
		String res = "";
		if (a % 2 == 0) {
			res = "Even";
		} else {
			res = "Odd";
		}
		return res;
	}
	
	public boolean primeNumber(int a) {
		//String res = "";
		for(int i = 2; i < a; i++) {
			boolean prime = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					prime = false;
					
					break;
				}
			}
			if (prime==true) {
				System.out.println(i+" Prime Number");
			}else {
				System.out.println(i+ " Not Prime Number");
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Belajar b = new Belajar();
		
		System.out.println("Mau nyari apa ?");
		System.out.println("1. Faktorial");
		System.out.println("2. Fibonaci");
		System.out.println("3. EvenOdd");
		System.out.println("4. Bil.Prima");
		
		int menu = in.nextInt();
		if (menu == 1) {
			System.out.println("Factorial");
			System.out.println("Masukkan factorial: ");
			int a = in.nextInt();
			System.out.print("Cara rekursif:");
			System.out.println(b.factorialR(a));
			System.out.print("Cara iteratif:");
			System.out.println(b.factorialI(a));
		} else if(menu == 2) {
			System.out.println("Masukkan angka:");
			int f = in.nextInt();
			b.fibo(f);
			b.fiboSeries(f);
		}else if(menu ==3) {
			System.out.println("Masukkan angka: ");
			int g = in.nextInt();
			String result = b.evenOdd(g);
			System.out.println(result + " Number");
		}else if(menu == 4) {
			System.out.println("Masukkan angka(1-100): ");
			int h = in.nextInt();
			System.out.println(b.primeNumber(h));
			
		}
		
		

	}

}
