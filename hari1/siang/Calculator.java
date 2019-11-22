package logic_1.hari1.siang;
import java.util.Scanner;

public class Calculator {
	
	static Scanner in = new Scanner(System.in);
	
	
	public void add() {
		System.out.println("Masukkan angka");
		System.out.println("Masukkan angka ke-1:");
		int a = in.nextInt();
		System.out.println("Masukkan angka ke-2:");
		int b = in.nextInt();
		int result = a+b;
		System.out.println("Hasil:" +result);
	}
	
	public void min() {
		System.out.println("Masukkan angka");
		System.out.println("Masukkan angka ke-1:");
		int a = in.nextInt();
		System.out.println("Masukkan angka ke-2:");
		int b = in.nextInt();
		int result = a-b;
		System.out.println("Hasil:" +result);
	}
	
	public void x() {
		System.out.println("Masukkan angka");
		System.out.println("Masukkan angka ke-1:");
		int a = in.nextInt();
		System.out.println("Masukkan angka ke-2:");
		int b = in.nextInt();
		int result = a*b;
		System.out.println("Hasil:" +result);
	}
	
	public void div() {
		System.out.println("Masukkan angka");
		System.out.println("Masukkan angka ke-1:");
		int a = in.nextInt();
		System.out.println("Masukkan angka ke-2:");
		int b = in.nextInt();
		float result = a/b;
		System.out.println("Hasil:" +result);
	}
	
	public void pow() {
		System.out.println("Masukkan angka");
		System.out.println("Masukkan angka ke-1:");
		int a = in.nextInt();
		System.out.println("Masukkan angka ke-2:");
		int b = in.nextInt();
		double result = Math.pow(a, b);
		System.out.println("Hasil: "+result);
	}
	
	public void minmax() {
		System.out.println("Masukkan angka");
		System.out.println("Masukkan angka ke-1:");
		int a = in.nextInt();
		System.out.println("Masukkan angka ke-2:");
		int b = in.nextInt();
		int result1 = Math.min(a, b);
		int result2 = Math.max(a, b);
		System.out.println("Hasil Min: "+result1);
		System.out.println("Hasil Max: "+result2);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calcu = new Calculator();
		
		System.out.println("calculator");
		System.out.print("Choose the operation:");
		int op = in.nextInt();
		System.out.println();
		
		if (op == 1) {
			calcu.add();
		} else if(op == 2) {
			calcu.min();
		} else if(op == 3) {
			calcu.x();
		} else if(op == 4) {
			calcu.div();
		}else if(op == 5) {
			calcu.pow();
		}else if(op == 6) {
			calcu.minmax();
		}else {
			System.exit(0);
		}
	}
	
	

}
