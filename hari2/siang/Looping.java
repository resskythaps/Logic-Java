package logic_1.hari2.siang;

import java.util.Iterator;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("For");
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
		
		System.out.println("Nested For");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("i: "+i+" j: "+j);
			}
		}
		System.out.println();
		System.out.println("Access Array/For Each");
		int[] n = {1,2,3,4,5};
		//collection /for each
		for (int i : n) {
			System.out.println(i);
		}
		System.out.println();
		for (int i = 0; i < n.length; i++) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("While");
		int a = 0;
		while(a < 5) {
			System.out.println(a);
			a++;
		}
		
		
		int b = 5; int c = 5;
		System.out.println();
		System.out.println(++b);
		System.out.println(b);
		System.out.println();
		System.out.println(c++);
		System.out.println(c);
		
		System.out.println();
		System.out.println("Do While");
		int a1 = 0;
		
		do {
			System.out.println(a1);
			a1++;
		}while(a1 <5);
		
		
	}

}
